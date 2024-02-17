package com.teople.umat.feature.mypage

import MypageIcon
import android.content.res.Configuration
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.teople.umat.component.icon.UmatIcon
import com.teople.umat.component.icon.umaticon.IcArrowForwardFilled
import com.teople.umat.component.icon.umaticon.IcProfileUserOrangeFilled
import com.teople.umat.component.icon.umaticon.IcSettingsOutlined
import com.teople.umat.component.ui.theme.Blue500
import com.teople.umat.component.ui.theme.Gray100
import com.teople.umat.component.ui.theme.Gray300
import com.teople.umat.component.ui.theme.Gray500
import com.teople.umat.component.ui.theme.Gray800
import com.teople.umat.component.ui.theme.Gray900
import com.teople.umat.component.ui.theme.Orange500
import com.teople.umat.component.ui.theme.UmatTheme
import com.teople.umat.component.widget.ComponentButton
import com.teople.umat.component.widget.component.UmatAppBar
import com.teople.umat.component.widget.component.UmatBadge
import com.teople.umat.component.widget.component.UmatBadgeDefaults
import mypageicon.IcHeartFilled

@Composable
fun MypageScreen(
    viewModel: MypageViewModel = hiltViewModel(),
    onNavigator: () -> Unit
) {

    Scaffold(
        modifier = Modifier,
        topBar = {
            UmatAppBar(
                action = {
                    Icon(
                        modifier = Modifier.clickable {
                            onNavigator()
                        },
                        imageVector = UmatIcon.IcSettingsOutlined,
                        contentDescription = null
                    )
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .verticalScroll(
                    state = rememberScrollState()
                )
        ) {
            // 헤더
            MypageHeaderSection()

            // 요약
            MypageSummarySection()

            // 내 알레르기
            MypageAllergySection(
                isInitialized = false,
                actionRegister = {
                    // 알레르기 등록 액션
                }
            )
        }
    }
}

/**
 * 마이페이지 헤더 영역
 * 만난 기간 / 닉네임 / 프로필 설정
 */
@Composable
private fun MypageHeaderSection() {
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = 14.dp,
                    bottom = 32.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier.size(80.dp),
                contentScale = ContentScale.FillWidth,
                imageVector = UmatIcon.IcProfileUserOrangeFilled,
                contentDescription = null
            )

            Text(
                modifier = Modifier
                    .padding(
                        top = 16.dp,
                        bottom = 8.dp
                    ),
                text = stringResource(
                    id = R.string.mypage_header_current_date,
                    "yyyy.MM.dd",
                    56
                ),
                color = Gray500,
                style = UmatTheme.typography.pretendardSemiBold14
            )

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "내 닉네임",
                    color = Gray900,
                    style = UmatTheme.typography.pretendardSemiBold16
                )

                Image(
                    modifier = Modifier
                        .padding(horizontal = 8.dp),
                    imageVector = MypageIcon.IcHeartFilled,
                    contentDescription = null
                )

                Text(
                    text = "네 닉네임",
                    color = Gray900,
                    style = UmatTheme.typography.pretendardSemiBold16
                )
            }
        }

        Icon(
            modifier = Modifier
                .padding(
                    end = 24.dp
                )
                .size(32.dp)
                .align(Alignment.CenterEnd),
            imageVector = UmatIcon.IcArrowForwardFilled,
            contentDescription = null
        )
    }
}

/**
 * 마이페이지 요약 영역
 * 가고 싶은 곳 요약
 */
@Composable
private fun MypageSummarySection() {
    MypageSectionCard {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    vertical = 22.dp,
                    horizontal = 24.dp
                ),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // 내가 가고 싶은 곳
            MypageSummarySectionRow(
                titleRes = R.string.mypage_summary_wanted_mine,
                count = 2523
            )

            Divider(
                modifier = Modifier
                    .width(2.dp)
                    .height(54.dp),
                thickness = 2.dp,
                color = Gray300
            )

            // 네가 가고 싶은 곳
            MypageSummarySectionRow(
                titleRes = R.string.mypage_summary_wanted_yours,
                count = 2235
            )

            Divider(
                modifier = Modifier
                    .width(2.dp)
                    .height(54.dp),
                thickness = 2.dp,
                color = Gray300
            )

            // 우리 함께 가고 싶은 곳
            MypageSummarySectionRow(
                titleRes = R.string.mypage_summary_wanted_ours,
                count = 2523
            )
        }
    }
}

