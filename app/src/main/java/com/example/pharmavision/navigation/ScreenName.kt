package com.example.pharmavision.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.DateRange
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class ScreenName(
    val rout: String,
    val imageVactor: ImageVector,
    val label: String
){
    object Home : ScreenName(
        rout = NavCons.home,
        label = "Home",
        imageVactor = Icons.Rounded.Home
    )
    object Maps : ScreenName(
        rout = NavCons.Maps,
        label = "Maps",
        imageVactor = Icons.Rounded.LocationOn
    )
    object Shoop : ScreenName(
        rout = NavCons.Shoop,
        label = "Shoop",
        imageVactor = Icons.Rounded.ShoppingCart
    )
    object Reminder : ScreenName(
        rout = NavCons.Reminder,
        label = "Reminder",
        imageVactor = Icons.Rounded.DateRange
    )
    object Profile : ScreenName(
        rout = NavCons.Profile,
        label = "Profile",
        imageVactor = Icons.Rounded.Person
    )
}

object NavCons{
    const val home = "home"
    const val Maps = "Maps"
    const val Shoop = "Shoop"
    const val Reminder = "Reminder"
    const val Profile = "Profile"
}