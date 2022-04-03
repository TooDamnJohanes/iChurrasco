package com.example.ichurrasco.screens.splash_screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun SplashScreen(
    navController: NavController
) {

}

@Composable
@Preview
fun SplashScreenPreview() {
    val navController = rememberNavController()
    SplashScreen(
        navController = navController
    )
}