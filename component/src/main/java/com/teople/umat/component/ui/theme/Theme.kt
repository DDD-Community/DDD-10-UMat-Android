package com.teople.umat.component.ui.theme

import androidx.compose.foundation.Indication
import androidx.compose.foundation.IndicationInstance
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import com.google.accompanist.systemuicontroller.rememberSystemUiController

/**
 * Color, Typography 만 커스텀으로 별도 제공
 * MaterialTheme 내부 코드와 동일
 *
 * 아래와 같이 접근 후 사용
 * UmatTheme.typography.lineSeedBold20
 *
 * 참고 : https://velog.io/@vov3616/Compose-Custom-Theme-%EB%A7%8C%EB%93%A4%EA%B8%B0
 */
object UmatTheme {

    val colorScheme: UmatColors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val typography: UmatTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current
}

/**
 * 커스텀 테마 아래와 같이 기존과 동일하게 사용
 * dynamicColorScheme 은 지원하지 않음
 *
 * UmatTheme {
 *     MainScreen()
 * }
 */
@Composable
fun UmatTheme(
    colorScheme: UmatColors = UmatTheme.colorScheme,
    typography: UmatTypography = UmatTheme.typography,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    // uiMode 에 따른 색상값 리턴
    // FIXME 다크모드를 지원한다면 darkColors() 분기 추가
    val currentThemeColor = when {
        darkTheme -> colorScheme
        else -> colorScheme
    }

    // 색상값 변경 시 Recomposition 대응
    val rememberedColors = remember {
        currentThemeColor.copy()
    }.apply {
        updateColorsFrom(currentThemeColor)
    }

    CompositionLocalProvider(
        LocalColors provides rememberedColors,
        LocalTypography provides typography,
        LocalRippleTheme provides CustomRippleTheme
    ) {
        ProvideTextStyle(value = typography.lineSeedBold20, content = content)
    }

    val systemUiController = rememberSystemUiController()
    val useDarkIcons = !isSystemInDarkTheme()

    LaunchedEffect(
        key1 = systemUiController,
        key2 = useDarkIcons
    ) {
        with(systemUiController) {
            statusBarDarkContentEnabled = true
            setNavigationBarColor(
                color = rememberedColors.background,
                darkIcons = useDarkIcons
            )
        }
    }
}

@Immutable
private object CustomRippleTheme : RippleTheme {

    @Composable
    override fun defaultColor() = Color.Unspecified

    @Composable
    override fun rippleAlpha() = RippleAlpha(
        draggedAlpha = 0.0f,
        focusedAlpha = 0.0f,
        hoveredAlpha = 0.0f,
        pressedAlpha = 0.0f,
    )
}

@Immutable
object CustomIndication: Indication {

    @Immutable
    private class DefaultIndicationInstance(
        private val isPressed: State<Boolean>
    ) : IndicationInstance {
        override fun ContentDrawScope.drawIndication() {
            drawContent()
            if (isPressed.value) {
                drawRect(
                    color = Gray500.copy(
                        alpha = 0.1f
                    ),
                    size = size
                )
            }
        }
    }

    @Composable
    override fun rememberUpdatedInstance(interactionSource: InteractionSource): IndicationInstance {
        val isPressed = interactionSource.collectIsPressedAsState()
        return remember(interactionSource) {
            DefaultIndicationInstance(isPressed)
        }
    }
}
