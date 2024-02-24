package com.teople.umat

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

        setContent {
            UmatTheme {
                UmatRootRoute()
            }
        }
    }
}