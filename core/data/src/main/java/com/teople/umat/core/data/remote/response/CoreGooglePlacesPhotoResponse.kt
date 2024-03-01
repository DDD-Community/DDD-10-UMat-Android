package com.teople.umat.core.data.remote.response

import com.google.gson.annotations.SerializedName
import com.teople.umat.core.data.entity.CoreGooglePlacesPhotoEntity

/**
 * Google Places Photo Response
 * @param name 장소 사진 식별값
 * @param photoUri 장소 사진 URI
 */
data class CoreGooglePlacesPhotoResponse(
    @SerializedName("name") val name: String?,
    @SerializedName("photoUri") val photoUri: String?
) {

    companion object {
        fun CoreGooglePlacesPhotoResponse.toEntity(): CoreGooglePlacesPhotoEntity {
            return CoreGooglePlacesPhotoEntity(
                name = this.name.orEmpty(),
                photoUrl = this.photoUri.orEmpty()
            )
        }
    }
}
