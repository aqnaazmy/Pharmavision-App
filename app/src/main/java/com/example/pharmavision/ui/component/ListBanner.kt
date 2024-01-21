package com.example.pharmavision.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pharmavision.R
import com.example.pharmavision.model.ListCard
import com.example.pharmavision.ui.theme.PharmavisionTheme

@Composable
fun ListBanner(listkard: ListCard, modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier
            .fillMaxSize(),
        
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        ElevatedCard (
            elevation = CardDefaults.cardElevation(
                defaultElevation = 8.dp
            ),
            modifier = Modifier
                .width(190.dp)
                .height(270.dp),

            shape = RoundedCornerShape(16.dp),

        ){
            Column (

            ){
                Image(
                    painter = painterResource(listkard.imgTopCategory),
                    contentDescription = null,
                    contentScale = ContentScale.FillHeight,
                    modifier = modifier
                        .height(155.dp)
                        .fillMaxWidth()
                )
                Column (
                    modifier = Modifier
                        .padding(12.dp)
                ){
                    Text(
                        text = stringResource(listkard.txtTopCategory),
                        overflow = TextOverflow.Clip,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        style = MaterialTheme.typography.bodySmall,
                        modifier = modifier.align(Alignment.CenterHorizontally)
                    )

                }

//                Column (
//                    modifier = Modifier
//                        .padding(10.dp)
//                ){
//                    Text(
//                        text = "Pertolongan pertama saat asma",
//                        fontSize = 14.sp,
//                        fontWeight = FontWeight.Bold,
//                        fontFamily = FontFamily.Serif)
//                    Text(
//                        text = "Ketika asma anda kambuh, seringkali hal tersebut membuat anda kesakitan",
//                        modifier = Modifier.padding(top = 8.dp),
//                        color = Color.LightGray,
//                        fontSize = 10.sp,
//                        maxLines = 2,
//
//                    )
//                }

            }

        }

    }

}

@Preview
@Composable
fun ListBannerPreview() {
    PharmavisionTheme {
        ListBanner(listkard = ListCard(R.drawable.card1, R.string.txt_sakit_asma))
    }
}