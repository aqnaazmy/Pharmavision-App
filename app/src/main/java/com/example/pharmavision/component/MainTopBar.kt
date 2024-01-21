package com.example.pharmavision.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pharmavision.ui.theme.PharmavisionTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopBar( modifier : Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp, top = 16.dp, bottom = 30.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min)
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
//            Icon(
//                imageVector = Icons.Outlined.Menu,
//                contentDescription = null,
//                tint = Color.White
//            )

            Text(
                text = "Welcome Back Aqna!",
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp, end = 0.dp),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    color = Color.White
                )
            )

            Icon(
                imageVector = Icons.Outlined.Notifications,
                contentDescription = null,
                tint = Color.White
            )
        }
    }

}

@Preview
@Composable
fun MainToBparPreview() {
    PharmavisionTheme {
        MainTopBar()
    }
}