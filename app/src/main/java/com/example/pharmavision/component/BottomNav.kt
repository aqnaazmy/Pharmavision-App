package com.example.pharmavision.component

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.pharmavision.navigation.ScreenName

@Composable
fun BottomNav(
    navController: NavHostController
) {
    var selectedIndex by remember{
        mutableIntStateOf(0)
    }

    val list = listOf(
        ScreenName.Home,
        ScreenName.Maps,
        ScreenName.Shoop,
        ScreenName.Reminder,
        ScreenName.Profile

    )

    NavigationBar (
        modifier = Modifier.clip(RoundedCornerShape(17.dp))

    ){
        list.forEachIndexed { index, screenName ->
            NavigationBarItem(
                selected = selectedIndex == index,
                onClick = {
                          navController.navigate(screenName.rout)
                    selectedIndex = index
                },
                icon = {
                    Icon(imageVector = screenName.imageVactor, contentDescription = "")
                },
                label = {
                    Text(text = screenName.label)
                },
                alwaysShowLabel = false
                )
        }
    }
    
}