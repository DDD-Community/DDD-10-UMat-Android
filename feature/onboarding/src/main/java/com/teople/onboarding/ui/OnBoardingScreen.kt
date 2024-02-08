package com.teople.onboarding.ui

import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush.Companion.horizontalGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.teople.umat.component.ui.theme.Gray300
import com.teople.umat.component.ui.theme.Gray400
import com.teople.umat.component.ui.theme.Gray500
import com.teople.umat.component.ui.theme.Gray800
import com.teople.umat.component.ui.theme.Gray900
import com.teople.umat.component.ui.theme.Gray950
import com.teople.umat.component.widget.ComponentButton
import com.teople.umat.component.R as ComponentR

@Composable
fun OnBoardingScreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "guide") {
        composable(
            route = OnBoardingScreens.Guide.name,
            enterTransition = {
                slideInHorizontally(
                    initialOffsetX = { fullWidth -> -fullWidth },
                    animationSpec = tween(300)
                )
            },
            exitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { fullWidth -> -fullWidth },
                    animationSpec = tween(300)
                )
            },
            popEnterTransition = {
                slideInHorizontally(
                    initialOffsetX = { fullWidth -> -fullWidth },
                    animationSpec = tween(300)
                )
            },
            popExitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { fullWidth -> fullWidth },
                    animationSpec = tween(300)
                )
            },
            content = {
                GuideScreen(
                    onNavigateToSocialLogin = {
                        navController.navigate(OnBoardingScreens.SocialLogin.name)
                    }
                )
            })
        composable(
            route = OnBoardingScreens.SocialLogin.name,
            enterTransition = {
                slideInHorizontally(
                    initialOffsetX = { fullWidth -> fullWidth },
                    animationSpec = tween(300)
                )
            },
            exitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { fullWidth -> -fullWidth },
                    animationSpec = tween(300)
                )
            },
            popEnterTransition = {
                slideInHorizontally(
                    initialOffsetX = { fullWidth -> -fullWidth },
                    animationSpec = tween(300)
                )
            },
            popExitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { fullWidth -> fullWidth },
                    animationSpec = tween(300)
                )
            },
            content = {
                SocialLoginScreen(
                    onNavigateToSocialLogin = {
                        navController.navigate(OnBoardingScreens.Connect.name)
                    }
                )
            })
        composable(
            route = OnBoardingScreens.Connect.name,
            enterTransition = {
                slideInHorizontally(
                    initialOffsetX = { fullWidth -> fullWidth },
                    animationSpec = tween(300)
                )
            },
            exitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { fullWidth -> -fullWidth },
                    animationSpec = tween(300)
                )
            },
            popEnterTransition = {
                slideInHorizontally(
                    initialOffsetX = { fullWidth -> -fullWidth },
                    animationSpec = tween(300)
                )
            },
            popExitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { fullWidth -> fullWidth },
                    animationSpec = tween(300)
                )
            },
        ) {
            ConnectScreen()
        }
    }
}

@Composable
fun GuideScreen(
    onNavigateToSocialLogin: () -> Unit = {}
) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column {
            Box(modifier = Modifier.weight(1f)) {
                Image(
                    painter = painterResource(id = ComponentR.drawable.temp),
                    contentDescription = "Service description",
                    alignment = Alignment.TopCenter,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp)
                        .padding(top = 32.dp),
                    contentScale = ContentScale.Crop
                )
            }
            ComponentButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
                    .padding(bottom = 54.dp)
                    .height(50.dp),
                backgroundColor = Gray800,
                text = "다음",
                textColor = Color.White,
                onClick = onNavigateToSocialLogin
            )
        }
    }
}

