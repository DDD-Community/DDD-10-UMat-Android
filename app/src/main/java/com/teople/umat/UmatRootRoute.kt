package com.teople.umat

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.teople.onboarding.ui.OnBoardingScreen
import com.teople.umat.feature.search.SearchScreen
import com.teople.umat.navigator.NavRoute

@Composable
fun UmatRootRoute(
    navController: NavHostController = rememberNavController(),
    sharedTitle: String?
) {
    NavHost(
        modifier = Modifier,
        navController = navController,
        startDestination = NavRoute.Main.direction
    ) {

        composable(NavRoute.Onboarding.direction) {
            OnBoardingScreen(
                actionRoute = {
                    navController.navigate(it.direction)
                }
            )
        }

        composable(NavRoute.Main.direction) {
            MainScreen(
                actionRoute = {
                    navController.navigate(it.direction)
                },
                sharedTitle = sharedTitle
            )
        }

        composable(NavRoute.Search.direction) {
            SearchScreen(
                actionItemClick = { item ->
//                    navController.navigate()
                },
                actionBackPress = {
                    navController.popBackStack()
                }
            )
        }

        composable(NavRoute.SharedTitleSearch.direction) {
            SearchScreen(
                actionItemClick = { item ->
//                    navController.navigate()
                },
                actionBackPress = {
                    navController.popBackStack()
                },
                sharedTitle = sharedTitle
            )
        }
    }
}