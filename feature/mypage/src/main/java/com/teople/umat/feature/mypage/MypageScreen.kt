package com.teople.umat.feature.mypage

import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.teople.umat.component.icon.UmatIcon
import com.teople.umat.component.icon.umaticon.IcSettingsOutlined
import com.teople.umat.component.ui.theme.UmatTheme
import com.teople.umat.component.widget.component.UmatAppBar

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
            modifier = Modifier.padding(paddingValues)
        ) {

        }
    }
}

@Preview(group = "MypageScreen")
@Preview(group = "MypageScreen", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun MypageScreenPreview() {
    UmatTheme {
        MypageScreen(
            onNavigator = {

            }
        )
    }
}
