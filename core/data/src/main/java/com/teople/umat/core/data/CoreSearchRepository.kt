package com.teople.umat.core.data

import com.teople.umat.core.data.entity.CoreGooglePlacesSearchEntity

interface CoreSearchRepository {

    // Request Google Places 'Text Search'
    suspend fun requestSearch(query: String): Result<CoreGooglePlacesSearchEntity>
}