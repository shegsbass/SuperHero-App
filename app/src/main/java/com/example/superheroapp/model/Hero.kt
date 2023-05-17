package com.example.superheroapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hero(
    @StringRes
    val heroName: Int,
    @StringRes
    val heroDesc: Int,
    @DrawableRes
    val heroImageResource: Int

)
