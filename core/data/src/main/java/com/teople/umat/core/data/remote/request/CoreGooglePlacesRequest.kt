package com.teople.umat.core.data.remote.request

data class CoreGooglePlacesRequest(
    val textQuery: String,
    val languageCode: String = "ko"
)
