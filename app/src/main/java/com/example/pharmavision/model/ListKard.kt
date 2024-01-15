package com.example.pharmavision.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.pharmavision.R

data class ListCard(@DrawableRes val imgTopCategory: Int, @StringRes val txtTopCategory: Int)

val dummyListCard = listOf(
    R.drawable.card1 to R.string.txt_sakit_asma,
    R.drawable.card2 to R.string.txt_sakit_maag,
).map { ListCard(it.first, it.second) }
