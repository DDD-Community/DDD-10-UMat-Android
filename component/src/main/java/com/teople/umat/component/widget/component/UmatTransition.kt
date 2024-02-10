package com.teople.umat.component.widget.component

import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally

object UmatTransition {
    fun slideEnterHorizontally() = slideInHorizontally(
        initialOffsetX = { it },
        animationSpec = tween(300)
    )

    fun slideExitHorizontally() = slideOutHorizontally(
        targetOffsetX = { -it },
        animationSpec = tween(300)
    )

    fun slidePopEnterHorizontally() = slideInHorizontally(
        initialOffsetX = { -it },
        animationSpec = tween(300)
    )

    fun slidePopExitHorizontally() = slideOutHorizontally(
        targetOffsetX = { it },
        animationSpec = tween(300)
    )
}