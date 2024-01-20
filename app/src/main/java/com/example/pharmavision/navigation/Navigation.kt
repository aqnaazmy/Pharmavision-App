package com.example.pharmavision.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.pharmavision.component.BottomNav

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navigation() {
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        val navController = rememberNavController()
        Scaffold (
            bottomBar = {
                BottomNav(navController = navController)
            }
        ) { it
            MyNavHost(
                navHostController = navController,
                startDestination = ScreenName.Home.rout)
        }
    }
}