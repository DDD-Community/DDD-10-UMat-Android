package com.teople.umat.core.data

import kotlinx.coroutines.flow.Flow

interface CorePreferenceRepository {

    fun getShownGuideDialog(): Flow<Boolean>

    suspend fun setShownGuideDialog(value: Boolean)
}
