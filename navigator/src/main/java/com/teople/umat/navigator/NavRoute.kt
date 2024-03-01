package com.teople.umat.navigator

sealed class NavRoute(
    val direction: String
) {

    data object Onboarding: NavRoute(
        NavDirection.ROUTE_ONBOARDING
    )

    data object Main: NavRoute(
        NavDirection.ROUTE_MAIN
    )

    data object Search: NavRoute(
        NavDirection.ROUTE_SEARCH
    )
}