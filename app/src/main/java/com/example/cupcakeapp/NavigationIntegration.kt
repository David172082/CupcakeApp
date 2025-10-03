package com.example.cupcakeapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun CupcakeAppNav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "start") {
        composable("start") { /* TODO: Start screen */ }
        composable("flavors") { /* TODO: Flavor screen */ }
    }
}
