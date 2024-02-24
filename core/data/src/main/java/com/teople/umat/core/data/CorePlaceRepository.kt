package com.teople.umat.core.data

import com.teople.umat.core.data.entity.CoreGooglePlacesDetailEntity

interface CorePlaceRepository {

    // Request Google Places 'Place Details'
    suspend fun requestPlaceDetail(placeId: String): Result<CoreGooglePlacesDetailEntity>
}