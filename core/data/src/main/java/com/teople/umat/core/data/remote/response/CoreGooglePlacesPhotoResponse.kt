package com.teople.umat.core.data.remote.response

import com.teople.umat.core.data.entity.CoreGooglePlacesPhotoEntity

/**
 * Google Places Photo Response
 * @param name 장소 사진 식별값
 * @param photoUrl 장소 사진 URL
 */
data class CoreGooglePlacesPhotoResponse(
    val name: String,
    val photoUrl: String
) {

    companion object {
        fun CoreGooglePlacesPhotoResponse.toEntity(): CoreGooglePlacesPhotoEntity {
            return CoreGooglePlacesPhotoEntity(
                name = this.name,
                photoUrl = this.photoUrl
            )
        }
    }
}
