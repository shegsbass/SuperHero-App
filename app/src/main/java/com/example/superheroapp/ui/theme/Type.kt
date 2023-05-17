package com.example.superheroapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.superheroapp.R

// Set of Material typography styles to start with
val carbinFont = FontFamily(
    Font(R.font.cabin_bold),
    Font(R.font.cabin_regular)
)
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = carbinFont,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp
    ),
    displayMedium = TextStyle(
        fontFamily = carbinFont,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    labelSmall = TextStyle(
        fontFamily = carbinFont,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = carbinFont,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)