package com.teople.umat.component.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.teople.umat.component.R

internal val lineSeedFamily = FontFamily(
    Font(R.font.font_line_seed_bold, FontWeight.Bold),
    Font(R.font.font_line_seed_regular, FontWeight.Normal)
)

internal val pretendardFamily = FontFamily(
    Font(R.font.font_pretendard_bold, FontWeight.Bold),
    Font(R.font.font_pretendard_semibold, FontWeight.SemiBold),
    Font(R.font.font_pretendard_medium, FontWeight.Medium),
    Font(R.font.font_pretendard_regular, FontWeight.Normal)
)

/**
 * 디자인에서 제공 받은 한정된 폰트만 재구성해서 사용
 */
data class UmatTypography(
    // LineSeed Bold
    val lineSeedBold20: TextStyle = TextStyle(
        fontFamily = lineSeedFamily,
        fontWeight = FontWeight.Bold,
        lineHeight = 30.sp,
        fontSize = 20.sp
    ),
    val lineSeedBold18: TextStyle = TextStyle(
        fontFamily = lineSeedFamily,
        fontWeight = FontWeight.Bold,
        lineHeight = 24.sp,
        fontSize = 18.sp
    ),
    val lineSeedBold16: TextStyle = TextStyle(
        fontFamily = lineSeedFamily,
        fontWeight = FontWeight.Bold,
        lineHeight = 24.sp,
        fontSize = 16.sp
    ),
    val lineSeedBold12: TextStyle = TextStyle(
        fontFamily = lineSeedFamily,
        fontWeight = FontWeight.Bold,
        lineHeight = 16.sp,
        fontSize = 12.sp
    ),
    // LineSeed Regular
    val lineSeedRegular14: TextStyle = TextStyle(
        fontFamily = lineSeedFamily,
        fontWeight = FontWeight.Bold,
        lineHeight = 24.sp,
        fontSize = 14.sp
    ),
    // Pretendard Bold
    val pretendardBold16: TextStyle = TextStyle(
        fontFamily = pretendardFamily,
        fontWeight = FontWeight.Bold,
        lineHeight = 24.sp,
        fontSize = 16.sp
    ),
    val pretendardBold12: TextStyle = TextStyle(
        fontFamily = pretendardFamily,
        fontWeight = FontWeight.Bold,
        lineHeight = 14.sp,
        fontSize = 12.sp
    ),
    // Pretendard SemiBold
    val pretendardSemiBold18: TextStyle = TextStyle(
        fontFamily = pretendardFamily,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 24.sp,
        fontSize = 18.sp
    ),
    val pretendardSemiBold16: TextStyle = TextStyle(
        fontFamily = pretendardFamily,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 24.sp,
        fontSize = 16.sp
    ),
    val pretendardSemiBold14: TextStyle = TextStyle(
        fontFamily = pretendardFamily,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 20.sp,
        fontSize = 14.sp
    ),
    val pretendardSemiBold12: TextStyle = TextStyle(
        fontFamily = pretendardFamily,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 14.sp,
        fontSize = 12.sp
    ),
    // Pretendard Medium
    val pretendardMedium16: TextStyle = TextStyle(
        fontFamily = pretendardFamily,
        fontWeight = FontWeight.Medium,
        lineHeight = 24.sp,
        fontSize = 16.sp
    ),
    val pretendardMedium12: TextStyle = TextStyle(
        fontFamily = pretendardFamily,
        fontWeight = FontWeight.Medium,
        lineHeight = 14.sp,
        fontSize = 12.sp
    ),
    // Pretendard Regular
    val pretendardRegular16: TextStyle = TextStyle(
        fontFamily = pretendardFamily,
        fontWeight = FontWeight.Normal,
        lineHeight = 24.sp,
        fontSize = 16.sp
    ),
    val pretendardRegular12: TextStyle = TextStyle(
        fontFamily = pretendardFamily,
        fontWeight = FontWeight.Normal,
        lineHeight = 14.sp,
        fontSize = 12.sp
    )
)

internal val LocalTypography = staticCompositionLocalOf { UmatTypography() }