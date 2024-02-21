package com.teople.umat.core.data.remote.response

import com.google.gson.annotations.SerializedName
import com.teople.umat.core.data.entity.CoreGooglePlacesEntity

data class CoreGooglePlacesResponse(
    @SerializedName("places") val places: List<Place>
) {
    data class Place(
        @SerializedName("id") val id: String,
        @SerializedName("displayName") val displayName: DisplayName,
        @SerializedName("formattedAddress") val formattedAddress: String,
        @SerializedName("location") val location: Location
    ) {

        data class DisplayName(
            @SerializedName("text") val text: String,
            @SerializedName("languageCode") val languageCode: String
        )

        data class Location(
            @SerializedName("latitude") val latitude: Number,
            @SerializedName("longitude") val longitude: Number
        )
    }

    companion object {
        fun CoreGooglePlacesResponse.toEntity(): CoreGooglePlacesEntity {
            return CoreGooglePlacesEntity(
                places = this.places.map { place ->
                    CoreGooglePlacesEntity.Place(
                        id = place.id,
                        displayName = CoreGooglePlacesEntity.Place.DisplayName(
                            text = place.displayName.text,
                            languageCode = place.displayName.languageCode
                        ),
                        formattedAddress = place.formattedAddress,
                        location = CoreGooglePlacesEntity.Place.Location(
                            latitude = place.location.latitude.toLong(),
                            longitude = place.location.longitude.toLong()
                        )

                    )
                }
            )
        }
    }
}
