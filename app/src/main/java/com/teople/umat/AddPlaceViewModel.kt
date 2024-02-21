package com.teople.umat

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.content.pm.ResolveInfo
import android.net.Uri
import androidx.lifecycle.ViewModel


class AddPlaceViewModel(
    private val context: Context
) : ViewModel() {
    fun moveToNaverMap() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(NAVER_MAP_SCHEME))
        intent.addCategory(Intent.CATEGORY_BROWSABLE)
        val list: List<ResolveInfo> =
            context.packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)
        if (list.isEmpty()) {
            context.startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=com.nhn.android.nmap")
                )
            )
        } else {
            context.startActivity(intent)
        }
    }

    companion object {
        const val NAVER_MAP_SCHEME = "nmap://map?&appname=com.teople.umat"
    }
}