package com.example.pharmavision.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pharmavision.R
import com.example.pharmavision.model.ListCategory
import com.example.pharmavision.ui.theme.PharmavisionTheme

@Composable
fun ListTopCategory(listKategori : ListCategory, modifier: Modifier = Modifier) {
    Column {
        Image(
            painter = painterResource(listKategori.imgTopCategory),
            contentDescription = null,
            contentScale = ContentScale.FillHeight,
            modifier = modifier
                .align(Alignment.CenterHorizontally)
                .size(70.dp)
        )
        Text(
            text = stringResource(listKategori.txtTopCategory),
            overflow = TextOverflow.Clip,
            style = MaterialTheme.typography.bodySmall,
            modifier = modifier.align(Alignment.CenterHorizontally)
        )

    }

}

@Preview
@Composable
fun ListKategoriPreview() {
    PharmavisionTheme {
        ListTopCategory(listKategori = ListCategory(R.drawable.layanan_obat, R.string.txt_info_obat),
            modifier = Modifier.padding(8.dp))
    }
}