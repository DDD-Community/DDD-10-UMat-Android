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
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material3.Divider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.teople.umat.component.icon.UmatIcon
import com.teople.umat.component.icon.umaticon.IcAddFilled
import com.teople.umat.component.icon.umaticon.IcHomeOutlined
import com.teople.umat.component.icon.umaticon.IcMyOutlined
import com.teople.umat.component.ui.theme.Gray300
import com.teople.umat.component.ui.theme.Gray400
import com.teople.umat.component.ui.theme.Gray700
import com.teople.umat.component.ui.theme.UmatTypography
import com.teople.umat.feature.home.HomeScreen
import com.teople.umat.feature.mypage.MypageScreen
import com.teople.umat.navigator.NavRoute
import com.teople.umat.screen.AddPlaceBottomSheet
import com.teople.umat.screen.AddPlaceViewModel
import com.teople.umat.screen.GuideDialog

@Composable
fun MainScreen(
    actionRoute: (route: NavRoute) -> Unit,
    sharedTitle: String? = null
) {
    val navController = rememberNavController()
    var showDialog by rememberSaveable { mutableStateOf(true) }

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
            composable(BottomNavItem.Home.screenRoute) {
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
    }

    if (showDialog) {
        GuideDialog(
            onDismissRequest = {
                showDialog = false
            }
        )
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
