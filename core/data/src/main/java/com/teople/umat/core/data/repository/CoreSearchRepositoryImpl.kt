package com.teople.umat.core.data.repository

import com.teople.umat.core.data.CoreSearchRepository
import com.teople.umat.core.data.entity.CoreGooglePlacesSearchEntity
import com.teople.umat.core.data.remote.CoreGooglePlacesDataSource
import com.teople.umat.core.data.remote.request.CoreGooglePlacesSearchRequest
import com.teople.umat.core.data.remote.response.CoreGooglePlacesSearchResponse.Companion.toEntity
import javax.inject.Inject

class CoreSearchRepositoryImpl @Inject constructor(
    private val placesDataSource : CoreGooglePlacesDataSource
) : CoreSearchRepository {
    override suspend fun requestSearch(query: String): Result<CoreGooglePlacesSearchEntity> {
        return kotlin.runCatching {
            placesDataSource.requestTextSearch(
                request = CoreGooglePlacesSearchRequest(
                    textQuery = query
                )
            ).toEntity()
        }
    }
}