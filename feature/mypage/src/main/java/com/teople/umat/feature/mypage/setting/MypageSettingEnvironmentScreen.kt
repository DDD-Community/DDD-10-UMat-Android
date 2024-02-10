package com.teople.umat.feature.mypage.setting

import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.teople.umat.component.ui.theme.UmatTheme
import com.teople.umat.component.widget.component.UmatAppBar

/**
 * 환경 설정 화면
 */
@Composable
fun MypageSettingEnvironmentScreen(
    onNavigator: () -> Unit
) {
    Column {
        UmatAppBar(
            title = {
                Text(
                    text = "환경 설정",
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
    }
}

@Preview(group = "MypageSettingEnvironmentScreen")
@Preview(group = "MypageSettingEnvironmentScreen", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun MypageSettingEnvironmentScreenPreview() {
    UmatTheme {
        MypageSettingEnvironmentScreen(
            onNavigator = {}
        )
    }
}