package com.teople.onboarding.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

class OnBoardingViewModel : ViewModel() {
    private val _nickNameTextFieldValue = MutableStateFlow("")
    val nickNameTextFieldValue: StateFlow<String> = _nickNameTextFieldValue

    private val _inviteCodeTextFieldValue = MutableStateFlow("")
    val inviteCodeTextFieldValue: StateFlow<String> = _inviteCodeTextFieldValue

    val isButtonEnabled: StateFlow<Boolean> = _nickNameTextFieldValue.map { it.length <= 6 }
        .stateIn(viewModelScope, SharingStarted.Eagerly, false)

    val isInviteCodeValid: StateFlow<Boolean> =
        _inviteCodeTextFieldValue.map { it.length < 6 } // 추후에 초대코드 형식에 맞춰 변경필요
            .stateIn(viewModelScope, SharingStarted.Eagerly, false)

    fun onTextFieldValueChange(newValue: String) {
        _nickNameTextFieldValue.value = newValue
    }

    fun onInviteCodeTextFieldValueChange(newValue: String) {
        _inviteCodeTextFieldValue.value = newValue
    }
}