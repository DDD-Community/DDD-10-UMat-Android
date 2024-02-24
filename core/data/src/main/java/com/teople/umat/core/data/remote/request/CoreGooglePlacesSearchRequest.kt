package com.teople.umat.core.data.remote.request

data class CoreGooglePlacesSearchRequest(
    val textQuery: String,
    val languageCode: String = "ko"
)
