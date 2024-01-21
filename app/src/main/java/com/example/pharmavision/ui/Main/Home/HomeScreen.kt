package com.example.pharmavision.ui.Main.Home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pharmavision.component.MainTopBar
import com.example.pharmavision.model.ListCard
import com.example.pharmavision.model.dummyListCard
import com.example.pharmavision.model.dummyListTopCategory
import com.example.pharmavision.ui.component.ListBanner
import com.example.pharmavision.ui.component.ListTopCategory
import com.example.pharmavision.ui.component.SectionText
import com.example.pharmavision.ui.theme.BackgroundWhite
import com.example.pharmavision.ui.theme.MainColor
import com.example.pharmavision.ui.theme.PharmavisionTheme

@Composable
fun HomeScreen() {
    val scroll = rememberScrollState()
    Surface(
        modifier = Modifier.verticalScroll(scroll),
        color = MainColor
    ){
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),

        ){
            MainTopBar()
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.onPrimary,
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                    shape = RoundedCornerShape(
                    topEnd = 30.dp,
                    topStart = 30.dp,
                ),
            )
            {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = 40.dp,
                            start = 12.dp,
                            end = 12.dp
                        )
                ) {

                    SectionText(title = "Layanan Medis")
                    LazyRow(
                        modifier = Modifier
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        items(dummyListTopCategory) {
                            ListTopCategory(
                                it,
                                modifier = Modifier
                                    .padding(end = 10.dp)
                            )
                        }
                    }

                    SectionText(title = "Info kesehatan")
                    LazyRow(
                        modifier = Modifier
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.spacedBy(20.dp)
                    ){
                        items(dummyListCard){
                            ListBanner(
                                it,
                            )
                        }
                    }

                }

                }

            }

        }
    }


@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}