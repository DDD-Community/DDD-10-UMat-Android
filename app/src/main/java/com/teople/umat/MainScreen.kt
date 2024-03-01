package com.teople.umat

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.google.gson.Gson
import com.teople.umat.component.icon.UmatIcon
import com.teople.umat.component.icon.umaticon.IcAddFilled
import com.teople.umat.component.icon.umaticon.IcHomeOutlined
import com.teople.umat.component.icon.umaticon.IcMyOutlined
import com.teople.umat.component.ui.theme.Gray300
import com.teople.umat.component.ui.theme.Gray400
import com.teople.umat.component.ui.theme.Gray700
import com.teople.umat.component.ui.theme.Gray900
import com.teople.umat.component.ui.theme.UmatTheme
import com.teople.umat.component.ui.theme.UmatTypography
import com.teople.umat.component.widget.component.UmatSelectBottomSheet
import com.teople.umat.core.data.entity.CoreGooglePlacesDetailEntity
import com.teople.umat.feature.home.HomeScreen
import com.teople.umat.feature.mypage.MypageScreen
import com.teople.umat.navigator.NavArgument
import com.teople.umat.navigator.NavRoute
import com.teople.umat.screen.AddPlaceBottomSheet
import com.teople.umat.screen.AddPlaceViewModel
import com.teople.umat.screen.GuideDialog

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    viewModel: MainViewModel = hiltViewModel(),
    actionRoute: (route: NavRoute) -> Unit,
    sharedTitle: String? = null,
    actionBackPress: () -> Unit
) {
    val navController = rememberNavController()
    val viewState by viewModel.viewState.collectAsStateWithLifecycle()

    Scaffold(
        // enableEdgeToEdge 로 인한 바텀 네비게이션 영역 패딩 필요
        modifier = Modifier.navigationBarsPadding(),
        bottomBar = {
            UmatBottomBar(navController = navController)
        },
    ) { innerPadding ->
        NavHost(
            modifier = Modifier
                .padding(
                    // 탭 스크린 내부 UI 패딩 필요
                    bottom = innerPadding.calculateBottomPadding()
                ),
            navController = navController,
            startDestination = BottomNavItem.Home.screenRoute,
        ) {
            composable(
                route = "${BottomNavItem.Home.screenRoute}?selectedPlace={selectedPlace}",
                arguments = listOf(navArgument(NavArgument.ARGUMENT_SELECTED_PLACE) {
                    nullable = true
                    defaultValue = null
                })
            ) {
                HomeScreen(
                    actionRoute = {
                        actionRoute(it)
                    },
                    sharedTitle = sharedTitle
                )
            }
            composable(BottomNavItem.MyPage.screenRoute) {
                MypageScreen(
                    onNavigator = {}
                )
            }
        }

        when {
            viewState.isShownGuide.not() -> {
                GuideDialog(
                    onDismissRequest = {
                        viewModel.setShownGuideDialog()
                    }
                )
            }

            viewState.selectedPlace != null -> {
                UmatSelectBottomSheet(
                    title = stringResource(id = R.string.main_select_place_bottom_sheet_title),
                    content = {
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data(
                                    viewState.selectedPlace?.photoUrl?.ifEmpty {
                                        com.teople.umat.component.R.drawable.ic_place_holder
                                    }
                                )
                                .crossfade(true)
                                .build(),
                            placeholder = painterResource(id = com.teople.umat.component.R.drawable.ic_place_holder),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(85.dp)
                                .clip(CircleShape)
                        )

                        Text(
                            modifier = Modifier
                                .padding(
                                    vertical = 16.dp
                                ),
                            text = viewState.selectedPlace?.displayName?.text ?: "",
                            style = UmatTheme.typography.pretendardSemiBold16.copy(
                                color = Gray900
                            )
                        )
                    },
                    positiveText = stringResource(id = R.string.main_select_place_bottom_sheet_positive),
                    negativeText = stringResource(id = R.string.main_select_place_bottom_sheet_negative),
                    actionPositive = {
                        // 추가하기
                        navController.navigate(
                            route = "${BottomNavItem.Home.screenRoute}?selectedPlace=${Gson().toJson(viewState.selectedPlace)}"
                        )
                    },
                    actionNegative = {
                        // 뒤로가기, 바텀시트 종료
                        viewModel.removeSelectedPlace()
                        actionBackPress()
                    }
                )
            }
        }
    }
}

@Composable
fun UmatBottomBar(
    navController: NavHostController
) {
    val navStackBackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navStackBackEntry?.destination
    var shouldShowBottomSheet by remember { mutableStateOf(false) }

    val context = LocalContext.current
    val addPlaceViewModel = AddPlaceViewModel(context)

    Divider(color = Gray300, modifier = Modifier.zIndex(3f))
    Row(
        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
            .height(80.dp)
            .zIndex(2f),
        verticalAlignment = Alignment.Top
    ) {
        BottomNavButton(
            screen = BottomNavItem.Home,
            currentDestination = currentDestination,
            navController = navController
        )
        IconButton(
            modifier = Modifier.weight(1f),
            onClick = { shouldShowBottomSheet = true }
        ) {
            Icon(
                imageVector = UmatIcon.IcAddFilled,
                contentDescription = "icon",
                modifier = Modifier
                    .align(Alignment.Top)
                    .padding(top = 6.dp)
                    .size(64.dp)
            )
        }
        BottomNavButton(
            screen = BottomNavItem.MyPage,
            currentDestination = currentDestination,
            navController = navController
        )
    }
    if (shouldShowBottomSheet) {
        AddPlaceBottomSheet(
            onDismissRequest = {
                shouldShowBottomSheet = false
            },
            addPlaceViewModel = addPlaceViewModel
        )
    }
}

@Composable
fun RowScope.BottomNavButton(
    screen: BottomNavItem,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    val selected = currentDestination?.hierarchy?.any { it.route == screen.screenRoute } == true
    val contentColor = if (selected) Gray700 else Gray400

    Box(
        modifier = Modifier
            .fillMaxSize()
            .clickable(
                onClick = {
                    if (!selected) {
                        navController.navigate(screen.screenRoute) {
                            popUpTo(navController.graph.findStartDestination().id)
                            launchSingleTop = true
                        }
                    }
                })
            .padding(bottom = 14.dp)
            .weight(1f)
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = screen.icon,
                contentDescription = "icon",
                tint = contentColor,
                modifier = Modifier
                    .size(24.dp)
            )
            Text(
                text = stringResource(id = screen.title),
                style = UmatTypography().pretendardMedium12.copy(
                    color = contentColor
                )
            )
        }
    }
}

sealed class BottomNavItem(
    val title: Int, val icon: ImageVector, val screenRoute: String
) {
    object Home : BottomNavItem(R.string.home, UmatIcon.IcHomeOutlined, HOME)
    object MyPage : BottomNavItem(R.string.my_page, UmatIcon.IcMyOutlined, MY_PAGE)

    companion object {
        const val HOME = "HOME"
        const val MY_PAGE = "MY_PAGE"
    }
}

@Preview
@Composable
fun BottomNavItem() {
    UmatBottomBar(navController = rememberNavController())
}
