package com.teople.umat.feature.home

import android.content.Context
import android.location.Geocoder
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SheetValue
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.material3.rememberStandardBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.flowWithLifecycle
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.naver.maps.geometry.LatLng
import com.naver.maps.map.CameraAnimation
import com.naver.maps.map.CameraUpdate
import com.naver.maps.map.compose.CircleOverlay
import com.naver.maps.map.compose.ExperimentalNaverMapApi
import com.naver.maps.map.compose.LocationTrackingMode
import com.naver.maps.map.compose.MapProperties
import com.naver.maps.map.compose.MapUiSettings
import com.naver.maps.map.compose.Marker
import com.naver.maps.map.compose.MarkerState
import com.naver.maps.map.compose.NaverMap
import com.naver.maps.map.compose.rememberCameraPositionState
import com.naver.maps.map.compose.rememberFusedLocationSource
import com.naver.maps.map.overlay.OverlayImage
import com.teople.umat.component.icon.UmatIcon
import com.teople.umat.component.icon.umaticon.IcFilterMe
import com.teople.umat.component.icon.umaticon.IcFilterOur
import com.teople.umat.component.icon.umaticon.IcFilterYou
import com.teople.umat.component.icon.umaticon.IcSadFilled
import com.teople.umat.component.ui.theme.Blue300
import com.teople.umat.component.ui.theme.Gray100
import com.teople.umat.component.ui.theme.Gray300
import com.teople.umat.component.ui.theme.Gray400
import com.teople.umat.component.ui.theme.Gray600
import com.teople.umat.component.ui.theme.Gray800
import com.teople.umat.component.ui.theme.UmatTypography
import com.teople.umat.component.ui.theme.noRippleClickable
import com.teople.umat.component.widget.component.UmatItemCard
import com.teople.umat.core.data.entity.CoreGooglePlacesDetailEntity
import com.teople.umat.feature.home.HomeViewModel.Companion.SEOUL_LAT
import com.teople.umat.feature.home.HomeViewModel.Companion.SEOUL_LNG
import com.teople.umat.feature.home.component.HomeSearchBar
import com.teople.umat.feature.home.data.MockPositionItem
import com.teople.umat.navigator.NavRoute
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.Locale

@OptIn(
    ExperimentalNaverMapApi::class, ExperimentalMaterial3Api::class,
)
@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel(),
    actionRoute: (route: NavRoute) -> Unit,
    sharedTitle: String? = null,
    selectedPlace: CoreGooglePlacesDetailEntity? = null
) {
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
        viewModel.currentPositionFlow.flowWithLifecycle(lifecycle).collect {
            cameraPositionState.animate(
                update = CameraUpdate.scrollTo(LatLng(it.latitude, it.longitude)),
                animation = CameraAnimation.Easing,
                durationMs = 1000
            )
        }
    }

    var currentPositionBoundRequested by remember {
        mutableStateOf(true)
    }

    val currentScreenSize = LocalConfiguration.current.screenWidthDp
    val currentCircleBoundPaddingPercent: Double = 16.0 / currentScreenSize

    fun drawCurrentPositionCircle() {
        with(cameraPositionState) {
            val distance = HomeUtil.calculateDistance(
                lat1 = this.position.target.latitude,
                lon1 = this.contentBounds?.eastLongitude ?: return@with,
                lat2 = this.position.target.latitude,
                lon2 = this.contentBounds?.westLongitude ?: return@with
            )
            viewModel.updateCurrentCircleRadius(
                distance * 1000 / 2,
                currentCircleBoundPaddingPercent
            )
            viewModel.updateCurrentCameraPosition(this.position.target)
        }
    }

    val currentCameraPosition = viewModel.currentCameraPositionFlow.collectAsState()
    val currentRadius = viewModel.currentCircleRadiusFlow.collectAsState()
    var currentWishTypeState by remember { mutableStateOf(WishType.WISH_OUR) }

    LaunchedEffect(selectedPlace) {
        viewModel.requestSelectedPlace(selectedPlace)
    }

    coroutineScope.launch {
        viewModel.selectedPlaceFlow.flowWithLifecycle(lifecycle).filterNotNull().collect {
            currentWishTypeState = WishType.WISH_ME
        }
    }

    BottomSheetScaffold(
        modifier = Modifier,
        sheetPeekHeight = 160.dp,
        sheetContent = {
            UmatBottomSheetScreen(
                homeViewModel = viewModel,
                currentPosition = currentCameraPosition.value,
                selectedButton = currentWishTypeState,
                onClickButton = {
                    currentWishTypeState = it
                }
            )
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
            ) {
                if (currentPositionBoundRequested) {
                    CircleOverlay(
                        center = currentCameraPosition.value,
                        radius = currentRadius.value,
                        color = Gray600.copy(alpha = 0.16f)
                    )
                    for (item in viewModel.tempPlaceList) {
                        if (!viewModel.isPositionInBound(
                                item.googlePlaceItem.location.toLatLng(),
                                currentCameraPosition.value
                            )
                        ) continue
                        Marker(
                            state = MarkerState(position = item.googlePlaceItem.location.toLatLng()),
                            icon = OverlayImage.fromResource(
                                when (item.type) {
                                    WishType.WISH_OUR -> com.teople.umat.component.R.drawable.ic_pin_our
                                    WishType.WISH_ME -> com.teople.umat.component.R.drawable.ic_pin_my
                                    else -> com.teople.umat.component.R.drawable.ic_pin_your
                                }
                            ),
                            onClick = {
                                coroutineScope.launch {
                                    currentWishTypeState = item.type
                                    scaffoldState.bottomSheetState.expand()
                                }
                                true
                            }
                        )
                    }
                }
            }

            Column {
                // 검색바
                HomeSearchBar(
                    actionSearchClick = {
                        actionRoute(NavRoute.Search)
                    },
                    requestPositionClick = {
                        requestCurrentPosition(fusedLocationClient, viewModel)
                    }
                )
                Spacer(modifier = Modifier.height(4.dp))
                CurrentPositionButton(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .noRippleClickable {
                            drawCurrentPositionCircle()
                            currentPositionBoundRequested = true
                        }
                )
            }
        }
    }

    val sharedTitleUsed = rememberSaveable { mutableStateOf(false) }

    if (sharedTitle != null && !sharedTitleUsed.value) {
        sharedTitleUsed.value = true
        actionRoute(NavRoute.Search)
    }
}


