package com.teople.umat.feature.search.component

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.TextField
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.teople.umat.component.icon.UmatIcon
import com.teople.umat.component.icon.umaticon.IcArrowBackFilled
import com.teople.umat.component.ui.theme.UmatTheme
import com.teople.umat.component.widget.preview.UmatPreview
import com.teople.umat.feature.search.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun SearchAppBar(
    actionBackPress: () -> Unit,
    actionQueryInput: (query: String) -> Unit
) {
    val focusRequester = remember {
        FocusRequester()
    }

    var query by rememberSaveable {
        mutableStateOf("")
    }

    LaunchedEffect(key1 = query) {
        launch {
            if (query.isNotBlank()) {
                actionQueryInput(query)
            }
        }
    }

    Column(
        modifier = Modifier
            .statusBarsPadding()
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = UmatTheme.colorScheme.background
                )
                .padding(
                    horizontal = 20.dp,
                    vertical = 18.dp
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            // FIXME 텍스트 필드 디자인 변경
            TextField(
                modifier = Modifier
                    .weight(1f)
                    .focusRequester(focusRequester),
                placeholder = {
                    Text(
                        text = stringResource(id = R.string.search_app_bar_hint),
                        style = UmatTheme.typography.pretendardRegular16
                    )
                },
                leadingIcon = {
                    IconButton(
                        onClick = {
                            actionBackPress()
                        }
                    ) {
                        Icon(
                            imageVector = UmatIcon.IcArrowBackFilled,
                            contentDescription = null
                        )
                    }
                },
                value = query,
                onValueChange = { searchQuery ->
                    query = searchQuery
                },
                textStyle = UmatTheme.typography.pretendardRegular16
            )
        }

        Divider(
            thickness = 2.dp,
            color = UmatTheme.colorScheme.divider
        )
    }

    // 화면 진입 시 키보드 노출 동기화
    LaunchedEffect(Unit) {
        delay(500)
        focusRequester.requestFocus()
    }
}

@Preview(group = "SearchAppBar")
@Preview(group = "SearchAppBar", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun SearchAppBarPreview() {
    UmatPreview(
        backgroundColor = Color.Red
    ) {
        SearchAppBar(
            actionBackPress = {},
            actionQueryInput = {}
        )
    }
}