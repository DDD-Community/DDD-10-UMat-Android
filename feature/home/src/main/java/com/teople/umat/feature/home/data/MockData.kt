package com.teople.umat.feature.home.data

import com.teople.umat.core.data.entity.CoreGooglePlacesDetailEntity
import com.teople.umat.feature.home.WishType

// 랜덤한 WishType을 반환하는 함수
fun getRandomWishType(): WishType {
    val randomIndex = (Math.random() * WishType.entries.size).toInt()
    return WishType.entries[randomIndex]
}

val myList = mutableListOf(
    CoreGooglePlacesDetailEntity(
        id = "ChIJm6tkrgewfDUREWj6SYROVDI",
        displayName = CoreGooglePlacesDetailEntity.DisplayName(
            text = "대성반점(구)대성원",
            languageCode = "ko"
        ),
        formattedAddress = "대한민국 서울특별시 강동구 천호제2동 천중로15길 37",
        location = CoreGooglePlacesDetailEntity.Location(
            latitude = 37.5467012,
            longitude = 127.12816199999999
        ),
        photoUrl = "https://lh3.googleusercontent.com/places/ANXAkqErX2O7tutR0YAMr9BeIFxB5sin_QKq47GzHFTmoXef1pp0INkW2lE8m6yJLMwwKhOC92swibCoCIjt8rDhEK5R6OK9ubLsC-0=s4800-h1024",
        priceLevel = CoreGooglePlacesDetailEntity.PriceLevel.PRICE_LEVEL_UNSPECIFIED,
        hours = CoreGooglePlacesDetailEntity.Hour(
            openNow = false,
            periods = listOf(
                CoreGooglePlacesDetailEntity.Hour.Period(
                    open = CoreGooglePlacesDetailEntity.Hour.Period.Time(
                        day = "0",
                        hour = "11",
                        minute = "00",
                        date = CoreGooglePlacesDetailEntity.Hour.Period.Time.Date(
                            year = "2024",
                            month = "3",
                            day = "3"
                        )
                    ),
                    close = CoreGooglePlacesDetailEntity.Hour.Period.Time(
                        day = "0",
                        hour = "21",
                        minute = "00",
                        date = CoreGooglePlacesDetailEntity.Hour.Period.Time.Date(
                            year = "2024",
                            month = "3",
                            day = "3"
                        )
                    )
                ),
                // 나머지 기간 데이터를 채워넣으세요
            ),
            weekdayDescription = emptyList() // 주중 설명을 채워넣으세요
        ),
        rating = 4.3
    ),
    CoreGooglePlacesDetailEntity(
        id = "ChIJsYva9giwfDURJ3f6hxUDgSQ",
        displayName = CoreGooglePlacesDetailEntity.DisplayName(
            text = "초롱이고모네부대찌개",
            languageCode = "ko"
        ),
        formattedAddress = "대한민국 서울특별시",
        location = CoreGooglePlacesDetailEntity.Location(
            latitude = 37.549875799999995,
            longitude = 127.12880399999999
        ),
        photoUrl = "https://lh3.googleusercontent.com/places/ANXAkqG16MZ_GwYiyXM1nc0I34iteQcw1jIFgoML3IJSON7q3lq9xpuMPI1AyY_90v2IOjJSche8wBleSRFFbjX5nFXrgNcoBa0C1XM=s4800-h1024",
        priceLevel = CoreGooglePlacesDetailEntity.PriceLevel.PRICE_LEVEL_INEXPENSIVE,
        hours = CoreGooglePlacesDetailEntity.Hour(
            openNow = false,
            periods = listOf(
                CoreGooglePlacesDetailEntity.Hour.Period(
                    open = CoreGooglePlacesDetailEntity.Hour.Period.Time(
                        day = "0",
                        hour = "11",
                        minute = "00",
                        date = CoreGooglePlacesDetailEntity.Hour.Period.Time.Date(
                            year = "2024",
                            month = "3",
                            day = "3"
                        )
                    ),
                    close = CoreGooglePlacesDetailEntity.Hour.Period.Time(
                        day = "0",
                        hour = "21",
                        minute = "30",
                        date = CoreGooglePlacesDetailEntity.Hour.Period.Time.Date(
                            year = "2024",
                            month = "3",
                            day = "3"
                        )
                    )
                ),
                // 나머지 기간 데이터를 채워넣으세요
            ),
            weekdayDescription = emptyList() // 주중 설명을 채워넣으세요
        ),
        rating = 4.0
    ),
    CoreGooglePlacesDetailEntity(
        id = "ChIJWxXq3d2xfDUR4fGSnogwhwE",
        displayName = CoreGooglePlacesDetailEntity.DisplayName(
            text = "서울본가순대",
            languageCode = "ko"
        ),
        formattedAddress = "대한민국 서울특별시 강동구 상암로41길 7",
        location = CoreGooglePlacesDetailEntity.Location(
            latitude = 37.546457,
            longitude = 127.14126739999999
        ),
        photoUrl = "https://lh3.googleusercontent.com/places/ANXAkqG5jE0uOQsphyJvhtlrOsqj_J97yqTes-nqSYONoTUlTpox1RwXslJOj1uQCywYEGAFrEY-xyqadLx-H_Nh_D0ADYQp4Jr-AlM=s4800-h1024",
        priceLevel = CoreGooglePlacesDetailEntity.PriceLevel.PRICE_LEVEL_UNSPECIFIED,
        hours = CoreGooglePlacesDetailEntity.Hour(
            openNow = false,
            periods = listOf(
                CoreGooglePlacesDetailEntity.Hour.Period(
                    open = CoreGooglePlacesDetailEntity.Hour.Period.Time(
                        day = "0",
                        hour = "10",
                        minute = "00",
                        date = CoreGooglePlacesDetailEntity.Hour.Period.Time.Date(
                            year = "2024",
                            month = "3",
                            day = "3"
                        )
                    ),
                    close = CoreGooglePlacesDetailEntity.Hour.Period.Time(
                        day = "0",
                        hour = "11",
                        minute = "00",
                        date = CoreGooglePlacesDetailEntity.Hour.Period.Time.Date(
                            year = "2024",
                            month = "3",
                            day = "3"
                        )
                    )
                ),
                // 나머지 기간 데이터를 채워넣으세요
            ),
            weekdayDescription = emptyList() // 주중 설명을 채워넣으세요
        ),
        rating = 4.0
    ),
    CoreGooglePlacesDetailEntity(
        id = "ChIJa1b8MG2vfDURpI21ttDLnDU",
        displayName = CoreGooglePlacesDetailEntity.DisplayName(
            text = "스시정",
            languageCode = "ko"
        ),
        formattedAddress = "대한민국 서울특별시 강동구 둔촌동 56",
        location = CoreGooglePlacesDetailEntity.Location(
            latitude = 37.5335998,
            longitude = 127.1435418
        ),
        photoUrl = "https://lh3.googleusercontent.com/places/ANXAkqFarJ5ANElgA_MI3je_01N5QxBP6t_J9aGPr9dpVQHwI2Ivn5jycgHe5CY_tquODHsCPSCHtSGPMHIFd12tmNUJQq6zLTpNReM=s4800-h1024",
        priceLevel = CoreGooglePlacesDetailEntity.PriceLevel.PRICE_LEVEL_UNSPECIFIED,
        hours = CoreGooglePlacesDetailEntity.Hour(
            openNow = false,
            periods = listOf(
                CoreGooglePlacesDetailEntity.Hour.Period(
                    open = CoreGooglePlacesDetailEntity.Hour.Period.Time(
                        day = "0",
                        hour = "10",
                        minute = "00",
                        date = CoreGooglePlacesDetailEntity.Hour.Period.Time.Date(
                            year = "2024",
                            month = "3",
                            day = "3"
                        )
                    ),
                    close = CoreGooglePlacesDetailEntity.Hour.Period.Time(
                        day = "0",
                        hour = "22",
                        minute = "00",
                        date = CoreGooglePlacesDetailEntity.Hour.Period.Time.Date(
                            year = "2024",
                            month = "3",
                            day = "3"
                        )
                    )
                ),
                // 나머지 기간 데이터를 채워넣으세요
            ),
            weekdayDescription = emptyList() // 주중 설명을 채워넣으세요
        ),
        rating = 4.8
    ),
    CoreGooglePlacesDetailEntity(
        id = "ChIJU4jDPEOxfDURo3haT3Uf1bU",
        displayName = CoreGooglePlacesDetailEntity.DisplayName(
            text = "공공장소",
            languageCode = "ko"
        ),
        formattedAddress = "대한민국 서울특별시 강동구 497-7 1층",
        location = CoreGooglePlacesDetailEntity.Location(
            latitude = 37.5509621,
            longitude = 127.13044
        ),
        photoUrl = "https://lh3.googleusercontent.com/places/ANXAkqHdIbcKPa1bZCsj_Xoxay-3lBxFMwtyPYSnUyBwEKDlmk5jk2vT6UrmVYb_wLN3eCg1bBgZYwfbxN2Y8jQsY8nPCYiRUS-8T_o=s4800-h1024",
        priceLevel = CoreGooglePlacesDetailEntity.PriceLevel.PRICE_LEVEL_UNSPECIFIED,
        hours = CoreGooglePlacesDetailEntity.Hour(
            openNow = false,
            periods = listOf(
                CoreGooglePlacesDetailEntity.Hour.Period(
                    open = CoreGooglePlacesDetailEntity.Hour.Period.Time(
                        day = "0",
                        hour = "12",
                        minute = "00",
                        date = CoreGooglePlacesDetailEntity.Hour.Period.Time.Date(
                            year = "2024",
                            month = "3",
                            day = "3"
                        )
                    ),
                    close = CoreGooglePlacesDetailEntity.Hour.Period.Time(
                        day = "0",
                        hour = "21",
                        minute = "30",
                        date = CoreGooglePlacesDetailEntity.Hour.Period.Time.Date(
                            year = "2024",
                            month = "3",
                            day = "3"
                        )
                    )
                ),
                // 나머지 기간 데이터를 채워넣으세요
            ),
            weekdayDescription = emptyList() // 주중 설명을 채워넣으세요
        ),
        rating = 4.6
    ),
    CoreGooglePlacesDetailEntity(
        id = "ChIJ770_6f6vfDURFACWIT8lD2Q",
        displayName = CoreGooglePlacesDetailEntity.DisplayName(
            text = "분더버거",
            languageCode = "ko"
        ),
        formattedAddress = "대한민국 서울특별시 강동구 성내동 21-1",
        location = CoreGooglePlacesDetailEntity.Location(
            latitude = 37.5356057,
            longitude = 127.12919710000001
        ),
        photoUrl = "https://lh3.googleusercontent.com/places/ANXAkqHQs5iKgUTCFqTwpe6f0VIU0dLZhSe0vNAlQ9qt-TVu38Rsy2hx0dq6Kc_l3IMts00S-js-wCIKLkkqAIxadrADyeHSmmtBmGE=s4800-h1024",
        priceLevel = CoreGooglePlacesDetailEntity.PriceLevel.PRICE_LEVEL_MODERATE,
        hours = CoreGooglePlacesDetailEntity.Hour(
            openNow = false,
            periods = listOf(
                CoreGooglePlacesDetailEntity.Hour.Period(
                    open = CoreGooglePlacesDetailEntity.Hour.Period.Time(
                        day = "0",
                        hour = "11",
                        minute = "30",
                        date = CoreGooglePlacesDetailEntity.Hour.Period.Time.Date(
                            year = "2024",
                            month = "3",
                            day = "3"
                        )
                    ),
                    close = CoreGooglePlacesDetailEntity.Hour.Period.Time(
                        day = "0",
                        hour = "21",
                        minute = "00",
                        date = CoreGooglePlacesDetailEntity.Hour.Period.Time.Date(
                            year = "2024",
                            month = "3",
                            day = "3"
                        )
                    )
                ),
                // 나머지 기간 데이터를 채워넣으세요
            ),
            weekdayDescription = emptyList() // 주중 설명을 채워넣으세요
        ),
        rating = 4.4
    ),
    CoreGooglePlacesDetailEntity(
        id = "ChIJjzv6N1WlfDURzhZ5rAsSwpQ",
        displayName = CoreGooglePlacesDetailEntity.DisplayName(
            text = "아웃백스테이크하우스 천호점",
            languageCode = "ko"
        ),
        formattedAddress = "대한민국 서울특별시 강동구 천호동 올림픽로 660 천호엘크루주상복합 지하 1층",
        location = CoreGooglePlacesDetailEntity.Location(
            latitude = 37.540172999999996,
            longitude = 127.12458999999998
        ),
        photoUrl = "https://lh3.googleusercontent.com/places/ANXAkqGLrNgbwI649_rcRXmyyG-_SKS8Bjqto1fRJI0qUnKgkl6HZBKO0jOZEqfdRdFYZMw1ZfwmVlv_KZqkhsfDuGi3_5cJ_9fc5E8=s4800-h1024",
        priceLevel = CoreGooglePlacesDetailEntity.PriceLevel.PRICE_LEVEL_EXPENSIVE,
        hours = CoreGooglePlacesDetailEntity.Hour(
            openNow = false,
            periods = listOf(
                CoreGooglePlacesDetailEntity.Hour.Period(
                    open = CoreGooglePlacesDetailEntity.Hour.Period.Time(
                        day = "0",
                        hour = "11",
                        minute = "30",
                        date = CoreGooglePlacesDetailEntity.Hour.Period.Time.Date(
                            year = "2024",
                            month = "3",
                            day = "3"
                        )
                    ),
                    close = CoreGooglePlacesDetailEntity.Hour.Period.Time(
                        day = "0",
                        hour = "22",
                        minute = "30",
                        date = CoreGooglePlacesDetailEntity.Hour.Period.Time.Date(
                            year = "2024",
                            month = "3",
                            day = "3"
                        )
                    )
                ),
                // 나머지 기간 데이터를 채워넣으세요
            ),
            weekdayDescription = emptyList() // 주중 설명을 채워넣으세요
        ),
        rating = 4.2
    )
)

val mockPositionItems = myList.map {
    MockPositionItem(
        it,
        getRandomWishType()
    )
}