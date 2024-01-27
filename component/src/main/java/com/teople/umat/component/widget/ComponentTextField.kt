//package com.teople.umat.component.widget
//
//import androidx.compose.material3.Text
//import androidx.compose.material3.TextField
//import androidx.compose.material3.TextFieldDefaults
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.Immutable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.text.input.TextFieldValue
//
//@Composable
//fun ComponentTextField(
//    value: TextFieldValue,
//    label: String,
//
//    onValueChange: (TextFieldValue) -> Unit,
//
//    // Default 정의
//    ) {
//
//    TextField(
//        modifier = inputModifier,
//        // 상단 라벨
//        label = {
//            Text(text =)
//        },
//        // 사용자 입력값
//        value = value,
//        onValueChange = { textValue ->
//            onValueChange(textValue)
//        },
//        textStyle = inputTextStyle,
//        // 색상 : loading, trailing, line 등
//        colors = TextFieldDefaults.textFieldColors(
//            backgroundColor = Color.Transparent,
//        ),
//        // 하단 메세지
//        isError = false,
//        supportingText = {
//            // fillMaxWidth() 주고 gravity.END 하면 우측에 붙는지 확인 필요
//        },
//        keyboardOptions =,
//        keyboardActions =,
//        singleLine = false,
//        maxLines = 0,
//        minLines = 0,
//    )
//
//    TextField(
//        value =,
//        onValueChange =,
//        modifier =,
//        enabled = false,
//        readOnly = false,
//        textStyle =,
//        label = {},
//        placeholder = {},
//        leadingIcon = {},
//        trailingIcon = {},
//        prefix = {},
//        suffix = {},
//        supportingText = {},
//        visualTransformation =,
//        keyboardOptions =,
//        keyboardActions =,
//        isError = false,
//        singleLine = false,
//        maxLines = 0,
//        minLines = 0,
//        interactionSource =,
//        shape =,
//        colors =,
//    )
//}
//
//@Immutable
//object ComponentTextFieldStyleDefault {
//
//}
