package com.example.pharmavision.component

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.pharmavision.ui.theme.PharmavisionTheme

@Composable
fun CardBanner() {
    Column {
        Card {

        }
    }
}


@Preview
@Composable
fun CardBannerPreview() {
    PharmavisionTheme {
        CardBanner()
    }
}