@Composable
fun UmatBottomSheetScreen(
    homeViewModel: HomeViewModel = hiltViewModel(),
    currentPosition: LatLng,
    selectedButton: WishType,
    onClickButton: (WishType) -> Unit
) {
    val context = LocalContext.current
    var currentPositionKoreanState by remember { mutableStateOf("") }
    val coroutineScope = rememberCoroutineScope()
    coroutineScope.launch {
        val newPosition = withContext(Dispatchers.IO) {
            getAddress(currentPosition, context)
        }
        currentPositionKoreanState = newPosition
    }
    val currentItems = homeViewModel.currentBoundItemsFlow.collectAsState()
    var currentSelectedUserItems by remember { mutableStateOf(listOf<MockPositionItem>()) }
    when (selectedButton) {
        WishType.WISH_OUR -> {
            currentSelectedUserItems = currentItems.value.filter {
                it.type == WishType.WISH_OUR
            }
        }

        WishType.WISH_ME -> {
            currentSelectedUserItems = currentItems.value.filter {
                it.type == WishType.WISH_ME
            }
        }

        WishType.WISH_YOUR -> {
            currentSelectedUserItems = currentItems.value.filter {
                it.type == WishType.WISH_YOUR
            }
        }
    }
    LazyColumn(
        modifier = Modifier
            .fillMaxHeight(0.8f)
            .background(Color.White)
    ) {
        item {
            Row(modifier = Modifier.padding(start = 20.dp)) {
                Text("현위치", style = UmatTypography().pretendardBold12, color = Gray300)
                Text(
                    currentPositionKoreanState,
                    style = UmatTypography().pretendardBold12,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 2.dp)
                ) // TODO : 현위치 가져오기
            }
            Text(
                text = "총 %d 개의 장소".format(
                    homeViewModel.getCurrentPositionFavoriteCount(currentPosition)
                ),
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
                WishPlaceButton(
                    wishType = WishType.WISH_OUR,
                    count = homeViewModel.getCurrentPositionFavoriteCountByType(
                        type = WishType.WISH_OUR,
                        currentPosition = currentPosition
                    ),
                    isSelected = selectedButton == WishType.WISH_OUR,
                    onClickButton = { onClickButton(WishType.WISH_OUR) }
                )
                WishPlaceButton(
                    wishType = WishType.WISH_ME,
                    count = homeViewModel.getCurrentPositionFavoriteCountByType(
                        type = WishType.WISH_ME,
                        currentPosition = currentPosition
                    ),
                    isSelected = selectedButton == WishType.WISH_ME,
                    onClickButton = {
                        onClickButton(WishType.WISH_ME)
                    })
                WishPlaceButton(
                    wishType = WishType.WISH_YOUR,
                    count = homeViewModel.getCurrentPositionFavoriteCountByType(
                        type = WishType.WISH_YOUR,
                        currentPosition = currentPosition
                    ),
                    isSelected = selectedButton == WishType.WISH_YOUR,
                    onClickButton = {
                        onClickButton(WishType.WISH_YOUR)
                    })
            }
        }
        if (currentSelectedUserItems.isEmpty()) {
            item {
                EmptyScreen()
            }
        } else {
            items(currentSelectedUserItems.size) {
                UmatItemCard(
                    photoUrl = currentSelectedUserItems[it].googlePlaceItem.photoUrl,
                    name = currentSelectedUserItems[it].googlePlaceItem.displayName.text,
                    location = currentSelectedUserItems[it].googlePlaceItem.formattedAddress,
                    isWin = false,
                    isLike = true,
                    open = with(currentSelectedUserItems[it].googlePlaceItem.hours.periods[0]) {
                        "${this.open.hour}:${this.open.minute} ~ ${this.close.hour}:${this.close.minute}"
                    },
                    buttonText = "여기 가볼래"
                ) {
                }
            }
        }
    }
}

