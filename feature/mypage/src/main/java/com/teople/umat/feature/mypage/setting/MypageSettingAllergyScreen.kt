package com.teople.umat.feature.mypage.setting

import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.teople.umat.component.ui.theme.Gray300
import com.teople.umat.component.ui.theme.Gray500
import com.teople.umat.component.ui.theme.Gray800
import com.teople.umat.component.ui.theme.Gray900
import com.teople.umat.component.ui.theme.UmatTheme
import com.teople.umat.component.widget.ComponentButton
import com.teople.umat.component.widget.component.UmatAppBar
import com.teople.umat.component.widget.component.UmatLabel
import com.teople.umat.component.widget.preview.UmatPreview
import com.teople.umat.feature.mypage.R
import kotlin.random.Random

/**
 * 알레르기 등록/관리 화면
 */
@Composable
fun MypageSettingAllergyScreen() {

    val localCurrent = LocalContext.current
    val manageItems = localCurrent.resources
        .getStringArray(R.array.mypage_allergy_manage_items)

    val isConfirmValidate by remember {
        mutableStateOf(false)
    }

    Scaffold(
        topBar = {
            UmatAppBar(
                title = {
                    Text(
                        text = stringResource(
                            id = R.string.mypage_allergy_manage_screen_title
                        ),
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
        bottomBar = {
            ComponentButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = 24.dp,
                        vertical = 36.dp
                    ),
                backgroundColor = when (isConfirmValidate) {
                    true -> Gray800
                    false -> Gray300
                },
                text = stringResource(id = R.string.mypage_allergy_manage_confirm),
                onClick = {
                    when (isConfirmValidate) {
                        true -> Unit
                        false -> Unit
                    }
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
                Text(
                    modifier = Modifier
                        .padding(
                            top = 16.dp,
                            start = 24.dp,
                            end = 24.dp
                        ),
                    text = stringResource(
                        id = R.string.mypage_allergy_manage_title
                    ),
                    color = Gray900,
                    style = UmatTheme.typography.lineSeedBold20
                )

                Text(
                    modifier = Modifier
                        .padding(
                            vertical = 4.dp,
                            horizontal = 24.dp
                        ),
                    text = stringResource(
                        id = R.string.mypage_allergy_manage_subtitle
                    ),
                    color = Gray500,
                    style = UmatTheme.typography.pretendardRegular16
                )

                LazyVerticalGrid(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(max = 500.dp)
                        .wrapContentHeight(),
                    columns = GridCells.Fixed(3),
                    contentPadding = PaddingValues(24.dp),
                    userScrollEnabled = false,
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    content = {
                        itemsIndexed(manageItems) { index, manageItem ->
                            // TODO("마이페이지 : 알레르기관리 : 라벨에서 서버 데이터와 동일한 부분 선택 표시")
                            UmatLabel(
                                isSelected = Random.nextBoolean(),
                                title = manageItem,
                            )
                        }
                    }
                )
            }
        }
    )
}

@Preview(group = "MypageSettingAllergyScreen")
@Preview(group = "MypageSettingAllergyScreen", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun MypageSettingAllergyScreenPreview() {
    UmatPreview {
        MypageSettingAllergyScreen()
    }
}