/**
 * 가고 싶은 곳 공통 뷰
 */
@Composable
private fun MypageSummarySectionRow(
    @StringRes titleRes: Int,
    count: Int
) {
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = titleRes),
            textAlign = TextAlign.Center,
            color = Gray500,
            style = UmatTheme.typography.lineSeedBold12
        )

        Text(
            modifier = Modifier
                .padding(
                    vertical = 6.dp
                ),
            text = stringResource(
                id = R.string.mypage_summary_wanted_count,
                count
            ),
            color = Gray800,
            style = UmatTheme.typography.lineSeedBold16
        )
    }
}

/**
 * 마이페이지 알레르기 영역
 * 알레르기 등록 버튼 / 알레르기
 */
@Composable
private fun MypageAllergySection(
    isInitialized: Boolean,
    actionRegister: () -> Unit
) {
    val isRegistered by remember {
        mutableStateOf(isInitialized)
    }

    if (isRegistered) {
        MypageSectionCard(
            modifier = Modifier.padding(
                top = 14.dp
            )
        ) {
            MypageAllergySectionRow(
                isMine = true,
                partnerName = "",
                allergies = listOf(
                    "알레르기",
                    "글자최대6자",
                    "새우",
                    "새우",
                    "새우",
                    "새우",
                    "새우",
                    "새우",
                    "알레르기",
                    "알레르기",
                    "알레르기",
                    "알레르기",
                    "알레르기"
                )
            )
        }

        MypageSectionCard(
            modifier = Modifier.padding(
                top = 14.dp
            )
        ) {
            MypageAllergySectionRow(
                isMine = false,
                partnerName = "지윤이",
                allergies = listOf(
                    "알레르기",
                    "글자최대6자",
                    "새우",
                    "새우",
                    "새우",
                    "새우",
                    "새우",
                    "새우",
                    "알레르기",
                    "알레르기",
                    "알레르기",
                    "알레르기",
                    "알레르기"
                )
            )
        }
    } else {
        MypageSectionCard(
            modifier = Modifier.padding(
                top = 14.dp
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 20.dp,
                        bottom = 24.dp
                    ),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    modifier = Modifier
                        .padding(
                            bottom = 14.dp
                        ),
                    text = stringResource(id = R.string.mypage_allergy_default_title),
                    textAlign = TextAlign.Center,
                    color = Gray500,
                    style = UmatTheme.typography.pretendardBold12
                )

                // TODO("Component : Outlined Button 작업")
                ComponentButton(
                    backgroundColor = Gray300,
                    text = stringResource(id = R.string.mypage_allergy_default_register),
                    textColor = Gray800,
                    onClick = actionRegister
                )
            }
        }
    }
}

/**
 * 마이페이지 알레르기 공통 뷰
 */
@Composable
private fun MypageAllergySectionRow(
    isMine: Boolean,
    partnerName: String,
    allergies: List<String>
) {
    Column {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                modifier = Modifier
                    .weight(1f),
                text = if (isMine) {
                    stringResource(id = R.string.mypage_allergy_mine_title)
                } else {
                    stringResource(id = R.string.mypage_allergy_yours_title, partnerName)
                },
                textAlign = TextAlign.Start,
                color = Gray500,
                style = UmatTheme.typography.pretendardBold12
            )

            Icon(
                modifier = Modifier
                    .padding(
                        horizontal = 16.dp
                    )
                    .size(20.dp),
                imageVector = UmatIcon.IcArrowForwardFilled,
                contentDescription = null
            )
        }

        LazyRow(
            contentPadding = PaddingValues(
                start = 12.dp,
                end = 12.dp,
                bottom = 24.dp
            )
        ) {
            items(allergies) { item ->
                UmatBadge(
                    title = item,
                    style = UmatBadgeDefaults.Filled(
                        backgroundColor = if (isMine) {
                            Orange500
                        } else {
                            Blue500
                        }
                    ),
                    paddingValues = PaddingValues(
                        end = 4.dp
                    )
                )
            }
        }
    }
}

/**
 * 마이페이지 요약, 알레르기 등 공통 카드 컨테이너
 */
@Composable
private fun MypageSectionCard(
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(
                horizontal = 24.dp
            ),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Gray100
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 0.dp
        ),
        content = content
    )
}

@Preview(group = "MypageScreen")
@Preview(group = "MypageScreen", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun MypageScreenPreview() {
    UmatTheme {
        MypageScreen(
            onNavigator = {}
        )
    }
}
