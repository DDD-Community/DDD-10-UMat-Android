package com.teople.umat.feature.home

import androidx.lifecycle.ViewModel
import com.naver.maps.geometry.LatLng
import com.teople.umat.feature.home.data.mockPositionItems
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel : ViewModel() {
    // val myFavoriteList = StateFlow<List<Place>>() this will be used when user add the favorite place

    val tempPlaceList = mockPositionItems

    private val _currentPositionFlow =
        MutableStateFlow(LatLng(SEOUL_LAT, SEOUL_LNG)) // init position
    val currentPositionFlow = _currentPositionFlow.asStateFlow()

    private val _currentCameraPositionFlow =
        MutableStateFlow(LatLng(SEOUL_LAT, SEOUL_LNG)) // init position
    val currentCameraPositionFlow = _currentCameraPositionFlow.asStateFlow()

    private val _currentCircleRadiusFlow = MutableStateFlow(0.0)
    val currentCircleRadiusFlow = _currentCircleRadiusFlow.asStateFlow()


    fun setCurrentPosition(latLng: LatLng) {
        _currentPositionFlow.value = latLng
    }

    fun updateCurrentCircleRadius(radius: Double, paddingPercent: Double) {
        _currentCircleRadiusFlow.value = radius * (1.0 - paddingPercent)
    }

    fun isPositionInBound(latLng: LatLng, currentPosition: LatLng): Boolean {
        return currentPosition.distanceTo(latLng) <= _currentCircleRadiusFlow.value
    }

    fun updateCurrentCameraPosition(latLng: LatLng) {
        _currentCameraPositionFlow.value = latLng
    }

    companion object {
        const val SEOUL_LAT = 37.5665
        const val SEOUL_LNG = 126.9780
    }
}