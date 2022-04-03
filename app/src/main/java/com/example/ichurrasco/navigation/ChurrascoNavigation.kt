package com.example.ichurrasco.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.example.ichurrasco.screens.home_screen.HomeScreen
import com.example.ichurrasco.screens.info_screen.InfoScreen
import com.example.ichurrasco.screens.login_screen.LoginScreen
import com.example.ichurrasco.screens.splash_screen.SplashScreen

@Composable
fun ChurrascoNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ChurrascoScreens.SplashScreen.name
    ) {
        composable(ChurrascoScreens.SplashScreen.name) {
            SplashScreen(
                navController = navController
            )
        }

        composable(ChurrascoScreens.LoginScreen.name) {
            LoginScreen(
                navController = navController
            )
        }

        composable(ChurrascoScreens.HomeScreen.name) {
            HomeScreen(
                navController = navController
            )
        }

        composable(ChurrascoScreens.InfoScreen.name) {
            InfoScreen(
                navController = navController
            )
        }
    }
}