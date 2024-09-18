package com.nkee.composenavigation.content

sealed class Screen(val route: String) {
    object Home : Screen(route = "home")
    object Profile : Screen(route = "profile")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}