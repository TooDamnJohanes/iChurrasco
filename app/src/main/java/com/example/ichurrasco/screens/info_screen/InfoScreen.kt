package com.example.ichurrasco.screens.info_screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun InfoScreen(
    navController: NavController
) {

}

@Preview
@Composable
fun InfoScreenPreview() {
    val navController = rememberNavController()
    InfoScreen(
        navController = navController
    )
}