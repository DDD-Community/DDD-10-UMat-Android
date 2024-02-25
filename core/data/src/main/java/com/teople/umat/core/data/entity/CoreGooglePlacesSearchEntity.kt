package com.teople.umat.core.data.entity

/**
 * Google Place Entity
 */
data class CoreGooglePlacesSearchEntity(
    val places: List<Place>
) {
    /**
     * @param id 장소 식별값
     * @param displayName 위치명
     * @param formattedAddress 주소
     * @param location 위치 위도, 경도
     */
    data class Place(
        val id: String,
        val displayName: DisplayName,
        val formattedAddress: String,
        val location: Location
    ) {

        data class DisplayName(
            val text: String,
            val languageCode: String
        )

        data class Location(
            val latitude: Long,
            val longitude: Long
        )
    }
}
