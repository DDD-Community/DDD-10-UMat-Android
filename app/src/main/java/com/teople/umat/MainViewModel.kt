package com.teople.umat

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.teople.umat.core.data.CorePlaceRepository
import com.teople.umat.core.data.CorePreferenceRepository
import com.teople.umat.core.data.entity.CoreGooglePlacesDetailEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val placeRepository: CorePlaceRepository,
    private val preferenceRepository: CorePreferenceRepository
) : ViewModel() {

    private val placeId: String? = savedStateHandle.get<String>("placeId")

    private val _viewState = MutableStateFlow(ViewState())
    val viewState: StateFlow<ViewState> get() = _viewState.asStateFlow()

    private val _viewEvent = MutableSharedFlow<ViewEvent>()
    val viewEvent: SharedFlow<ViewEvent> get() = _viewEvent.asSharedFlow()

    init {

        getShownGuideDialogState()

        getSelectedPlaceDetail()
    }

    private fun getShownGuideDialogState() {
        viewModelScope.launch(Dispatchers.IO) {
            preferenceRepository.getShownGuideDialog().collectLatest {
                _viewState.update { viewState ->
                    viewState.copy(
                        isShownGuide = it
                    )
                }
            }
        }
    }

    private fun getSelectedPlaceDetail() {
        viewModelScope.launch(Dispatchers.IO) {
            placeId?.let {
                placeRepository.requestPlaceDetail(placeId).onSuccess {
                    _viewState.update { viewState ->
                        viewState.copy(
                            selectedPlace = it
                        )
                    }
                }.onFailure {
                    throw it
                }
            }
        }
    }

    fun setShownGuideDialog() {
        viewModelScope.launch(Dispatchers.IO) {
            preferenceRepository.setShownGuideDialog(true)
        }
    }

    fun removeSelectedPlace() {
        viewModelScope.launch(Dispatchers.IO) {
            _viewState.update { viewState ->
                viewState.copy(
                    selectedPlace = null
                )
            }
        }
    }

    data class ViewState(
        val selectedPlace: CoreGooglePlacesDetailEntity? = null,
        val isShownGuide: Boolean = true
    )

    sealed interface ViewEvent {

    }
}