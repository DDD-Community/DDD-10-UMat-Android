package com.teople.umat.core.data.remote

import com.teople.umat.core.data.remote.constant.CoreGoogleMapsField
import com.teople.umat.core.data.remote.request.CoreGooglePlacesRequest
import com.teople.umat.core.data.remote.response.CoreGooglePlacesResponse
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

/**
 * Google Place API DataSource
 */
interface CoreGooglePlacesDataSource {

    @Headers(
        CoreGoogleMapsField.HEADER_MAPS_API_KEY,
        CoreGoogleMapsField.HEADER_PLACES_TEXT_SEARCH_FIELD_MASK
    )
    @POST(CoreGoogleMapsField.URL_PLACES_TEXT_SEARCH)
    suspend fun requestGooglePlace(
        @Body request: CoreGooglePlacesRequest
    ): CoreGooglePlacesResponse
    suspend fun requestTextSearch(
        @Body request: CoreGooglePlacesSearchRequest
    ): CoreGooglePlacesSearchResponse

}