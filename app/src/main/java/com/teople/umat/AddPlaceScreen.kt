package com.teople.umat

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.teople.umat.component.icon.UmatIcon
import com.teople.umat.component.icon.umaticon.IcAddFilled
import com.teople.umat.component.ui.theme.Both
import com.teople.umat.component.ui.theme.Gray300
import com.teople.umat.component.ui.theme.UmatTypography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddPlaceBottomSheet(
    onDismissRequest: () -> Unit,
    addPlaceViewModel: AddPlaceViewModel
) {
    ModalBottomSheet(onDismissRequest = onDismissRequest) {
        AddPlaceScreen(
            onDismissRequest = onDismissRequest,
            addPlaceViewModel = addPlaceViewModel
        )
    }
}

@Composable
fun AddPlaceScreen(
    onDismissRequest: (() -> Unit)? = null,
    addPlaceViewModel: AddPlaceViewModel? = null
) {
    var shouldShowGuide by remember { mutableStateOf(false) }

    val guideText = buildAnnotatedString {
        append("앗, ")
        withStyle(UmatTypography().pretendardSemiBold12.toSpanStyle().copy(color = Both)) {
            append("지도앱에서 공유하기로 추가")
        }
        append("가 뭔가요?")
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.add_place),
            style = UmatTypography().pretendardBold16
        )
        Column(
            modifier = Modifier
                .padding(top = 26.dp)
                .padding(horizontal = 20.dp)
                .fillMaxWidth()
                .background(Both, RoundedCornerShape(8.dp))
                .padding(vertical = 15.dp)
                .padding(start = 18.dp)
                .clickable {
                    onDismissRequest?.invoke()
                    addPlaceViewModel?.moveToNaverMap()
                },
        ) {
            Row {
                Image(
                    imageVector = UmatIcon.IcAddFilled,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(end = 6.dp)
                        .size(24.dp)
                )
                Text(
                    text = stringResource(R.string.share_by_map),
                    style = UmatTypography().pretendardSemiBold18,
                    color = Color.White
                )
            }
            Text(
                text = stringResource(R.string.move_to_naver_map),
                style = UmatTypography().pretendardSemiBold14,
                modifier = Modifier.padding(top = 6.dp),
                color = Color.White.copy(alpha = 0.6f)
            )
        }
        Text(
            text = guideText,
            style = UmatTypography().pretendardSemiBold12,
            modifier = Modifier.padding(top = 20.dp)
        )

        Column(
            modifier = Modifier
                .padding(top = 10.dp)
                .border(1.dp, Gray300, RoundedCornerShape(8.dp))
                .padding(vertical = 10.dp, horizontal = 20.dp)
                .clickable {
                    shouldShowGuide = true
                }
        ) {
            Text(
                text = stringResource(id = R.string.view_guide),
                style = UmatTypography().pretendardSemiBold14
            )
        }
    }
    if (shouldShowGuide) {
        GuideDialog(
            onDismissRequest = {
                shouldShowGuide = false
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun UmatPlace() {
    AddPlaceScreen()
}