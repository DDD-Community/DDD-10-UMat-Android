package com.teople.umat

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.teople.umat.component.ui.theme.UmatTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UmatRootActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        installSplashScreen().apply {
            actionBar?.hide()
        }

        enableEdgeToEdge()

        super.onCreate(savedInstanceState)

        // 로그인 되지않은 유저일 경우 공유텍스트 안되게 처리 필요함
        var title: String? = null

        if (intent.action == Intent.ACTION_SEND) {
            val sharedText = intent.getStringExtra(Intent.EXTRA_TEXT)
            if (sharedText != null) {
                title = handleShare(sharedText)
            }
        }

        setContent {
            UmatTheme {
                UmatRootRoute(
                    sharedTitle = title
                )
            }
        }
    }

    private fun handleShare(searchItem: String): String? {
        return if (searchItem.startsWith("[네")) {
            searchItem.split("\n")[1]
        } else if (searchItem.startsWith("[카")) {
            searchItem.split("\n")[0].substring(7)
        } else {
            null
        }
    }
}