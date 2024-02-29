package com.teople.umat.feature.home.data

import com.naver.maps.geometry.LatLng
import com.teople.umat.feature.home.WishType

// 서울시의 좌표를 랜덤으로 불러옴
fun generateRandomLatLng(): LatLng {
    val minLatitude = 37.4
    val maxLatitude = 37.7
    val minLongitude = 126.8
    val maxLongitude = 127.2

    val randomLatitude = minLatitude + (maxLatitude - minLatitude) * Math.random()
    val randomLongitude = minLongitude + (maxLongitude - minLongitude) * Math.random()

    return LatLng(randomLatitude, randomLongitude)
}

// 랜덤한 장소 목록 생성
val mockPositionItems = MutableList<MockPositionItem>(100) {
    val randomLatLng = generateRandomLatLng()
    val placeName = "Place ${it + 1}" // 장소 이름은 숫자로 표현

    MockPositionItem(
        placeName,
        randomLatLng,
        getRandomWishType() // WishType은 랜덤으로 선택
    )

}

// 랜덤한 WishType을 반환하는 함수
fun getRandomWishType(): WishType {
    val randomIndex = (Math.random() * WishType.entries.size).toInt()
    return WishType.entries[randomIndex]
}