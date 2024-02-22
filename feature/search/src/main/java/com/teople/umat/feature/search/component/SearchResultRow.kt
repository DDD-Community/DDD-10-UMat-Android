package com.teople.umat.feature.search.component

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.teople.umat.component.icon.UmatIcon
import com.teople.umat.component.icon.umaticon.IcCurrentLocationOutlined
import com.teople.umat.component.ui.theme.Gray200
import com.teople.umat.component.ui.theme.Gray400
import com.teople.umat.component.ui.theme.Gray950
import com.teople.umat.component.ui.theme.UmatTypography
import com.teople.umat.component.widget.preview.UmatPreview
import com.teople.umat.core.data.entity.CoreGooglePlacesEntity

@Composable
fun SearchResultRow(
    item: CoreGooglePlacesEntity.Place,
    actionItemClick: (item: CoreGooglePlacesEntity.Place) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(18.dp)
            .clickable {
                actionItemClick(item)
            },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Icon(
            modifier = Modifier
                .size(32.dp)
                .background(
                    color = Gray200,
                    shape = RoundedCornerShape(50.dp)
                )
                .padding(6.dp),
            // FIXME 아이콘 변경
            imageVector = UmatIcon.IcCurrentLocationOutlined,
            contentDescription = null
        )

        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = item.displayName.text,
                style = UmatTypography().pretendardSemiBold14.copy(
                    color = Gray950
                )
            )

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 2.dp
                    ),
                text = item.formattedAddress,
                style = UmatTypography().pretendardSemiBold14.copy(
                    color = Gray400
                )
            )
        }
    }
}

@Preview(group = "SearchResultRow")
@Preview(group = "SearchResultRow", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun SearchResultRowPreview() {
    UmatPreview {
        SearchResultRow(
            item = CoreGooglePlacesEntity.Place(
                id = "",
                displayName = CoreGooglePlacesEntity.Place.DisplayName(
                    text = "블루도어북스",
                    languageCode = "ko"
                ),
                formattedAddress = "서울특별시 용산구 한남동 738-20",
                location = CoreGooglePlacesEntity.Place.Location(
                    latitude = 0,
                    longitude = 0
                )
            ),
            actionItemClick = {}
        )
    }
}
