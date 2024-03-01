package com.teople.umat.screen.component

import android.view.Gravity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.DialogWindowProvider
import com.teople.umat.component.R
import com.teople.umat.component.ui.theme.Both
import com.teople.umat.component.ui.theme.Gray300
import com.teople.umat.component.ui.theme.Gray500
import com.teople.umat.component.ui.theme.UmatTypography
import com.teople.umat.component.widget.component.UmatBadge
import com.teople.umat.component.widget.component.UmatBadgeDefaults

/**
 * FIXME Dialog 에서 StatusBar 아이콘 색상이 라이트/다크 모드에 따라 변경이 안됨
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun GuideDialog(
    onDismissRequest: () -> Unit = { }
) {
    Dialog(
        onDismissRequest = onDismissRequest,
        properties = DialogProperties(
            usePlatformDefaultWidth = false,
        )
    ) {
        val dialogWindowProvider = LocalView.current.parent as DialogWindowProvider
        dialogWindowProvider.window.setGravity(Gravity.BOTTOM)
        dialogWindowProvider.window.setDimAmount(0f)

        val imageTextPairs = listOf(
            Pair(R.drawable.temp, "지도앱에서 공유하기 누르기"),
            Pair(R.drawable.temp, "가고싶은 장소의 링크를 복사"),
            Pair(R.drawable.temp, "복사된 링크를 맛나에 붙여넣으면 저장 완료!")
        )

        Surface(
            shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "맛나에 가고 싶은 장소 추가하는 방법",
                    style = UmatTypography().lineSeedBold20,
                    modifier = Modifier.padding(top = 46.dp)
                )
                val pagerState = rememberPagerState(pageCount = {
                    3
                })
                HorizontalPager(
                    state = pagerState,
                    modifier = Modifier
                        .padding(top = 12.dp)
                        .fillMaxWidth(),

                    ) { page ->
                    val (imageRes, text) = imageTextPairs[page]
                    Column {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            UmatBadge(
                                title = "Step ${page + 1}", style = UmatBadgeDefaults.Filled(
                                    backgroundColor = Both
                                ),
                                paddingValues = PaddingValues(
                                    end = 6.dp
                                )
                            )
                            Text(
                                text = text,
                                style = UmatTypography().pretendardSemiBold14
                            )
                        }
                        Image(
                            painter = painterResource(id = imageRes),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(top = 22.dp)
                                .padding(horizontal = 48.dp)
                                .fillMaxWidth(),
                            contentScale = ContentScale.FillWidth
                        )
                    }
                }
                Row(
                    Modifier
                        .wrapContentHeight()
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                        .padding(top = 28.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    repeat(pagerState.pageCount) { iteration ->
                        val color =
                            if (pagerState.currentPage == iteration) Gray500 else Gray300
                        Box(
                            modifier = Modifier
                                .padding(3.dp)
                                .clip(RoundedCornerShape(4.dp))
                                .background(color)
                                .width(28.dp)
                                .height(6.dp)
                        )
                    }
                }

                Divider(
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .padding(top = 32.dp),
                    color = Gray300
                )
                Text(
                    text = "닫기",
                    style = UmatTypography().pretendardSemiBold14,
                    modifier = Modifier
                        .padding(top = 16.dp, bottom = 24.dp)
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
    GuideDialog()
}