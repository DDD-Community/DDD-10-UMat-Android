package com.teople.umat.component.widget.component

import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.teople.umat.component.ui.theme.UmatTheme

/**
 * AppBar Component

 * @param backgroundColor 앱바 배경 색상
 * @param contentColor 앱바 컨텐츠 색상
 * @param title 앱바 타이틀
 * @param navigation 네비게이션 영역
 * @param action 액션 영역
 */
@Composable
fun UmatAppBar(
    backgroundColor: Color = MaterialTheme.colorScheme.background,
    contentColor: Color = MaterialTheme.colorScheme.onBackground,
    title: @Composable (() -> Unit)? = null,
    navigation: @Composable (() -> Unit)? = null,
    action: @Composable (() -> Unit)? = null,
) {
    UmatTopAppBarLayout(
        modifier = Modifier,
        backgroundColor = backgroundColor,
        contentColor = contentColor
    ) {
        UmatTopAppBarContent(
            title = title,
            navigation = navigation,
            action = action
        )
    }
}

/**
 * 앱바 최상위 레이아웃
 *
 * @param backgroundColor 앱바 배경 색상
 * @param contentColor 앱바 컨텐츠 색상
 * @param content : 앱바 컨텐츠
 */
@Composable
internal fun UmatTopAppBarLayout(
    modifier: Modifier,
    backgroundColor: Color,
    contentColor: Color,
    content: @Composable ColumnScope.() -> Unit
) {
    Surface(
        modifier = modifier,
        color = backgroundColor,
        contentColor = contentColor
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            content()
        }
    }
}

@Composable
internal fun UmatTopAppBarContent(
    title: @Composable (() -> Unit)? = null,
    navigation: @Composable (() -> Unit)? = null,
    action: @Composable (() -> Unit)? = null,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(appBarHeight)
            .padding(
                horizontal = appBarPadding
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (navigation != null) {
            Row {
                navigation()
            }
        } else {
            if (action != null) {
                Spacer(appBarIconSize)
            }
        }

        Row(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (title != null) {
                title()
            }
        }

        if (action != null) {
            Row {
                action()
            }
        } else {
            if (navigation != null) {
                Spacer(appBarIconSize)
            }
        }
    }
}

internal val appBarHeight = 54.dp
internal val appBarPadding = 22.dp

internal val appBarIconSize = Modifier.width(24.dp)

@Preview(group = "UmatAppBar")
@Preview(group = "UmatAppBar", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun UmatAppBarPreview() {
    UmatTheme {
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
            },
            action = {
                Icon(
                    modifier = Modifier.clickable {},
                    imageVector = Icons.Rounded.Settings,
                    contentDescription = null
                )
            }
        )
    }
}
