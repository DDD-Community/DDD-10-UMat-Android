package com.teople.umat.component.widget.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.foundation.text.appendInlineContent
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.PlaceholderVerticalAlign
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.teople.umat.component.R
import com.teople.umat.component.ui.theme.Both
import com.teople.umat.component.ui.theme.Gradient
import com.teople.umat.component.ui.theme.Gray100
import com.teople.umat.component.ui.theme.Gray300
import com.teople.umat.component.ui.theme.Gray500
import com.teople.umat.component.ui.theme.Gray900
import com.teople.umat.component.ui.theme.UmatTypography

@Composable
fun UmatItemCard(
    image: Painter,
    name: String,
    location: String,
    isWin: Boolean,
    isLike: Boolean,
    open: String,
    isExpand: Boolean = false,
    openDetail: List<Pair<String, String>> = emptyList(),
    buttonText: String,
    onClickAction: () -> Unit
) {
    var expandStatus by remember { mutableStateOf(isExpand) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row {
            Image(
                painter = image,
                contentDescription = "",
                modifier = Modifier.size(56.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                modifier = Modifier.height(56.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Row {
                    if (isWin) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_award),
                            contentDescription = "",
                            modifier = Modifier.size(24.dp),
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                    }
                    Text(
                        text = name,
                        style = UmatTypography().pretendardBold16,
                        color = Gray900
                    )
                }
                Text(
                    text = location,
                    style = UmatTypography().pretendardSemiBold12,
                    color = Gray500
                )
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Column(
            modifier = Modifier
                .background(color = Gray100)
                .padding(12.dp, 16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                val openText = buildAnnotatedString {
                    withStyle(UmatTypography().pretendardSemiBold12.toSpanStyle().copy(color = Both)) {
                        append("오늘 영업시간 ")
                    }
                    withStyle(UmatTypography().pretendardRegular12.toSpanStyle()) {
                        append(open)
                    }
                }
                Text(text = openText)
                IconButton(
                    modifier = Modifier.size(16.dp),
                    onClick = { expandStatus = !expandStatus }
                ) {
                    if (expandStatus) {
                        Image(painter = painterResource(id = R.drawable.ic_less_outlined), contentDescription = "")
                    } else {
                        Image(painter = painterResource(id = R.drawable.ic_more_outlined), contentDescription = "")
                    }
                }
            }
            if (expandStatus) {
                LazyColumn(
                    contentPadding = PaddingValues(top = 8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(openDetail) { open ->
                        val openText = buildAnnotatedString {
                            withStyle(UmatTypography().pretendardSemiBold12.toSpanStyle()) {
                                append("${open.first} ")
                            }
                            withStyle(UmatTypography().pretendardRegular12.toSpanStyle()) {
                                append(open.second)
                            }
                        }
                        Text(
                            text = openText
                        )
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        val modId = "modIcon"
        val text = buildAnnotatedString {
            appendInlineContent(modId, "[icon]")
            append(" $buttonText")
        }
        val inlineContent = mapOf(
            Pair(
                // This tells the [CoreText] to replace the placeholder string "[icon]" by
                // the composable given in the [InlineTextContent] object.
                modId,
                InlineTextContent(
                    // Placeholder tells text layout the expected size and vertical alignment of
                    // children composable.
                    Placeholder(
                        width = 20.sp,
                        height = 20.sp,
                        placeholderVerticalAlign = PlaceholderVerticalAlign.Center
                    )
                ) {
                    // This Icon will fill maximum size, which is specified by the [Placeholder]
                    // above. Notice the width and height in [Placeholder] are specified in TextUnit,
                    // and are converted into pixel by text layout.

                    Image(
                        painter = painterResource(id = if (isLike) R.drawable.ic_heart_filled else R.drawable.ic_heart_outlined),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize()
                    )
                }
            )
        )

        Text(
            text = text,
            inlineContent = inlineContent,
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White, shape = RoundedCornerShape(1.dp))
                .border(BorderStroke(width = 1.dp, brush = if (isLike) Gradient else SolidColor(Gray300)), shape = RoundedCornerShape(8.dp))
                .padding(vertical = 10.dp)
                .clickable {
                    onClickAction()
                },
            textAlign = TextAlign.Center,
            style = UmatTypography().pretendardSemiBold14
        )
    }
}

@Preview(group = "UmatItemCard")
@Composable
fun UmatItemCardPreview() {
    UmatItemCard(
        image = painterResource(id = R.drawable.ic_location_check_filled),
        name = "블루도어독스",
        location = "서울시 용산구 한남동 738-20",
        isWin = false,
        isLike = false,
        open = "오후 12:30~10시",
        openDetail = listOf(
            "월요일" to "오후 12:30~10시",
            "화요일" to "오후 12:30~10시",
            "수요일" to "오후 12:30~10시",
            "목요일" to "오후 12:30~10시",
            "금요일" to "오후 12:30~10시",
            "토요일" to "오후 12:30~10시",
            "일요일" to "오후 12:30~10시",
        ),
        isExpand = false,
        buttonText = "여기 가볼래",
        onClickAction = {}
    )
}

@Preview(group = "UmatItemCard")
@Composable
fun UmatItemCardPreview2() {
    UmatItemCard(
        image = painterResource(id = R.drawable.ic_location_check_filled),
        name = "블루도어독스",
        location = "서울시 용산구 한남동 738-20",
        isWin = true,
        isLike = true,
        open = "오후 12:30~10시",
        openDetail = listOf(
            "월요일" to "오후 12:30~10시",
            "화요일" to "오후 12:30~10시",
            "수요일" to "오후 12:30~10시",
            "목요일" to "오후 12:30~10시",
            "금요일" to "오후 12:30~10시",
            "토요일" to "오후 12:30~10시",
            "일요일" to "오후 12:30~10시",
        ),
        isExpand = false,
        buttonText = "여기 가볼래",
        onClickAction = {}
    )
}

@Preview(group = "UmatItemCard")
@Composable
fun UmatItemCardPreview3() {
    UmatItemCard(
        image = painterResource(id = R.drawable.ic_location_check_filled),
        name = "블루도어독스",
        location = "서울시 용산구 한남동 738-20",
        isWin = false,
        isLike = false,
        open = "오후 12:30~10시",
        openDetail = listOf(
            "월요일" to "오후 12:30~10시",
            "화요일" to "오후 12:30~10시",
            "수요일" to "오후 12:30~10시",
            "목요일" to "오후 12:30~10시",
            "금요일" to "오후 12:30~10시",
            "토요일" to "오후 12:30~10시",
            "일요일" to "오후 12:30~10시",
        ),
        isExpand = true,
        buttonText = "여기 가볼래",
        onClickAction = {}
    )
}

@Preview(group = "UmatItemCard")
@Composable
fun UmatItemCardPreview4() {
    UmatItemCard(
        image = painterResource(id = R.drawable.ic_location_check_filled),
        name = "블루도어독스",
        location = "서울시 용산구 한남동 738-20",
        isWin = true,
        isLike = true,
        open = "오후 12:30~10시",
        openDetail = listOf(
            "월요일" to "오후 12:30~10시",
            "화요일" to "오후 12:30~10시",
            "수요일" to "오후 12:30~10시",
            "목요일" to "오후 12:30~10시",
            "금요일" to "오후 12:30~10시",
            "토요일" to "오후 12:30~10시",
            "일요일" to "오후 12:30~10시",
        ),
        isExpand = true,
        buttonText = "여기 가볼래",
        onClickAction = {}
    )
}