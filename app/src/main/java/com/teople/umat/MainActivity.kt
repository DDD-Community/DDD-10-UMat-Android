package com.teople.umat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.naver.maps.map.NaverMapSdk
import com.teople.umat.feature.daily.DailyScreen
import com.teople.umat.feature.home.HomeScreen
import com.teople.umat.feature.mypage.MypageScreen
import com.teople.umat.component.ui.theme.UmatTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    val items = listOf<BottomNavItem>(
        BottomNavItem.Home,
        BottomNavItem.Daily,
        BottomNavItem.MyPage
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        NaverMapSdk.getInstance(this).client =
            NaverMapSdk.NaverCloudPlatformClient(BuildConfig.NAVER_MAP_API_KEY)
        setContent {
            UmatTheme {
                MainScreen()
            }
        }
    }

    @Composable
    fun MainScreen() {
        val navController = rememberNavController()
        Scaffold(
            bottomBar = {
                BottomNavigation {
                    val navBackStackEntry by navController.currentBackStackEntryAsState()
                    val currentDestination = navBackStackEntry?.destination
                    items.forEach { bottomNavItem ->
                        BottomNavigationItem(
                            icon = {
                                Icon(
                                    painter = painterResource(id = bottomNavItem.icon),
                                    modifier = Modifier
                                        .width(26.dp)
                                        .height(26.dp),
                                    contentDescription = stringResource(id = bottomNavItem.title)
                                )
                            },
                            selected = currentDestination?.hierarchy?.any { bottomNavItem.screenRoute == it.route } == true,
                            onClick = {
                                navController.navigate(bottomNavItem.screenRoute) {
                                    popUpTo(navController.graph.findStartDestination().id) {
                                        saveState = true
                                    }

                                    launchSingleTop = true
                                    restoreState = true
                                }
                            }
                        )
                    }
                }
            }
        ) { innerPadding ->
            NavHost(
                navController = navController,
                startDestination = BottomNavItem.Home.screenRoute,
                Modifier.padding(innerPadding)
            ) {
                composable(BottomNavItem.Home.screenRoute) {
                    HomeScreen()
                }
                composable(BottomNavItem.Daily.screenRoute) {
                    DailyScreen()
                }
                composable(BottomNavItem.MyPage.screenRoute) {
                    MypageScreen(
                        onNavigator = {}
                    )
                }
            }
        }
    }

    sealed class BottomNavItem(
        val title: Int, val icon: Int, val screenRoute: String
    ) {
        object Home : BottomNavItem(R.string.home, R.drawable.ic_home, HOME)
        object Daily : BottomNavItem(R.string.daily, R.drawable.ic_daily, DAILY)
        object MyPage : BottomNavItem(R.string.my_page, R.drawable.ic_my_page, MY_PAGE)
    }

    companion object {
        const val HOME = "HOME"
        const val DAILY = "DAILY"
        const val MY_PAGE = "MY_PAGE"
    }
}