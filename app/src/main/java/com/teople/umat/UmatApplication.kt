package com.teople.umat

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class UmatApplication : Application() {

    override fun onCreate() {
        super.onCreate()

    }
}