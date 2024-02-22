package com.teople.umat.component.widget.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusState
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.teople.umat.component.ui.theme.Blue600
import com.teople.umat.component.ui.theme.Gray400
import com.teople.umat.component.ui.theme.Gray500
import com.teople.umat.component.ui.theme.Gray600
import com.teople.umat.component.ui.theme.Gray900

/**
 * @param modifier : 텍스트 필드에 추가하고 싶은 수정자 추가
 * @param title : 텍스트 필드 타이틀
 * @param hint : 텍스트 필드 hint
 * @param value : 텍스트 필드 값
 * @param onValueChange : 텍스트 필드 값 변경 여부, 값 변경될 때 state가 변경될 수 있음 (예 enabled -> error)
 * @param onFocusChanged : 텍스트 필드 포커스 여부, 값 변경될 때 state가 변경될 수 있음 (예 default -> Active)
 * @param subText : 텍스트 필드 우측 하단 텍스트
 * @param enabled : 텍스트 필드 사용 여부, 값 변경될 때 state가 변경될 수 있음 (예 enabled -> disEnabled)
 * @param maxLine : 텍스트 필드 값 최대 라인
 * @param keyboardActions : 키보드 액션 설정
 * @param keyboardOptions : 키보드 옵션 설정
 * @param state : TextField 스타일을 결정하는 값
 *
 */
@Composable
fun UmatTextFieldV2(
    modifier: Modifier = Modifier,
    title: String,
    hint: String,
    value: String,
    onValueChange: (String) -> Unit,
    onFocusChanged: (FocusState) -> Unit,
    subText: String? = null,
    enabled: Boolean = true,
    maxLine: Int = 2,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    state: UmatTextFieldState,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .then(modifier)
    ) {
        Text(
            text = title,
            color = state.color,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(10.dp))
        BasicTextField(
            modifier = Modifier
                .onFocusChanged(onFocusChanged = onFocusChanged),
            value = value,
            onValueChange = onValueChange,
            decorationBox = { innerTextField ->
                if (value.isEmpty()) {
                    Text(
                        text = hint,
                        color = Gray500,
                    )
                }
                innerTextField()
            },
            textStyle = TextStyle(
                fontSize = 16.sp,
                lineHeight = 24.sp,
                color = Gray900,
            ),
            enabled = enabled,
            maxLines = maxLine,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
        )
        Spacer(modifier = Modifier.height(10.dp))
        Divider(
            modifier = Modifier
                .height(2.dp),
            color = state.color
        )
        Spacer(modifier = Modifier.height(10.dp))
        subText?.let {
            Text(
                text = subText,
                modifier = Modifier.align(Alignment.End),
                fontSize = 12.sp,
                lineHeight = 18.sp,
                color = if (state == UmatTextFieldState.Error) state.color else Gray600
            )
        }
    }

}

sealed class UmatTextFieldState(
    val color: Color,
) {
    object Default : UmatTextFieldState(
        color = Gray600,
    )
    object Activated : UmatTextFieldState(
        color = Blue600,
    )
    object Enabled : UmatTextFieldState(
        color = Gray600
    )
    object Error : UmatTextFieldState(
        color = Color.Red
    )
    object Disabled : UmatTextFieldState(
        color = Gray400
    )
}

@Preview(showBackground = false)
@Composable
fun UmatTextFieldV2Default() {
    UmatTextFieldV2(
        title = "이름을 알려주세요",
        hint = "원하시는 이름을 말해주세요",
        value = "",
        onValueChange = {},
        onFocusChanged = {},
        subText = "text",
        state = UmatTextFieldState.Default,
    )
}

@Preview(showBackground = false)
@Composable
fun UmatTextFieldV2Activated() {
    UmatTextFieldV2(
        title = "이름을 알려주세요",
        hint = "원하시는 이름을 말해주세요",
        subText = "text",
        value = "",
        onValueChange = {},
        onFocusChanged = {},
        state = UmatTextFieldState.Activated,
    )
}

@Preview(showBackground = false)
@Composable
fun UmatTextFieldV2Enabled() {
    UmatTextFieldV2(
        title = "이름을 알려주세요",
        hint = "원하시는 이름을 말해주세요",
        subText = "text",
        value = "",
        onValueChange = {},
        onFocusChanged = {},
        state = UmatTextFieldState.Enabled,
    )
}

@Preview(showBackground = false)
@Composable
fun UmatTextFieldV2Error() {
    UmatTextFieldV2(
        title = "이름을 알려주세요",
        hint = "원하시는 이름을 말해주세요",
        subText = "text",
        value = "",
        onValueChange = {},
        onFocusChanged = {},
        state = UmatTextFieldState.Error,
    )
}

@Preview(showBackground = false)
@Composable
fun UmatTextFieldV2Disabled() {
    UmatTextFieldV2(
        title = "이름을 알려주세요",
        hint = "원하시는 이름을 말해주세요",
        subText = "text",
        value = "",
        onValueChange = {},
        onFocusChanged = {},
        state = UmatTextFieldState.Disabled,
    )
}