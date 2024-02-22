package com.teople.umat.core.data.remote.constant

import com.teople.umat.core.data.BuildConfig

/**
 * Google Maps API Header (Maps & Places)
 *
 * @see HEADER_MAPS_API_KEY Google Maps API Key
 * @see HEADER_PLACES_FIELD_MASK Google Places Request Fields
 *
 * @see URL_PLACES_TEXT_SEARCH Google Places Request Url
 */
object CoreGoogleMapsField {

    const val HEADER_MAPS_API_KEY = "X-Goog-Api-Key: ${BuildConfig.GOOGLE_MAPS_API_KEY}"
    const val HEADER_PLACES_FIELD_MASK = "X-Goog-FieldMask: " +
            "places.id,places.displayName,places.formattedAddress,places.priceLevel,places.location"

    const val URL_PLACES_TEXT_SEARCH = "./places:searchText"
}