package com.teople.umat.feature.home

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SheetValue
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.material3.rememberStandardBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.lifecycle.flowWithLifecycle
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.naver.maps.geometry.LatLng
import com.naver.maps.map.CameraAnimation
import com.naver.maps.map.CameraUpdate
import com.naver.maps.map.compose.ExperimentalNaverMapApi
import com.naver.maps.map.compose.LocationTrackingMode
import com.naver.maps.map.compose.MapProperties
import com.naver.maps.map.compose.MapUiSettings
import com.naver.maps.map.compose.NaverMap
import com.naver.maps.map.compose.rememberCameraPositionState
import com.naver.maps.map.compose.rememberFusedLocationSource
import com.teople.umat.component.icon.UmatIcon
import com.teople.umat.component.icon.umaticon.IcProfileUserBlueFilled
import com.teople.umat.component.icon.umaticon.IcProfileUserOrangeFilled
import com.teople.umat.component.icon.umaticon.IcProfileUserPurpleFilled
import com.teople.umat.component.ui.theme.Gray100
import com.teople.umat.component.ui.theme.Gray300
import com.teople.umat.component.ui.theme.Gray400
import com.teople.umat.component.ui.theme.Gray800
import com.teople.umat.component.ui.theme.UmatTypography
import com.teople.umat.feature.home.component.HomeSearchBar
import com.teople.umat.navigator.NavRoute
import kotlinx.coroutines.launch

@OptIn(
    ExperimentalNaverMapApi::class, ExperimentalMaterial3Api::class,
)
@Composable
fun HomeScreen(
    actionRoute: (route: NavRoute) -> Unit
) {
//    val locationPermissionState =
//        rememberPermissionState(Manifest.permission.ACCESS_COARSE_LOCATION)
//    if (locationPermissionState.status.isGranted) {
//
//    } else {
//
//    }
    val homeViewModel = HomeViewModel()
    val fusedLocationClient = LocationServices.getFusedLocationProviderClient(LocalContext.current)
    val scaffoldState = rememberBottomSheetScaffoldState(
        bottomSheetState = rememberStandardBottomSheetState(
            initialValue = SheetValue.PartiallyExpanded,
            skipHiddenState = true
        )
    )
    val cameraPositionState = rememberCameraPositionState(key = "user")

    val lifecycle = LocalLifecycleOwner.current.lifecycle
    val coroutineScope = rememberCoroutineScope()

    coroutineScope.launch {
        homeViewModel.currentPositionFlow.flowWithLifecycle(lifecycle).collect {
            cameraPositionState.animate(
                update = CameraUpdate.scrollTo(LatLng(it.latitude, it.longitude)),
                animation = CameraAnimation.Easing,
                durationMs = 1000
            )
        }
    }

    BottomSheetScaffold(
        modifier = Modifier,
        sheetPeekHeight = 160.dp,
        sheetContent = {
            UmatBottomSheetScreen()
        },
        scaffoldState = scaffoldState,
        sheetContainerColor = Color.White
    ) {
        Box {
            // 지도
            NaverMap(
                modifier = Modifier
                    .fillMaxSize()
                    .zIndex(0f),
                locationSource = rememberFusedLocationSource(isCompassEnabled = true),
                properties = MapProperties(
                    locationTrackingMode = LocationTrackingMode.NoFollow,
                ),
                uiSettings = MapUiSettings(
                    isLocationButtonEnabled = false,
                    isZoomControlEnabled = false
                ),
                cameraPositionState = cameraPositionState
            )

            // 검색바
            HomeSearchBar(
                actionSearchClick = {
                    actionRoute(NavRoute.Search)
                },
                requestPositionClick = {
                    requestCurrentPosition(fusedLocationClient, homeViewModel)
                }
            )
        }
    }
}


@Composable
fun UmatBottomSheetScreen() {
    Column(
        modifier = Modifier
            .height(340.dp)
            .background(Color.White)
    ) {
        Row(modifier = Modifier.padding(start = 20.dp)) {
            Text("현위치", style = UmatTypography().pretendardBold12, color = Gray300)
            Text(
                "성동구 옥수동",
                style = UmatTypography().pretendardBold12,
                color = Color.Black,
                modifier = Modifier.padding(start = 2.dp)
            ) // TODO : 현위치 가져오기
        }
        Text(
            text = "총 %d 개의 장소".format(10),
            style = UmatTypography().pretendardSemiBold18,
            modifier = Modifier.padding(start = 20.dp, top = 6.dp)
        )
        Divider(
            modifier = Modifier
                .padding(top = 12.dp, bottom = 14.dp)
                .padding(horizontal = 16.dp),
            color = Gray100
        )
        Row(
            modifier = Modifier.padding(start = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            WishPlaceButton(wishType = WishType.WISH_OUR)
            WishPlaceButton(wishType = WishType.WISH_ME)
            WishPlaceButton(wishType = WishType.WISH_YOUR)
        }
    }
}

@Composable
fun WishPlaceButton(
    wishType: WishType = WishType.WISH_OUR
) {
    val isSelected by remember { mutableStateOf(false) }
    Row(
        modifier = Modifier
            .width(92.dp)
            .height(32.dp)
            .border(
                1.dp,
                color = if (isSelected) Gray800 else Gray300,
                shape = RoundedCornerShape(32.dp)
            ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier
                .size(16.dp)
                .padding(end = 1.dp),
            contentScale = ContentScale.FillWidth,
            imageVector = wishType.imageVector,
            contentDescription = null
        )
        Text(
            text = wishType.displayName,
            style = UmatTypography().pretendardSemiBold12,
            modifier = Modifier.padding(end = 1.dp)
        )
        Text(text = "220", style = UmatTypography().pretendardSemiBold12)
    }
}

private fun requestCurrentPosition(
    fusedLocationClient: FusedLocationProviderClient,
    homeViewModel: HomeViewModel
) {
    // 추후에 권한요청추, 권한없어서 요청을 안할뿐 앱이 죽지않음
    fusedLocationClient.lastLocation.addOnSuccessListener {
        homeViewModel.setCurrentPosition(LatLng(it.latitude, it.longitude))
    }
}

enum class WishType(
    val imageVector: ImageVector,
    val displayName: String
) {
    WISH_OUR(UmatIcon.IcProfileUserPurpleFilled, "우리"),
    WISH_ME(UmatIcon.IcProfileUserBlueFilled, "지훈"),
    WISH_YOUR(UmatIcon.IcProfileUserOrangeFilled, "주은"),
}

@Preview(showBackground = true, widthDp = 360, heightDp = 640)
@Composable
fun UmatBottomSheet() {
    UmatBottomSheetScreen()
}

@Preview
@Composable
fun WishButton() {
    WishPlaceButton()
}