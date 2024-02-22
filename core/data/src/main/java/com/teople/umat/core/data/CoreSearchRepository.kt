package com.teople.umat.core.data

import com.teople.umat.core.data.entity.CoreGooglePlacesEntity

interface CoreSearchRepository {

    // 구글 장소 API 요청
    suspend fun requestGooglePlace(query: String): Result<CoreGooglePlacesEntity>
}