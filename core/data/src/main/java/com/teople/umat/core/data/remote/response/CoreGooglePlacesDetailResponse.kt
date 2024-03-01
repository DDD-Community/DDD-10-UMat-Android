package com.teople.umat.core.data.remote.response

import com.google.gson.annotations.SerializedName
import com.teople.umat.core.data.entity.CoreGooglePlacesDetailEntity

data class CoreGooglePlacesDetailResponse(
    @SerializedName("id") val id: String?,
    @SerializedName("displayName") val displayName: DisplayName?,
    @SerializedName("formattedAddress") val formattedAddress: String?,
    @SerializedName("location") val location: Location?,
    @SerializedName("photos") val photos: List<Photo>?,
    @SerializedName("priceLevel") val priceLevel: String?,
    @SerializedName("currentOpeningHours") val hours: Hour?,
    @SerializedName("rating") val rating: Number?
) {

    data class DisplayName(
        @SerializedName("text") val text: String?,
        @SerializedName("languageCode") val languageCode: String?
    )

    data class Location(
        @SerializedName("latitude") val latitude: Number?,
        @SerializedName("longitude") val longitude: Number?
    )

    data class Photo(
        @SerializedName("name") val name: String?
    )

    /**
     * @param openNow 현재 영업 여부
     * @param periods 영업 시간
     * @param weekdayDescription 요일별 영업 시간 (데이터 순서 : 요일순)
     */
    data class Hour(
        @SerializedName("openNow") val openNow: Boolean,
        @SerializedName("periods") val periods: List<Period>?,
        @SerializedName("weekdayDescription") val weekdayDescription: List<String>?
    ) {

        data class Period(
            @SerializedName("open") val open: Time?,
            @SerializedName("close") val close: Time?
        ) {

            data class Time(
                @SerializedName("day") val day: String?,
                @SerializedName("hour") val hour: String?,
                @SerializedName("minute") val minute: String?,
                @SerializedName("date") val date: Date?
            ) {

                data class Date(
                    @SerializedName("year") val year: String?,
                    @SerializedName("month") val month: String?,
                    @SerializedName("day") val day: String?
                )
            }
        }
    }

    companion object {

        /**
         * @param photoUrl 장소 상세 이미지
         */
        fun CoreGooglePlacesDetailResponse.toEntity(
            photoUrl: String
        ): CoreGooglePlacesDetailEntity {
            return CoreGooglePlacesDetailEntity(
                id = id.orEmpty(),
                displayName = CoreGooglePlacesDetailEntity.DisplayName(
                    text = displayName?.text.orEmpty(),
                    languageCode = displayName?.languageCode.orEmpty()
                ),
                location = CoreGooglePlacesDetailEntity.Location(
                    latitude = location?.latitude ?: -1,
                    longitude = location?.longitude ?: -1
                ),
                formattedAddress = formattedAddress.orEmpty(),
                photoUrl = photoUrl,
                priceLevel = CoreGooglePlacesDetailEntity.PriceLevel.findType(
                    priceLevel.orEmpty()
                ),
                hours = CoreGooglePlacesDetailEntity.Hour(
                    openNow = hours?.openNow ?: false,
                    periods = hours?.periods?.map { period ->
                        CoreGooglePlacesDetailEntity.Hour.Period(
                            open = CoreGooglePlacesDetailEntity.Hour.Period.Time(
                                day = period.open?.day.orEmpty(),
                                hour = period.open?.hour.orEmpty(),
                                minute = period.open?.minute.orEmpty(),
                                date = CoreGooglePlacesDetailEntity.Hour.Period.Time.Date(
                                    year = period.open?.date?.year.orEmpty(),
                                    month = period.open?.date?.month.orEmpty(),
                                    day = period.open?.date?.day.orEmpty()
                                )
                            ),
                            close = CoreGooglePlacesDetailEntity.Hour.Period.Time(
                                day = period.close?.day.orEmpty(),
                                hour = period.close?.hour.orEmpty(),
                                minute = period.close?.minute.orEmpty(),
                                date = CoreGooglePlacesDetailEntity.Hour.Period.Time.Date(
                                    year = period.close?.date?.year.orEmpty(),
                                    month = period.close?.date?.month.orEmpty(),
                                    day = period.close?.date?.day.orEmpty()
                                )
                            )
                        )
                    } ?: emptyList(),
                    weekdayDescription = hours?.weekdayDescription?.map { description ->
                        description
                    } ?: emptyList()
                ),
                rating = rating ?: 0.0
            )
        }
    }
}