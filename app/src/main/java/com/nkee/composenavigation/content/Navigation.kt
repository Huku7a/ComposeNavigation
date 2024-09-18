package com.nkee.composenavigation.content

import androidx.compose.runtime.Composable
import androidx.navigation.NavType.Companion.StringType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.nkee.composenavigation.content.screens.HomeScreen
import com.nkee.composenavigation.content.screens.ProfileScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable (route = Screen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Profile.route + "/{name}",
            arguments = listOf(
                navArgument("name") {
                    type = StringType
                    nullable = true
                    defaultValue = null
                },
            ),
        ) {
            ProfileScreen(name = it.arguments?.getString("name"))
        }
    }
}