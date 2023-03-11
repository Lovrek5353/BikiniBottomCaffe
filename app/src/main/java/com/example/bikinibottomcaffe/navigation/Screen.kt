package com.example.bikinibottomcaffe.navigation

sealed class Screen(val route: String){
    object MainScreen: Screen("main")
    object CartScreen: Screen("cart")
    object LoginScreen: Screen("login")
    object OrdersScreen: Screen("orders")
}
