package com.teople.umat.component.widget.component

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.teople.umat.component.ui.theme.Black
import com.teople.umat.component.ui.theme.Gray200
import com.teople.umat.component.ui.theme.Gray500
import com.teople.umat.component.ui.theme.Orange500
import com.teople.umat.component.ui.theme.UmatTheme
import com.teople.umat.component.ui.theme.White
import com.teople.umat.component.widget.preview.UmatPreview

/**
 * Umat Component Label
 *
 * @param title 라벨 텍스트 타이틀
 *
 * @param style
 * - filled, outlined 선택 (filled 일때 backgroundColor 필수)
 * - 기본적으로 디자인시스템 색상 & 정책을 따르지만 별도로 커스텀 가능하도록 열어둠
 *
 * @param paddingValues 외부 패딩
 * @param onActionClick 클릭 액션
 */
@Composable
fun UmatBadge(
    title: String,
    style: UmatBadgeStyle,
    paddingValues: PaddingValues = PaddingValues(0.dp),
    onActionClick: (() -> Unit)? = null
) {
    Text(
        modifier = when (style.type().value) {
            UmatBadgeType.FILLED -> modifierFilled(
                paddingValues = paddingValues,
                backgroundColor = style.backgroundColor().value
            )

            UmatBadgeType.OUTLINED -> modifierOutlined(
                paddingValues = paddingValues,
                backgroundColor = style.backgroundColor().value,
                borderColor = style.borderColor().value
            )
        }.clickable {
            onActionClick?.invoke()
        },
        text = title,
        textAlign = TextAlign.Center,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        color = style.textColor().value,
        style = UmatTheme.typography.pretendardSemiBold12
    )
}

@Stable
object UmatBadgeDefaults {

    @Composable
    fun Filled(
        backgroundColor: Color,
        textColor: Color = White
    ): UmatBadgeStyle {
        return UmatBadgeStyleDefault(
            borderColor = backgroundColor,
            backgroundColor = backgroundColor,
            textColor = textColor,
            type = UmatBadgeType.FILLED
        )
    }

    @Composable
    fun Outlined(
        borderColor: Color = Gray200,
        backgroundColor: Color = White,
        textColor: Color = Gray500
    ): UmatBadgeStyle {
        return UmatBadgeStyleDefault(
            borderColor = borderColor,
            backgroundColor = backgroundColor,
            textColor = textColor,
            type = UmatBadgeType.OUTLINED
        )
    }
}

@Stable
enum class UmatBadgeType {
    FILLED, OUTLINED
}

interface UmatBadgeStyle {

    @Composable
    fun borderColor(): State<Color>

    @Composable
    fun backgroundColor(): State<Color>

    @Composable
    fun textColor(): State<Color>

    @Composable
    fun type(): State<UmatBadgeType>
}

@Immutable
private data class UmatBadgeStyleDefault(
    val borderColor: Color,
    val backgroundColor: Color,
    val textColor: Color,
    val type: UmatBadgeType
) : UmatBadgeStyle {

    @Composable
    override fun borderColor(): State<Color> {
        return rememberUpdatedState(newValue = borderColor)
    }

    @Composable
    override fun backgroundColor(): State<Color> {
        return rememberUpdatedState(newValue = backgroundColor)
    }

    @Composable
    override fun textColor(): State<Color> {
        return rememberUpdatedState(newValue = textColor)
    }

    @Composable
    override fun type(): State<UmatBadgeType> {
        return rememberUpdatedState(newValue = type)
    }
}

private fun modifierFilled(
    paddingValues: PaddingValues,
    backgroundColor: Color
) = Modifier
    .padding(paddingValues)
    .defaultBackground(backgroundColor)
    .defaultInnerPadding()

private fun modifierOutlined(
    paddingValues: PaddingValues,
    borderColor: Color,
    backgroundColor: Color
) = Modifier
    .padding(paddingValues)
    .border(
        width = 1.dp,
        color = borderColor,
        shape = RoundedCornerShape(6.dp)
    )
    .defaultBackground(backgroundColor)
    .defaultInnerPadding()

private fun Modifier.defaultInnerPadding(): Modifier = this.padding(
    vertical = 4.dp,
    horizontal = 12.dp
)

private fun Modifier.defaultBackground(color: Color): Modifier = this.background(
    color = color,
    shape = RoundedCornerShape(6.dp)
)

@Preview(group = "UmatBadge")
@Preview(group = "UmatBadge", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun UmatBadgePreview() {
    UmatPreview {
        Column(
            modifier = Modifier.padding(24.dp)
        ) {
            // Filled
            UmatBadge(
                title = "Label",
                style = UmatBadgeDefaults.Outlined()
            )

            // Outline
            UmatBadge(
                title = "Label",
                style = UmatBadgeDefaults.Filled(
                    backgroundColor = when (isSystemInDarkTheme()) {
                        true -> Orange500
                        false -> Black
                    }
                ),
                paddingValues = PaddingValues(
                    top = 8.dp
                )
            )
        }
    }
}
