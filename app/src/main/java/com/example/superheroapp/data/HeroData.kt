package com.example.superheroapp.data

import com.example.superheroapp.R
import com.example.superheroapp.model.Hero

object HeroData {
    val heroesDetails = listOf(
        Hero(
            heroName = R.string.hero1,
            heroDesc = R.string.description1,
            heroImageResource = R.drawable.android_superhero1
        ),
        Hero(
            heroName = R.string.hero2,
            heroDesc = R.string.description2,
            heroImageResource = R.drawable.android_superhero2
        ),
        Hero(
            heroName = R.string.hero3,
            heroDesc = R.string.description3,
            heroImageResource = R.drawable.android_superhero3
        ),
        Hero(
            heroName = R.string.hero4,
            heroDesc = R.string.description4,
            heroImageResource = R.drawable.android_superhero4
        ),
        Hero(
            heroName = R.string.hero5,
            heroDesc = R.string.description5,
            heroImageResource = R.drawable.android_superhero5
        ),
        Hero(
            heroName = R.string.hero6,
            heroDesc = R.string.description6,
            heroImageResource = R.drawable.android_superhero6
        ),

    )
}