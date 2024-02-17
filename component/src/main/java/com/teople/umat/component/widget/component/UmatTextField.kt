package com.teople.umat.component.widget.component

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.teople.umat.component.ui.theme.UmatTheme

/**
 * TODO("좀 더 확인할게 있어서 천천히 개발 / onValueChange 가능")
 */
@Composable
fun UmatTextField(
    fieldText: String,
    topLabel: String,
    supportLabel: String,
    style: UmatTextFieldStyle,
    onValueChange: (String) -> Unit,
) {
    TextField(
        modifier = Modifier.fillMaxWidth(),
        // 상단 라벨
        label = {
            Text(
                text = topLabel
            )
        },
        // 사용자 입력값
        value = fieldText,
        onValueChange = { textValue ->
            onValueChange(textValue)
        },
//        textStyle = inputTextStyle,
        // 색상 : loading, trailing, line 등
//        colors = TextFieldDefaults.textFieldColors(
//            backgroundColor = Color.Transparent,
//        ),
        // 하단 메세지
        isError = false,
        supportingText = {
            // fillMaxWidth() 주고 gravity.END 하면 우측에 붙는지 확인 필요
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = supportLabel
            )
        },
//        keyboardOptions =,
//        keyboardActions =,
        singleLine = true,
        maxLines = 1,
        minLines = 1,
    )
}

/**
 * default : 스타일
 * activated : 스타일
 * enabled : 입력 시 이므로 사용자 입력값 반응
 * error : 사용자 입력값 반응
 * disabled : 스타일 & 사용자 입력값 반응
 */
@Stable
object UmatTextFieldDefaults {

    @Composable
    fun default(
        topLabelColor: Color = Color.Black,
        supportLabelColor: Color = Color.Black,
        fieldTextColor: Color = Color.Black,
        fieldLineColor: Color = Color.Black
    ): UmatTextFieldStyle = UmatTextFieldStyleDefault(
        topLabelColor = topLabelColor,
        supportLabelColor = supportLabelColor,
        fieldTextColor = fieldTextColor,
        fieldLineColor = fieldLineColor
    )

    @Composable
    fun activated(
        topLabelColor: Color = Color.Blue,
        supportLabelColor: Color = Color.Blue,
        fieldTextColor: Color = Color.Blue,
        fieldLineColor: Color = Color.Blue
    ): UmatTextFieldStyle = UmatTextFieldStyleDefault(
        topLabelColor = topLabelColor,
        supportLabelColor = supportLabelColor,
        fieldTextColor = fieldTextColor,
        fieldLineColor = fieldLineColor
    )

    @Composable
    fun disabled(
        topLabelColor: Color = Color.Gray,
        supportLabelColor: Color = Color.Gray,
        fieldTextColor: Color = Color.Gray,
        fieldLineColor: Color = Color.Gray
    ): UmatTextFieldStyle = UmatTextFieldStyleDefault(
        topLabelColor = topLabelColor,
        supportLabelColor = supportLabelColor,
        fieldTextColor = fieldTextColor,
        fieldLineColor = fieldLineColor
    )
}

interface UmatTextFieldStyle {

    @Composable
    fun topLabelColor(): State<Color>

    @Composable
    fun supportLabelColor(): State<Color>

    @Composable
    fun fieldTextColor(): State<Color>

    @Composable
    fun fieldLineColor(): State<Color>
}

@Immutable
private data class UmatTextFieldStyleDefault(
    val topLabelColor: Color,
    val supportLabelColor: Color,
    val fieldTextColor: Color,
    val fieldLineColor: Color
) : UmatTextFieldStyle {
    @Composable
    override fun topLabelColor(): State<Color> {
        return rememberUpdatedState(newValue = topLabelColor)
    }

    @Composable
    override fun supportLabelColor(): State<Color> {
        return rememberUpdatedState(newValue = supportLabelColor)
    }

    @Composable
    override fun fieldTextColor(): State<Color> {
        return rememberUpdatedState(newValue = fieldTextColor)
    }

    @Composable
    override fun fieldLineColor(): State<Color> {
        return rememberUpdatedState(newValue = fieldLineColor)
    }
}

@Preview(group = "UmatTextField", name = "default")
@Preview(group = "UmatTextField", name = "default", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun UmatTextFieldDefaultPreView() {
    UmatTheme {
        UmatTextField(
            fieldText = "",
            topLabel = "내 닉네임",
            supportLabel = "6자 이내, 한글로만 가능해요.",
            style = UmatTextFieldDefaults.default(),
            onValueChange = {}
        )
    }
}

@Preview(group = "UmatTextField", name = "activated")
@Preview(group = "UmatTextField", name = "activated", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun UmatTextFieldActivatedPreView() {
    UmatTheme {
        UmatTextField(
            fieldText = "",
            topLabel = "내 닉네임",
            supportLabel = "6자 이내, 한글로만 가능해요.",
            style = UmatTextFieldDefaults.activated(),
            onValueChange = {}
        )
    }
}

@Preview(group = "UmatTextField", name = "disabled")
@Preview(group = "UmatTextField", name = "disabled", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun UmatTextFieldDisabledPreView() {
    UmatTheme {
        UmatTextField(
            fieldText = "",
            topLabel = "내 닉네임",
            supportLabel = "6자 이내, 한글로만 가능해요.",
            style = UmatTextFieldDefaults.disabled(),
            onValueChange = {}
        )
    }
}

@Preview(group = "UmatTextField", name = "error")
@Preview(group = "UmatTextField", name = "error", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun UmatTextFieldEnabledErrorPreView() {
}
