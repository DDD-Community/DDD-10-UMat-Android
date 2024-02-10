package com.teople.umat.feature.mypage.setting

import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.teople.umat.component.ui.theme.Error
import com.teople.umat.component.ui.theme.Gray700
import com.teople.umat.component.ui.theme.UmatTheme
import com.teople.umat.component.widget.component.UmatAppBar
import com.teople.umat.component.widget.preview.UmatPreview
import com.teople.umat.feature.mypage.R

/**
 * 환경 설정 화면
 */
@Composable
fun MypageSettingEnvironmentScreen(
    onNavigator: () -> Unit
) {
    Scaffold(
        topBar = {
            UmatAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.mypage_setting_env_screen_title),
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 1
                    )
                },
                navigation = {
                    Icon(
                        modifier = Modifier.clickable {},
                        imageVector = Icons.Rounded.ArrowBack,
                        contentDescription = null
                    )
                }
            )
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .verticalScroll(
                        state = rememberScrollState()
                    )
            ) {
                // 버전 정보
                MypageSettingEnvironmentMenuRow(
                    textString = stringResource(id = R.string.mypage_setting_env_menu_version),
                    actionClick = {
                        // TODO("마이페이지 : 환경설정 : 메뉴 액션")
                    }
                )

                // 이용 약관
                MypageSettingEnvironmentMenuRow(
                    textString = stringResource(id = R.string.mypage_setting_env_menu_terms_service),
                    actionClick = {
                        // TODO("마이페이지 : 환경설정 : 메뉴 액션")
                    }
                )

                // 로그아웃
                MypageSettingEnvironmentMenuRow(
                    textString = stringResource(id = R.string.mypage_setting_env_menu_logout),
                    actionClick = {
                        // TODO("마이페이지 : 환경설정 : 메뉴 액션")
                    }
                )

                // 회원탈퇴
                MypageSettingEnvironmentMenuRow(
                    textString = stringResource(id = R.string.mypage_setting_env_menu_withdraw),
                    isWarning = true,
                    actionClick = {
                        // TODO("마이페이지 : 환경설정 : 메뉴 액션")
                    }
                )
            }
        }
    )
}

@Composable
private fun MypageSettingEnvironmentMenuRow(
    textString: String,
    isWarning: Boolean = false,
    actionClick: () -> Unit
) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                vertical = 13.dp,
                horizontal = 24.dp
            )
            .clickable {
                actionClick()
            },
        text = textString,
        color = when (isWarning) {
            true -> Error
            false -> Gray700
        },
        style = UmatTheme.typography.pretendardSemiBold16
    )
}

@Preview(group = "MypageSettingEnvironmentScreen")
@Preview(group = "MypageSettingEnvironmentScreen", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun MypageSettingEnvironmentScreenPreview() {
    UmatPreview {
        MypageSettingEnvironmentScreen(
            onNavigator = {}
        )
    }
}

@Preview(group = "MypageSettingEnvironmentMenuRow")
@Preview(group = "MypageSettingEnvironmentMenuRow", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun MypageSettingEnvironmentMenuRowPreview() {
    UmatPreview {
        MypageSettingEnvironmentMenuRow(
            textString = "메뉴 타이틀",
            isWarning = false,
            actionClick = {}
        )
    }
}