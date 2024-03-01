package com.teople.umat.component.widget.component

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.teople.umat.component.R

@Composable
fun UmatButton(
    modifier: Modifier = Modifier,
    backgroundColor: Color,
    text: String,
    textColor: Color = Color.White,
    onClick: () -> Unit,
    icon: @Composable (RowScope.() -> Unit)? = null,
    enabled: Boolean = true
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(containerColor = backgroundColor),
        shape = RoundedCornerShape(8.dp),
        enabled = enabled
    ) {
        icon?.invoke(this)
        Text(
            text = text,
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight.SemiBold,
                color = textColor
            )
        )
    }
}

@Preview
@Composable
fun UmatButtonPreview() {
    val painter = painterResource(id = R.drawable.ic_apple)
    UmatButton(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        backgroundColor = Color.Black,
        text = "Apple 로그인",
        textColor = Color.White,
        onClick = {},
        icon = {
            Icon(
                painter = painter,
                tint = Color.White,
                contentDescription = "Apple 로그인 버튼",
                modifier = Modifier.padding(end = 8.dp)
            )
        }
    )
}