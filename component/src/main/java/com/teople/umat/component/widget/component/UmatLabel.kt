package com.teople.umat.component.widget.component

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.teople.umat.component.ui.theme.Gray300
import com.teople.umat.component.ui.theme.Gray50
import com.teople.umat.component.ui.theme.Gray500
import com.teople.umat.component.ui.theme.Gray800
import com.teople.umat.component.ui.theme.UmatTheme
import com.teople.umat.component.ui.theme.White
import com.teople.umat.component.widget.preview.UmatPreview

/**
 * Umat Component Label
 *
 * @param title 라벨 텍스트 타이틀
 * @param isSelected 선택(활성화) 여부
 * @param paddingValues 컴포넌트 외부 패딩
 * @param onActionClick 클릭 액션
 */
@Composable
fun UmatLabel(
    title: String,
    isSelected: Boolean = false,
    paddingValues: PaddingValues = PaddingValues(0.dp),
    onActionClick: (() -> Unit)? = null
) {
    Text(
        modifier = Modifier
            .width(labelFixedWidth)
            .padding(paddingValues)
            .border(
                width = 1.dp,
                color = when (isSelected) {
                    true -> Gray500
                    false -> Gray300
                },
                shape = RoundedCornerShape(12.dp)
            )
            .background(
                color = when (isSelected) {
                    true -> Gray50
                    false -> White
                },
                shape = RoundedCornerShape(12.dp)
            )
            .padding(
                vertical = 12.dp,
                horizontal = 12.dp
            )
            .clickable {
                onActionClick?.invoke()
            },
        text = title,
        textAlign = TextAlign.Center,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        color = Gray800,
        style = UmatTheme.typography.pretendardSemiBold14
    )
}

private val labelFixedWidth = 100.dp

@Preview(group = "UmatLabel")
@Preview(group = "UmatLabel", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun UmatLabelPreview() {
    UmatPreview {
        Column(
            modifier = Modifier.padding(24.dp)
        ) {
            // Selected
            UmatLabel(
                title = "Label",
                isSelected = true
            )

            // UnSelected (Default)
            UmatLabel(
                title = "Label",
                paddingValues = PaddingValues(
                    top = 8.dp
                )
            )
        }
    }
}
