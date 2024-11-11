package com.derjai.hiddentides.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val AppColorScheme = darkColorScheme(
    primary = BlueDeep,
    onPrimary = NeutralWhite,
    secondary = MidnightBlue,
    onSecondary = NeutralWhite,
    tertiary = CoralRed,
    onTertiary = NeutralWhite,
    background = BlueDeep,
    onBackground = NeutralWhite,
    surface = BlueDeep,
    onSurface = NeutralWhite,
    outline =  GrayDarkBlue,
    surfaceVariant =  GrayDarkBlue,
    onSurfaceVariant =  GrayDarkBlue,
)

@Composable
fun HiddenTidesTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = AppColorScheme,
        typography = Typography,
        content = content
    )
}