@Composable
fun WishPlaceButton(
    wishType: WishType = WishType.WISH_OUR,
    count: Int = 220,
    isSelected: Boolean = false,
    onClickButton: () -> Unit = {}
) {
    Row(
        modifier = Modifier
            .width(92.dp)
            .height(32.dp)

            .border(
                1.dp,
                color = if (isSelected) Gray800 else Gray300,
                shape = RoundedCornerShape(32.dp)
            )
            .clickable {
                onClickButton()
            },
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
        Text(text = count.toString(), style = UmatTypography().pretendardSemiBold12)
    }
}

@Composable
fun EmptyScreen() {
    Box(
        modifier = Modifier
            .padding(top = 80.dp)
            .fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.align(Alignment.Center)
        ) {
            Icon(
                imageVector = UmatIcon.IcSadFilled,
                contentDescription = null,
                modifier = Modifier
                    .padding(bottom = 24.dp)
                    .size(43.dp),
                tint = Blue300
            )
            Text(
                text = "이런, 상대방이 저장한 위시 플레이스가 없네요!",
                style = UmatTypography().pretendardSemiBold12,
                modifier = Modifier.padding(bottom = 8.dp),
                color = Gray400
            )
            Text(
                text = "상대방에게 가고 싶은 장소가 있는지 \n" +
                        "쿡 찔러 보는 건 어때요?",
                style = UmatTypography().pretendardSemiBold16,
                color = Gray800,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun CurrentPositionButton(modifier: Modifier) {
    Row(
        modifier = modifier
            .shadow(2.dp, shape = RoundedCornerShape(8.dp))
            .background(Color.White, RoundedCornerShape(8.dp))
            .padding(horizontal = 18.dp, vertical = 10.dp)
    ) {
        Image(
            painter = painterResource(id = com.teople.umat.component.R.drawable.ic_location_check_filled),
            contentDescription = null,
            modifier = Modifier
                .size(20.dp)
                .padding(end = 6.dp),
        )
        Text(
            text = stringResource(R.string.current_position_bound),
            style = UmatTypography().pretendardSemiBold14,
        )
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

private fun getAddress(latLng: LatLng, context: Context): String {
    return try {
        val geocoder = Geocoder(context, Locale.getDefault())
        val addresses = geocoder.getFromLocation(latLng.latitude, latLng.longitude, 1)
        val address = addresses?.get(0)?.getAddressLine(0)?.split(" ") ?: return ""
        val knownName = "${address[2]} ${address[3]}"
        knownName
    } catch (e: Exception) {
        ""
    }
}

private fun CoreGooglePlacesDetailEntity.Location.toLatLng(): LatLng {
    return LatLng(this.latitude, this.longitude)
}

enum class WishType(
    val imageVector: ImageVector,
    val displayName: String,
    @StringRes val emptyTitleResource: Int? = null
) {
    WISH_OUR(UmatIcon.IcFilterOur, "우리", R.string.empty_title_our),
    WISH_ME(UmatIcon.IcFilterMe, "지훈", R.string.empty_title_me),
    WISH_YOUR(UmatIcon.IcFilterYou, "주은"),
}

@Preview(showBackground = true, widthDp = 360, heightDp = 640)
@Composable
fun UmatBottomSheet() {
    UmatBottomSheetScreen(
        currentPosition = LatLng(SEOUL_LAT, SEOUL_LNG),
        selectedButton = WishType.WISH_OUR,
        onClickButton = {}

    )
}

@Preview
@Composable
fun WishButton() {
    WishPlaceButton()
}