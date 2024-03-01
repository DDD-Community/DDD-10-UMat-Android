package com.teople.umat.feature.home

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import com.naver.maps.geometry.LatLng
import com.teople.umat.core.data.entity.CoreGooglePlacesDetailEntity
import com.teople.umat.feature.home.data.MockPositionItem
import com.teople.umat.feature.home.data.mockPositionItems
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    // val myFavoriteList = StateFlow<List<Place>>() this will be used when user add the favorite place

    private val selectedPlace = savedStateHandle.get<String>("selectedPlace")

    val tempPlaceList = mockPositionItems

    private val _currentPositionFlow =
        MutableStateFlow(LatLng(SEOUL_LAT, SEOUL_LNG)) // init position
    val currentPositionFlow = _currentPositionFlow.asStateFlow()

    private val _currentCameraPositionFlow =
        MutableStateFlow(LatLng(SEOUL_LAT, SEOUL_LNG)) // init position
    val currentCameraPositionFlow = _currentCameraPositionFlow.asStateFlow()

    private val _currentCircleRadiusFlow = MutableStateFlow(0.0)
    val currentCircleRadiusFlow = _currentCircleRadiusFlow.asStateFlow()

    private val _currentBoundItemsFlow = MutableStateFlow(listOf<MockPositionItem>())
    val currentBoundItemsFlow = _currentBoundItemsFlow.asStateFlow()

    init {
        Gson().fromJson(selectedPlace, CoreGooglePlacesDetailEntity::class.java)?.let {
            Log.d("selectedPlace", it.toString())
        }
    }

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

    fun getCurrentPositionFavoriteCountByType(type: WishType, currentPosition: LatLng): Int {
        return tempPlaceList
            .filter { it.type == type }
            .filter { currentPosition.distanceTo(it.latLng) <= _currentCircleRadiusFlow.value }
            .size
    }

    fun getCurrentPositionFavoriteCount(currentPosition: LatLng): Int {
        return tempPlaceList
            .filter { currentPosition.distanceTo(it.latLng) <= _currentCircleRadiusFlow.value }
            .also { _currentBoundItemsFlow.value = it }
            .size
    }

    companion object {
        const val SEOUL_LAT = 37.5665
        const val SEOUL_LNG = 126.9780
    }
}