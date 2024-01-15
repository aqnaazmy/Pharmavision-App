package com.example.pharmavision.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.pharmavision.R

data class ListCategory(@DrawableRes val imgTopCategory: Int, @StringRes val txtTopCategory: Int)

val dummyListTopCategory = listOf(
    R.drawable.layanan_semua to R.string.txt_semua,
    R.drawable.layanan_konsultasi to R.string.txt_konsultasi,
    R.drawable.layanan_obat to R.string.txt_info_obat,
    R.drawable.layanan_penyakit to R.string.txt_info_penyakit,
).map { ListCategory(it.first, it.second) }