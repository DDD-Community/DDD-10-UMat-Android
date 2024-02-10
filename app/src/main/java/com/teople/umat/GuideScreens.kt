package com.teople.umat

import android.view.Gravity
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.DialogWindowProvider
import com.teople.umat.component.R
import com.teople.umat.component.ui.theme.Gray300
import com.teople.umat.component.ui.theme.UmatTypography


@Composable
fun CustomDialog(
    onDismissRequest: () -> Unit = { }
) {
    Dialog(
        onDismissRequest = { },
        properties = DialogProperties(
            usePlatformDefaultWidth = false,
        )
    ) {
        val dialogWindowProvider = LocalView.current.parent as DialogWindowProvider
        dialogWindowProvider.window.setGravity(Gravity.BOTTOM)
        dialogWindowProvider.window.setDimAmount(0f)

        var expanded by remember { mutableStateOf(false) }

        val widthState by animateDpAsState(
            targetValue = if (expanded) 650.dp else 340.dp,
            animationSpec = tween(durationMillis = 1000)
        )

        Surface(
            shape = RoundedCornerShape(16.dp),
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .height(widthState)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "연인과 가고싶은 곳을 추가해볼까요?",
                    style = UmatTypography().pretendardSemiBold18,
                    modifier = Modifier.padding(top = 46.dp)
                )
                Box(
                    modifier = Modifier
                        .padding(top = 12.dp)
                        .padding(horizontal = 40.dp)
                        .fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 24.dp),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_naver_map),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(end = 42.dp)
                                .size(55.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.ic_kakao_map),
                            contentDescription = null,
                            modifier = Modifier.size(55.dp)
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.ic_share),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(top = 6.dp)
                            .size(67.dp)
                            .align(Alignment.TopCenter)
                    )
                }
                val guideText = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color(0xFFA855F7),
                            fontSize = UmatTypography().pretendardSemiBold14.fontSize,
                            fontWeight = UmatTypography().pretendardSemiBold14.fontWeight
                        )
                    ) {
                        append("지도앱 공유하기")
                    }
                    append("로 쉽게 추가해보세요!")
                }
                Text(
                    text = guideText,
                    style = UmatTypography().pretendardSemiBold14,
                    modifier = Modifier.padding(top = 18.dp)
                )
                Box(
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .width(126.dp)
                        .height(40.dp)
                        .align(alignment = Alignment.CenterHorizontally)
                        .border(
                            width = 1.dp,
                            color = Gray300,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .clickable {
                            expanded = true
                        }
                ) {
                    Text(
                        text = "자세히 알아보기", style = UmatTypography().pretendardSemiBold14,
                        modifier = Modifier.align(alignment = Alignment.Center)
                    )
                }
                Divider(
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .padding(top = 24.dp),
                    color = Gray300
                )
                Text(
                    text = "닫기",
                    style = UmatTypography().pretendardSemiBold14,
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .clickable {
                            onDismissRequest()
                        }
                        .padding(horizontal = 20.dp, vertical = 7.dp),
                )
            }

        }
    }
}

@Preview
@Composable
fun GuideDialog() {
    CustomDialog()
}