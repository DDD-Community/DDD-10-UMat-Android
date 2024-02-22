package com.teople.umat.core.data.repository

import com.teople.umat.core.data.CoreSearchRepository
import com.teople.umat.core.data.entity.CoreGooglePlacesEntity
import com.teople.umat.core.data.remote.CoreGooglePlacesDataSource
import com.teople.umat.core.data.remote.request.CoreGooglePlacesRequest
import com.teople.umat.core.data.remote.response.CoreGooglePlacesResponse.Companion.toEntity
import javax.inject.Inject

class CoreSearchRepositoryImpl @Inject constructor(
    private val placesDataSource : CoreGooglePlacesDataSource
) : CoreSearchRepository {
    override suspend fun requestGooglePlace(query: String): Result<CoreGooglePlacesEntity> {
        return kotlin.runCatching {
            placesDataSource.requestGooglePlace(
                request = CoreGooglePlacesRequest(
                    textQuery = query
                )
            ).toEntity()
        }
    }
}