package com.teople.umat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.naver.maps.map.NaverMapSdk
import com.naver.maps.map.compose.ExperimentalNaverMapApi
import com.naver.maps.map.compose.NaverMap
import com.teople.umat.ui.theme.UmatTheme

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
                    Home()
                }
                composable(BottomNavItem.Daily.screenRoute) {
                    Daily()
                }
                composable(BottomNavItem.MyPage.screenRoute) {
                    MyPage()
                }
            }
        }
    }

    @OptIn(ExperimentalNaverMapApi::class)
    @Composable
    fun Home() {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background,
        ) {
            NaverMap(
                modifier = Modifier.fillMaxSize()
            )
        }
    }

    @Composable
    fun Daily() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Red)
        ) {
            Text(
                text = "Daily",
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Center,
                color = Color.White,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }

    @Composable
    fun MyPage() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.DarkGray)
        ) {
            Text(
                text = "MyPage",
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Center,
                color = Color.White,
                modifier = Modifier.align(Alignment.Center)
            )
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