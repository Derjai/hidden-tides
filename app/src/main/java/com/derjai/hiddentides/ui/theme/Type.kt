package com.derjai.hiddentides.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.derjai.hiddentides.R

// Set of Material typography styles to start with

val LibreBaskerville = FontFamily(
    Font(R.font.libre_baskerville_regular, FontWeight.Normal),
    Font(R.font.libre_baskerville_bold, FontWeight.Bold)
)

val PirataOne = FontFamily(
    Font(R.font.pirata_one_regular, FontWeight.Normal)
)

val MerriweatherSans = FontFamily(
    Font(R.font.merriweather_sans_regular, FontWeight.Normal),
    Font(R.font.merriweather_sans_bold, FontWeight.Bold)
)
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = LibreBaskerville,
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp,
        color = BlueDeep
    ),
    displayMedium = TextStyle(
        fontFamily = LibreBaskerville,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
        color = MidnightBlue
    ),
    displaySmall = TextStyle(
        fontFamily = LibreBaskerville,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        color = GrayDarkBlue
    ),
    headlineLarge = TextStyle(
        fontFamily = MerriweatherSans,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        color = CoralRed
    ),
    headlineMedium = TextStyle(
        fontFamily = MerriweatherSans,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        color = BlueDeep
    ),
    headlineSmall = TextStyle(
        fontFamily = MerriweatherSans,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        color = NeutralWhite
    ),
    bodyLarge = TextStyle(
        fontFamily = MerriweatherSans,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        color = NeutralWhite
    ),
    bodyMedium = TextStyle(
        fontFamily = MerriweatherSans,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        color = NeutralWhite
    ),
    bodySmall = TextStyle(
        fontFamily = MerriweatherSans,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        color = GrayDarkBlue
    ),
    labelLarge = TextStyle(
        fontFamily = PirataOne,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        color = CoralRed
    ),
    labelMedium = TextStyle(
        fontFamily = PirataOne,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        color = MidnightBlue
    ),
    labelSmall = TextStyle(
        fontFamily = PirataOne,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp,
        color = NeutralWhite
    ),
)