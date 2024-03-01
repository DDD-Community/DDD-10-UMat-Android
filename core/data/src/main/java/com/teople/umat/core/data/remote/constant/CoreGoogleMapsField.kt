package com.teople.umat.core.data.remote.constant

import com.teople.umat.core.data.BuildConfig

/**
 * Google Maps API Header (Maps & Places)
 *
 * @see HEADER_MAPS_API_KEY Google Maps API Key
 *
 * @see URL_PLACES_TEXT_SEARCH Google Places Text Search URL
 * @see HEADER_PLACES_TEXT_SEARCH_FIELD_MASK Google Places Text Search Request Fields
 *
 * @see URL_PLACES_PLACE_DETAILS Google Places Place Details URL
 * @see HEADER_PLACES_PLACE_DETAILS_FIELD_MASK Google Places Place Details Request Fields
 */
object CoreGoogleMapsField {

    const val HEADER_MAPS_API_KEY = "X-Goog-Api-Key: ${BuildConfig.GOOGLE_MAPS_API_KEY}"

    const val URL_PLACES_TEXT_SEARCH = "./places:searchText"
    const val HEADER_PLACES_TEXT_SEARCH_FIELD_MASK = "X-Goog-FieldMask: " +
            "places.id,places.displayName,places.formattedAddress,places.priceLevel,places.location"

    const val URL_PLACES_PLACE_DETAILS = "places/{placeId}"
    const val HEADER_PLACES_PLACE_DETAILS_FIELD_MASK = "X-Goog-FieldMask: " +
            "id,displayName,location,photos,formattedAddress,priceLevel,rating,currentOpeningHours"

//    const val URL_PLACES_PLACE_PHOTOS = "places/{placeId}/photos/{photoId}/media"
    const val URL_PLACES_PLACE_PHOTOS = "{name}/media"
}