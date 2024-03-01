package com.teople.umat.core.data.repository

import com.teople.umat.core.data.CorePlaceRepository
import com.teople.umat.core.data.entity.CoreGooglePlacesDetailEntity
import com.teople.umat.core.data.remote.CoreGooglePlacesDataSource
import com.teople.umat.core.data.remote.response.CoreGooglePlacesDetailResponse.Companion.toEntity
import javax.inject.Inject

class CorePlaceRepositoryImpl @Inject constructor(
    private val placesDataSource: CoreGooglePlacesDataSource
): CorePlaceRepository {

    /**
     * Return with Place Detail & Place Photo
     */
    override suspend fun requestPlaceDetail(placeId: String): Result<CoreGooglePlacesDetailEntity> {
        return kotlin.runCatching {

            // Place Detail
            val response = placesDataSource.requestPlaceDetail(
                placeId = placeId
            )

            // Place Photo
            val photoName = response.photos?.first()?.name.orEmpty()
            val placePhoto = if (photoName.isNotBlank()) {
                placesDataSource.requestPlacePhoto(
                    photoName = photoName
                ).photoUri ?: ""
            } else {
                ""
            }

            response.toEntity(placePhoto)
        }
    }
}