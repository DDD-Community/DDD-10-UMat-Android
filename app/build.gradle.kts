import java.util.Properties

plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.googleDevtoolsKsp)
    alias(libs.plugins.googleServices)
    alias(libs.plugins.firebaseCrashlytics)
    alias(libs.plugins.firebasePerf)
    alias(libs.plugins.androidHilt)
}

android {
    namespace = "com.teople.umat"
    compileSdk = 34

    val localProperties = Properties().apply {
        load(project.rootProject.file("local.properties").inputStream())
    }
    val naverMapApiKey = localProperties.getProperty("naver_api_key") ?: ""

    defaultConfig {
        applicationId = "com.teople.umat"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }

        manifestPlaceholders["naverMapApiKey"] = naverMapApiKey
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            buildConfigField("String", "NAVER_MAP_API_KEY", naverMapApiKey)
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // Module
    implementation(project(":feature:home"))
    implementation(project(":feature:daily"))
    implementation(project(":feature:mypage"))
    implementation(project(":feature:onboarding"))
    implementation(project(":feature:search"))
    implementation(project(":core:data"))
    implementation(project(":component"))
    implementation(project(":navigator"))

    // Compose
    implementation(platform(libs.compose.bom))
    implementation(libs.bundles.compose)

    implementation(libs.bundles.androidx)
    implementation(libs.bundles.composeDependency)
    implementation(libs.bundles.coil)
    implementation(libs.bundles.naverMap)

    implementation(libs.androidx.core.splashscreen)

    implementation(libs.bundles.coroutines)

    implementation(libs.hilt.android)
    ksp(libs.hilt.android.compiler)

    implementation(libs.bundles.retrofit)

    implementation(libs.bundles.room)
    ksp(libs.roomCompiler)

    // Firebase
    implementation(platform(libs.firebase.bom))
    implementation(libs.bundles.firebase)
}