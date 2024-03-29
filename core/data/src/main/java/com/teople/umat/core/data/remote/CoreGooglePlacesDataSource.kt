package com.teople.umat.core.data.remote

import com.teople.umat.core.data.remote.constant.CoreGoogleMapsField
import com.teople.umat.core.data.remote.request.CoreGooglePlacesSearchRequest
import com.teople.umat.core.data.remote.response.CoreGooglePlacesDetailResponse
import com.teople.umat.core.data.remote.response.CoreGooglePlacesPhotoResponse
import com.teople.umat.core.data.remote.response.CoreGooglePlacesSearchResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Google Place API DataSource
 */
interface CoreGooglePlacesDataSource {

    @Headers(
        CoreGoogleMapsField.HEADER_MAPS_API_KEY,
        CoreGoogleMapsField.HEADER_PLACES_TEXT_SEARCH_FIELD_MASK
    )
    @POST(CoreGoogleMapsField.URL_PLACES_TEXT_SEARCH)
    suspend fun requestTextSearch(
        @Body request: CoreGooglePlacesSearchRequest
    ): CoreGooglePlacesSearchResponse

    @Headers(
        CoreGoogleMapsField.HEADER_MAPS_API_KEY,
        CoreGoogleMapsField.HEADER_PLACES_PLACE_DETAILS_FIELD_MASK
    )
    @GET(CoreGoogleMapsField.URL_PLACES_PLACE_DETAILS)
    suspend fun requestPlaceDetail(
        @Path("placeId") placeId: String,
        @Query("languageCode") languageCode: String = "ko"
    ): CoreGooglePlacesDetailResponse

    @Headers(
        CoreGoogleMapsField.HEADER_MAPS_API_KEY
    )
    @GET(CoreGoogleMapsField.URL_PLACES_PLACE_PHOTOS)
    suspend fun requestPlacePhoto(
        @Path("name", encoded = true) photoName: String,
        @Query("maxHeightPx") heightPx: Int = 1024,
        @Query("skipHttpRedirect") skipHttpRedirect: Boolean = true
    ): CoreGooglePlacesPhotoResponse
}