package com.teople.umat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.teople.umat.component.ui.theme.UmatTheme
import com.teople.umat.route.UmatRootRoute
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UmatRootActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        enableEdgeToEdge()

        super.onCreate(savedInstanceState)

        setContent {
            UmatTheme {
                UmatRootRoute()
            }
        }
    }
}