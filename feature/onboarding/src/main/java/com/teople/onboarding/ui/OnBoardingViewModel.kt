package com.teople.onboarding.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import com.teople.umat.navigator.NavRoute
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class OnBoardingViewModel(
    private val navController: NavController
) : ViewModel() {
    private val _nickNameTextFieldValue = MutableStateFlow("")
    val nickNameTextFieldValue: StateFlow<String> = _nickNameTextFieldValue

    private val _inviteCodeTextFieldValue = MutableStateFlow("")
    val inviteCodeTextFieldValue: StateFlow<String> = _inviteCodeTextFieldValue

    val isButtonEnabled: StateFlow<Boolean> = _nickNameTextFieldValue.map { it.length <= 6 }
        .stateIn(viewModelScope, SharingStarted.Eagerly, false)

    val isInviteCodeValid: StateFlow<Boolean> =
        _inviteCodeTextFieldValue.map { it.length < 6 } // 추후에 초대코드 형식에 맞춰 변경필요
            .stateIn(viewModelScope, SharingStarted.Eagerly, false)

    // FIXME 추후 ViewModel 구조 통일 후 변경 필요
    private val _navigator = MutableSharedFlow<NavRoute>()
    val navigator: SharedFlow<NavRoute> get() = _navigator.asSharedFlow()

    fun navigateToUp() {
        navController.navigateUp()
    }

    fun navigateToSocialLogin() {
        navController.navigate(OnBoardingScreens.SocialLogin.name)
    }

    fun navigateToNickName() {
        navController.navigate(OnBoardingScreens.Nickname.name)
    }

    fun navigateToInviteCode() {
        navController.navigate(OnBoardingScreens.InviteCode.name)
    }

    fun navigateToConnect() {
        navController.navigate(OnBoardingScreens.Connect.name)
    }

    fun navigateToMain() {
        viewModelScope.launch {
            _navigator.emit(NavRoute.Main)
        }
    }

    fun onTextFieldValueChange(newValue: String) {
        _nickNameTextFieldValue.value = newValue
    }

    fun onInviteCodeTextFieldValueChange(newValue: String) {
        _inviteCodeTextFieldValue.value = newValue
    }

    fun onClickConnect() {
        TODO("상대방 초대코드 입력 후 연결 동작")
    }

}