package com.teople.umat.feature.home

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.naver.maps.geometry.LatLng
import com.teople.umat.core.data.entity.CoreGooglePlacesDetailEntity
import com.teople.umat.feature.home.data.MockPositionItem
import com.teople.umat.feature.home.data.mockPositionItems
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    // val myFavoriteList = StateFlow<List<Place>>() this will be used when user add the favorite place

    val tempPlaceList = mockPositionItems.toMutableList()

    private val selectedPlace = savedStateHandle.get<String>("selectedPlace")

    private val _selectedPlaceFlow = MutableStateFlow<CoreGooglePlacesDetailEntity?>(null)
    val selectedPlaceFlow: StateFlow<CoreGooglePlacesDetailEntity?> get() = _selectedPlaceFlow.asStateFlow()

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

    // FIXME. 목데이터 생성 & 셋업과 겹치기 때문에 이후 동작으로 별도 함수 호출 진행
    fun requestSelectedPlace(selectedPlace: CoreGooglePlacesDetailEntity?) {
        selectedPlace?.let {
            tempPlaceList.add(0, MockPositionItem(it, WishType.WISH_ME))

            viewModelScope.launch {
                val selectedPlaceLocation = LatLng(it.location.latitude, it.location.longitude)
                _currentPositionFlow.emit(selectedPlaceLocation)
                _currentCameraPositionFlow.emit(selectedPlaceLocation)
                _selectedPlaceFlow.emit(it)
            }
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
            .filter {
                currentPosition.distanceTo(
                    LatLng(
                        it.googlePlaceItem.location.latitude,
                        it.googlePlaceItem.location.longitude
                    )
                ) <= _currentCircleRadiusFlow.value
            }
            .size
    }

    fun getCurrentPositionFavoriteCount(currentPosition: LatLng): Int {
        return tempPlaceList
            .filter {
                currentPosition.distanceTo(
                    LatLng(
                        it.googlePlaceItem.location.latitude,
                        it.googlePlaceItem.location.longitude
                    )
                ) <= _currentCircleRadiusFlow.value
            }
            .also { _currentBoundItemsFlow.value = it }
            .size
    }

    companion object {
        const val SEOUL_LAT = 37.5665
        const val SEOUL_LNG = 126.9780
    }
}