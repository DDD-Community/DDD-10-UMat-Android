package com.teople.umat

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.Configuration
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.animation.AnticipateInterpolator
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.animation.doOnEnd
import androidx.core.animation.doOnStart
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.teople.umat.component.ui.theme.UmatTheme
import com.teople.umat.component.ui.theme.White
import com.teople.umat.component.widget.preview.UmatPreview
import com.teople.umat.route.UmatRootRoute
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CustomSplashScreen")
class UmatSplashActivity : ComponentActivity() {

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {

        enableEdgeToEdge()

        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.S) {

            splashScreen.setOnExitAnimationListener { splashScreenView ->

                actionBar?.hide()

                splashScreenView.background = getDrawable(R.drawable.img_splash_background)

                ObjectAnimator.ofFloat(
                    splashScreenView, View.TRANSLATION_Y, 0f, 0f, 0f
                ).apply {
                    interpolator = AnticipateInterpolator()
                    duration = SPLASH_DELAY

                    doOnEnd {
                        startActivity(Intent(this@UmatSplashActivity, UmatRootActivity::class.java))
                        splashScreenView.remove()
                    }
                }.start()
            }
        } else {
            setContent {
                UmatSplashScreen()
            }

            lifecycleScope.launch {
                lifecycle.repeatOnLifecycle(Lifecycle.State.CREATED) {
                    delay(SPLASH_DELAY)
                    Intent(
                        this@UmatSplashActivity,
                        UmatRootActivity::class.java
                    ).let(::startActivity)
                    finish()
                }
            }
        }

        super.onCreate(savedInstanceState)
    }

    companion object {
        private const val SPLASH_DELAY = 1500L
    }
}

@Composable
fun UmatSplashScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = White
            ),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.img_splash_background),
            contentDescription = null,
            contentScale = ContentScale.FillHeight
        )

        Image(
            modifier = Modifier.width(120.dp),
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
    }
}

@Preview(group = "UmatSplashScreen")
@Preview(group = "UmatSplashScreen", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun UmatSplashScreenPreview() {
    UmatPreview {
        UmatSplashScreen()
    }
}
