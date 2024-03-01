package com.teople.umat.core.data.entity

data class CoreGooglePlacesDetailEntity(
    val id: String,
    val displayName: DisplayName,
    val formattedAddress: String,
    val location: Location,
    val photoUrl: String,
    val priceLevel: PriceLevel,
    val hours: Hour,
    val rating: Number
) {
    data class DisplayName(
        val text: String,
        val languageCode: String
    )

    data class Location(
        val latitude: Double,
        val longitude: Double
    )

    data class Hour(
        val openNow: Boolean,
        val periods: List<Period>,
        val weekdayDescription: List<String>
    ) {

        data class Period(
            val open: Time,
            val close: Time
        ) {

            data class Time(
                val day: String,
                val hour: String,
                val minute: String,
                val date: Date
            ) {

                data class Date(
                    val year: String,
                    val month: String,
                    val day: String
                )
            }
        }
    }

    /**
     * @param level 상수별 등급
     *
     * @see PRICE_LEVEL_UNSPECIFIED 장소 가격 수준이 지정되지 않았거나 알 수 없습니다.
     * @see PRICE_LEVEL_FREE Place는 무료 서비스를 제공합니다.
     * @see PRICE_LEVEL_INEXPENSIVE 장소는 저렴한 서비스를 제공합니다.
     * @see PRICE_LEVEL_MODERATE 합리적인 가격의 서비스를 제공합니다.
     * @see PRICE_LEVEL_EXPENSIVE 합리적인 가격의 서비스를 제공합니다.
     * @see PRICE_LEVEL_VERY_EXPENSIVE Place는 매우 비싼 서비스를 제공합니다.
     */
    enum class PriceLevel(
        val level: String
    ) {
        PRICE_LEVEL_UNSPECIFIED(""),
        PRICE_LEVEL_FREE("₩"),
        PRICE_LEVEL_INEXPENSIVE("₩₩"),
        PRICE_LEVEL_MODERATE("₩₩₩"),
        PRICE_LEVEL_EXPENSIVE("₩₩₩₩"),
        PRICE_LEVEL_VERY_EXPENSIVE("₩₩₩₩₩");

        companion object {

            fun findType(value: String): PriceLevel {
                return entries.find {
                    it.name == value
                } ?: PRICE_LEVEL_UNSPECIFIED
            }
        }
    }
}
