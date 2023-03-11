package com.example.bikinibottomcaffe.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(startRoute: String){
    val navController= rememberNavController()
    NavHost(
        navController = navController,
        startDestination = startRoute
    ){
        composable(route = Screen.MainScreen.route){
            TODO()
        }
        composable(route= Screen.CartScreen.route){
            TODO()
        }
        composable(route = Screen.LoginScreen.route){
            TODO()
        }
        composable(route=Screen.OrdersScreen.route){
            TODO()
        }
    }
}
