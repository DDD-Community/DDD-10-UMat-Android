package com.teople.umat.component.widget.component

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.teople.umat.component.ui.theme.Both
import com.teople.umat.component.ui.theme.Gray300
import com.teople.umat.component.ui.theme.Gray500
import com.teople.umat.component.ui.theme.Gray800
import com.teople.umat.component.ui.theme.Gray900
import com.teople.umat.component.ui.theme.UmatTheme
import com.teople.umat.component.ui.theme.White
import com.teople.umat.component.widget.preview.UmatPreview
import kotlinx.coroutines.launch

/**
 * Positive & Negative Button BottomSheet
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UmatSelectBottomSheet(
    sheetState: SheetState = rememberModalBottomSheetState(),
    title: String,
    content: @Composable ColumnScope.() -> Unit,
    positiveText: String,
    negativeText: String,
    actionPositive: () -> Unit,
    actionNegative: () -> Unit,
) {
    val coroutineScope = rememberCoroutineScope()

    ModalBottomSheet(
        modifier = Modifier,
        sheetState = sheetState,
        shape = RoundedCornerShape(
            topStart = 16.dp,
            topEnd = 16.dp
        ),
        containerColor = UmatTheme.colorScheme.background,
        onDismissRequest = {
            coroutineScope.launch {
                sheetState.hide()
                actionNegative()
            }
        },
        content = {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = 24.dp,
                        vertical = 16.dp,
                    ),
                text = title,
                textAlign = TextAlign.Center,
                style = UmatTheme.typography.pretendardSemiBold18.copy(
                    color = Gray900
                )
            )

            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                content = content
            )

            Row(
                modifier = Modifier
                    .padding(
                        start = 24.dp,
                        end = 24.dp,
                        top = 28.dp,
                        bottom = 72.dp
                    ),
                horizontalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                Text(
                    modifier = Modifier
                        .weight(1f)
                        .border(
                            width = 1.dp,
                            color = Gray300,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .background(
                            color = White,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .clip(
                            shape = RoundedCornerShape(8.dp)
                        )
                        .clickable {
                            coroutineScope.launch {
                                sheetState.hide()
                                actionNegative()
                            }
                        }
                        .padding(
                            vertical = 12.dp,
                            horizontal = 12.dp
                        ),
                    text = negativeText,
                    textAlign = TextAlign.Center,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    color = Gray800,
                    style = UmatTheme.typography.pretendardSemiBold16
                )

                Text(
                    modifier = Modifier
                        .weight(1f)
                        .background(
                            color = Both,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .clip(
                            shape = RoundedCornerShape(8.dp)
                        )
                        .clickable {
                            coroutineScope.launch {
                                sheetState.hide()
                                actionPositive()
                            }
                        }
                        .padding(
                            vertical = 12.dp,
                            horizontal = 12.dp
                        ),
                    text = positiveText,
                    textAlign = TextAlign.Center,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    color = White,
                    style = UmatTheme.typography.pretendardSemiBold16
                )
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(group = "UmatSelectBottomSheet")
@Preview(group = "UmatSelectBottomSheet", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun UmatSelectBottomSheetPreview() {
    UmatPreview {
        UmatSelectBottomSheet(
            sheetState = rememberModalBottomSheetState(),
            title = "타이틀 영역 입니다",
            content = {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "부제목이 들어가거나 레이아웃이 들어갑니다",
                    textAlign = TextAlign.Center,
                    style = UmatTheme.typography.pretendardRegular16.copy(
                        color = Gray500
                    )
                )
            },
            negativeText = "연결 끊기",
            positiveText = "취소",
            actionPositive = {},
            actionNegative = {}
        )
    }
}