package com.teople.umat.feature.home

import androidx.lifecycle.ViewModel
import com.naver.maps.geometry.LatLng
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel : ViewModel() {
    // val myFavoriteList = StateFlow<List<Place>>() this will be used when user add the favorite place

    private val _currentPositionFlow = MutableStateFlow(LatLng(SEOUL_LAT, SEOUL_LNG)) // init position
    val currentPositionFlow = _currentPositionFlow.asStateFlow()

    fun getFavoriteCount(/* user */): Int {
        // will return the count of user's favorite place
        return 0
    }

    fun setCurrentPosition(latLng: LatLng) {
        _currentPositionFlow.value = latLng
    }

    companion object {
        const val SEOUL_LAT = 37.5665
        const val SEOUL_LNG = 126.9780
    }
}