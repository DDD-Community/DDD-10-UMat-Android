package com.teople.umat.feature.home.data

import com.naver.maps.geometry.LatLng
import com.teople.umat.feature.home.WishType

data class MockPositionItem(
    val title: String,
    val latLng: LatLng,
    val type: WishType
)
