package com.teople.umat.route

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.teople.onboarding.ui.OnBoardingScreen
import com.teople.umat.screen.MainScreen
import com.teople.umat.feature.search.SearchScreen
import com.teople.umat.navigator.NavArgument
import com.teople.umat.navigator.NavRoute

@Composable
fun UmatRootRoute(
    navController: NavHostController = rememberNavController(),
    sharedTitle: String? = null
) {
    var sharedQuery by rememberSaveable {
        mutableStateOf(sharedTitle)
    }

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

        composable(
            route = "${NavRoute.Main.direction}?placeId={placeId}",
            arguments = listOf(navArgument(NavArgument.ARGUMENT_PLACE_ID) {
                defaultValue = ""
            })
        ) {
            MainScreen(
                actionRoute = {
                    navController.navigate(it.direction)
                },
                sharedTitle = sharedQuery,
                actionBackPress = {
                    navController.popBackStack()
                }
            )
        }

        composable(NavRoute.Search.direction) {
            SearchScreen(
                sharedQuery = sharedQuery,
                actionSharedQueryDone = {
                    sharedQuery = null
                },
                actionItemClick = { item ->
                    navController.navigate("${NavRoute.Main.direction}?placeId=${item.id}")
                },
                actionBackPress = {
                    navController.popBackStack()
                },
            )
        }
    }
}