@Composable
fun SocialLoginScreen(
    onNavigateToSocialLogin: () -> Unit = {}
) {
    Surface {
        Column(modifier = Modifier.fillMaxSize()) {
            val painter = painterResource(id = com.teople.umat.component.R.drawable.temp)
            Image(
                painter = painter,
                contentDescription = "Service description",
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 61.dp)
            ) {
                ComponentButton(modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
                    .padding(bottom = 16.dp)
                    .height(50.dp),
                    backgroundColor = Color(0xFFFEE500),
                    text = "카카오로 로그인",
                    textColor = Color(0xFF3C3922),
                    onClick = onNavigateToSocialLogin,
                    icon = {
                        Icon(
                            painter = painterResource(id = ComponentR.drawable.ic_kakao),
                            tint = Color(0xE5262626),
                            contentDescription = "Apple 로그인 버튼",
                            modifier = Modifier.padding(end = 8.dp)
                        )
                    }
                )
                ComponentButton(modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
                    .padding(bottom = 16.dp)
                    .height(50.dp),
                    backgroundColor = Gray950,
                    text = "Apple로 로그인",
                    textColor = Color.White,
                    onClick = onNavigateToSocialLogin,
                    icon = {
                        Icon(
                            painter = painterResource(id = ComponentR.drawable.ic_apple),
                            tint = Color.White,
                            contentDescription = "Apple 로그인 버튼",
                            modifier = Modifier.padding(end = 8.dp)
                        )
                    }
                )
                Button(
                    onClick = onNavigateToSocialLogin,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp)
                        .padding(bottom = 16.dp)
                        .height(34.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFFF))
                ) {
                    Text(
                        text = "둘러보기", style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xFF4B5563),

                            )
                    )
                }
                Text(
                    text = "로그인 시 개인정보처리방침과 이용약관에 동의하게 됩니다",
                    modifier = Modifier
                        .padding(bottom = 54.dp)
                        .align(alignment = Alignment.CenterHorizontally),
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = Gray400
                    )
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ConnectScreen() {
    Surface {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = "") },
                    navigationIcon = {
                        Icon(
                            painter = painterResource(id = ComponentR.drawable.ic_back),
                            contentDescription = "Back",
                            modifier = Modifier.padding(start = 16.dp)
                        )
                    }
                )
            }
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .padding(horizontal = 24.dp)
            ) {
                Text(
                    text = "똑똑, 비밀 코드가 도착했어요!",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Gray900
                    ),
                    modifier = Modifier.padding(top = 16.dp)
                )
                Text(
                    text = "둘만의 지도를 만들기 위해서 비밀 코드를 드릴게요.",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Gray500
                    ),
                    modifier = Modifier.padding(top = 10.dp)
                )
                Image(
                    painter = painterResource(id = ComponentR.drawable.connect_code),
                    contentDescription = "Code",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 32.dp)
                        .padding(horizontal = 43.dp),
                    contentScale = ContentScale.Crop
                )
                val brush = horizontalGradient(
                    colors = listOf(
                        Color(0xFFFF7E32),
                        Color(0xFFA5B4FC)
                    ),
                )
                Box(
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .width(92.dp)
                        .height(40.dp)
                        .align(alignment = Alignment.CenterHorizontally)
                        .background(brush = brush, shape = RoundedCornerShape(8.dp))
                ) {
                    Text(
                        text = "코드 공유", style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White
                        ),
                        modifier = Modifier.align(alignment = Alignment.Center)
                    )
                }
                ComponentButton(modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 80.dp)
                    .height(50.dp),
                    backgroundColor = Gray800,
                    text = "상대방이 코드를 입력했어요",
                    textColor = Color.White,
                    onClick = { /*TODO*/ }
                )
                ComponentButton(modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
                    .height(50.dp)
                    .border(1.dp, Gray300, shape = RoundedCornerShape(8.dp)),
                    backgroundColor = Color.White,
                    text = "상대방 코드 입력",
                    textColor = Gray800,
                    onClick = { /*TODO*/ }
                )
            }
        }
    }
}

enum class OnBoardingScreens() {
    Guide, SocialLogin, Connect
}

@Preview(heightDp = 640, widthDp = 360)
@Composable
fun OnBoardingView() {
    GuideScreen()
}

@Preview(heightDp = 640, widthDp = 360)
@Composable
fun SocialLoginView() {
    SocialLoginScreen()
}

@Preview(heightDp = 640, widthDp = 360)
@Composable
fun ConnectView() {
    ConnectScreen()
}