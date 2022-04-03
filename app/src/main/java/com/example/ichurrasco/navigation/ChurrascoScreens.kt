package com.example.ichurrasco.navigation

import com.example.ichurrasco.utils.Constants.DELIMITER
import com.example.ichurrasco.utils.Constants.ROUTE_NOT_FOUND
import java.lang.IllegalArgumentException

enum class ChurrascoScreens {
    SplashScreen,
    LoginScreen,
    HomeScreen,
    InfoScreen;

    companion object {
        fun fromRoute(route: String?): ChurrascoScreens
                = when(route?.substringBefore(DELIMITER)) {
            SplashScreen.name -> SplashScreen
            LoginScreen.name -> LoginScreen
            HomeScreen.name -> HomeScreen
            InfoScreen.name -> InfoScreen
            null -> HomeScreen
            else -> throw IllegalArgumentException(ROUTE_NOT_FOUND)
        }
    }
}
