package com.teople.umat.component.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

/**
 * 서비스 디자인 색상은 internal 로 다른 모듈에서 참조할 수 없음
 * UmatTheme.colorScheme.ReactionLove 와 같은 형태로 참조
 */

val Black = Color(0xFF000000)
val White = Color(0xFFFFFFFF)
val Error = Color(0xFFF43F5E)
val Success = Color(0xFF3B82F6)
val Both = Color(0xFFA855F7)

internal val Gradient = Brush.horizontalGradient(
    colors = listOf(
        Color(0xFFFF7E32),
        Color(0xFFA5B4FC)
    )
)

internal val ReactionLove = Color(0xFFFF4949)
internal val ReactionSoso = Color(0xFFFDD842)
internal val ReactionLike = Color(0xFFFF85B9)
internal val ReactionNotGood = Color(0xFF01E39B)

val Gray50 = Color(0xFFF9FAFB)
val Gray100 = Color(0xFFF3F4F6)
val Gray200 = Color(0xFFE5E7EB)
val Gray300 = Color(0xFFD1D5DB)
val Gray400 = Color(0xFF9CA3AF)
val Gray500 = Color(0xFF6B7280)
val Gray600 = Color(0xFF4B5563)
val Gray700 = Color(0xFF374151)
val Gray800 = Color(0xFF1F2937)
val Gray900 = Color(0xFF111827)
val Gray950 = Color(0xFF030712)

val Orange50 = Color(0xFFFFF5EC)
val Orange100 = Color(0xFFFFE9D3)
val Orange200 = Color(0xFFFFCFA5)
val Orange300 = Color(0xFFFFAD6D)
val Orange400 = Color(0xFFFF7E32)
val Orange500 = Color(0xFFFF5B0A)
val Orange600 = Color(0xFFFF4000)
val Orange700 = Color(0xFFCC2B02)
val Orange800 = Color(0xFFA1220B)
val Orange900 = Color(0xFF821F0C)
val Orange950 = Color(0xFF460C04)

val Blue50 = Color(0xFFEEF2FF)
val Blue100 = Color(0xFFE0E7FF)
val Blue200 = Color(0xFFC7D2FE)
val Blue300 = Color(0xFFA5B4FC)
val Blue400 = Color(0xFF818CF8)
val Blue500 = Color(0xFF6366F1)
val Blue600 = Color(0xFF4F46E5)
val Blue700 = Color(0xFF4338CA)
val Blue800 = Color(0xFF3730A3)
val Blue900 = Color(0xFF312E81)
val Blue950 = Color(0xFF1E1B4B)

/**
 * 다크/라이트 모드 색상 디자인이 되지 않았기 때문에 서비스 색상만 적용
 * 그 외 색상은 Blue50 과 같이 직접 참조
 */
class UmatColors(
    reactionLove: Color,
    reactionSoso: Color,
    reactionLike: Color,
    reactionNotGood: Color,
    gradient: Brush,
    isLight: Boolean
) {
    var reactionLove by mutableStateOf(reactionLove)
        private set
    var reactionSoso by mutableStateOf(reactionSoso)
        private set
    var reactionLike by mutableStateOf(reactionLike)
        private set
    var reactionNotGood by mutableStateOf(reactionNotGood)
        private set
    var gradient by mutableStateOf(gradient)
        internal set

    var isLight by mutableStateOf(isLight)
        internal set

    fun copy(
        reactionLove: Color = this.reactionLove,
        reactionSoso: Color = this.reactionSoso,
        reactionLike: Color = this.reactionLike,
        reactionNotGood: Color = this.reactionNotGood,
        gradient: Brush = this.gradient,
        isLight: Boolean = this.isLight
    ): UmatColors = UmatColors(
        reactionLove = reactionLove,
        reactionSoso = reactionSoso,
        reactionLike = reactionLike,
        reactionNotGood = reactionNotGood,
        gradient = gradient,
        isLight = isLight

    )

    fun updateColorsFrom(other: UmatColors) {
        reactionLove = other.reactionLove
        reactionSoso = other.reactionSoso
        reactionLike = other.reactionLike
        reactionNotGood = other.reactionNotGood
        gradient = other.gradient
        isLight = other.isLight
    }
}

fun lightColors(): UmatColors = UmatColors(
    reactionLove = ReactionLove,
    reactionSoso = ReactionSoso,
    reactionLike = ReactionLike,
    reactionNotGood = ReactionNotGood,
    gradient = Gradient,
    isLight = true
)

fun darkColors(): UmatColors = UmatColors(
    reactionLove = ReactionLove,
    reactionSoso = ReactionSoso,
    reactionLike = ReactionLike,
    reactionNotGood = ReactionNotGood,
    gradient = Gradient,
    isLight = false
)

internal val LocalColors = staticCompositionLocalOf { lightColors() }
