package com.teople.umat.feature.search

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.teople.umat.core.data.CoreSearchRepository
import com.teople.umat.core.data.entity.CoreGooglePlacesEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val repository: CoreSearchRepository
) : ViewModel() {

    private val _viewState = MutableStateFlow(ViewState())
    val viewState: StateFlow<ViewState> get() = _viewState.asStateFlow()

    private val _viewEvent = MutableSharedFlow<ViewEvent>()
    val viewEvent: SharedFlow<ViewEvent> get() = _viewEvent.asSharedFlow()

    private val _query = MutableStateFlow("")

    init {
        requestGooglePlace()
    }

    // 검색 요청
    @OptIn(FlowPreview::class)
    private fun requestGooglePlace() {
        viewModelScope.launch {
            _query.filter { query ->
                query.isNotBlank()
            }.debounce(500L).collect { query ->
                repository.requestGooglePlace(query).onSuccess {
                    _viewState.update { viewState ->
                        viewState.copy(
                            searchResult = it.places
                        )
                    }
                }.onFailure {
                    Log.d("request google places error", it.message.toString())
                }
            }
        }
    }

    fun onActionHandle(event: ViewEvent) {
        viewModelScope.launch {
            when (event) {
                is ViewEvent.ClickPlace -> _viewEvent.emit(event)
            }
        }
    }

    // 검색 쿼리 입력
    fun searchQueryInput(query: String) {
        viewModelScope.launch {
            _query.emit(query)
        }
    }

    data class ViewState(
        val searchResult: List<CoreGooglePlacesEntity.Place> = emptyList()
    )

    sealed interface ViewEvent {

        // 검색된 장소 클릭
        data class ClickPlace(
            val data: CoreGooglePlacesEntity.Place
        ) : ViewEvent
    }
}