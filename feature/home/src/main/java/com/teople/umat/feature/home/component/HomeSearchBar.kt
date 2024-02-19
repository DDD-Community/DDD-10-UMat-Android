package com.teople.umat.feature.home.component

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.teople.umat.component.icon.UmatIcon
import com.teople.umat.component.icon.umaticon.IcCurrentLocationOutlined
import com.teople.umat.component.icon.umaticon.IcSearchOutlined
import com.teople.umat.component.ui.theme.Gray400
import com.teople.umat.component.ui.theme.UmatTheme
import com.teople.umat.component.ui.theme.UmatTypography
import com.teople.umat.component.ui.theme.White
import com.teople.umat.component.widget.preview.UmatPreview
import com.teople.umat.feature.home.R

@Composable
fun HomeSearchBar() {
    Row(
        modifier = Modifier
            .systemBarsPadding()
            .fillMaxWidth()
            .background(
                color = UmatTheme.colorScheme.transparent
            )
            .padding(
                horizontal = 18.dp,
                vertical = 4.dp
            ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Row(
            modifier = Modifier
                .weight(1f)
                .height(46.dp)
                .shadow(2.dp)
                .background(
                    color = White,
                    shape = RoundedCornerShape(6.dp)
                )
                .padding(
                    vertical = 11.dp,
                    horizontal = 14.dp
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Icon(
                imageVector = UmatIcon.IcSearchOutlined,
                contentDescription = null
            )

            Text(
                text = stringResource(id = R.string.home_search_bar_title),
                style = UmatTypography().pretendardRegular16.copy(
                    color = Gray400
                )
            )
        }

        IconButton(
            modifier = Modifier
                .size(46.dp)
                .shadow(2.dp)
                .background(
                    color = White,
                    shape = RoundedCornerShape(6.dp)
                ),
            onClick = {

            }
        ) {
            Icon(
                imageVector = UmatIcon.IcCurrentLocationOutlined,
                contentDescription = null
            )
        }
    }
}

@Preview(group = "MypageScreen")
@Preview(group = "MypageScreen", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun MypageScreenPreview() {
    UmatPreview(
        backgroundColor = Color.Red
    ) {
        HomeSearchBar()
    }
}

