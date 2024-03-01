package com.teople.umat

import android.app.Application
import com.naver.maps.map.NaverMapSdk
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class UmatApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // Initialize NaverMap API
        NaverMapSdk.getInstance(this).client =
            NaverMapSdk.NaverCloudPlatformClient(BuildConfig.NAVER_MAP_API_KEY)
    }
}