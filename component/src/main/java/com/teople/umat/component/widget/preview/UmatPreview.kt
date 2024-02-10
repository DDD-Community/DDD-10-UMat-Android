package com.teople.umat.component.widget.preview

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.teople.umat.component.ui.theme.Black
import com.teople.umat.component.ui.theme.UmatTheme
import com.teople.umat.component.ui.theme.White

/**
 * Compose Preview Boilerplate Code
 */
@Composable
fun UmatPreview(
    content: @Composable (BoxScope.() -> Unit)
) {
    UmatTheme {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = when (isSystemInDarkTheme()) {
                        true -> Black
                        false -> White
                    }
                ),
            content = content
        )
    }
}
