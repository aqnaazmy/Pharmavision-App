package com.example.pharmavision.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.pharmavision.ui.Main.Home.HomeScreen
import com.example.pharmavision.ui.Main.Maps.MapsScreen
import com.example.pharmavision.ui.Main.Profile.ProfileScreen
import com.example.pharmavision.ui.Main.Rminder.ReminderScreen
import com.example.pharmavision.ui.Main.Shoop.ShoopScreen

@Composable
fun MyNavHost(
    navHostController: NavHostController,
    startDestination: String,
) {

    NavHost(
        navController = navHostController,
        startDestination = startDestination,
        builder = {
            composable(NavCons.home){
                HomeScreen()
            }
            composable(NavCons.Maps){
                MapsScreen()
            }
            composable(NavCons.Shoop){
                ShoopScreen()
            }
            composable(NavCons.Reminder){
                ReminderScreen()
            }
            composable(NavCons.Profile){
                ProfileScreen()
            }
        })
}
