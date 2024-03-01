package com.teople.umat.feature.home.data

import com.teople.umat.core.data.entity.CoreGooglePlacesDetailEntity
import com.teople.umat.feature.home.WishType

data class MockPositionItem(
    val googlePlaceItem: CoreGooglePlacesDetailEntity,
    val type: WishType
)
