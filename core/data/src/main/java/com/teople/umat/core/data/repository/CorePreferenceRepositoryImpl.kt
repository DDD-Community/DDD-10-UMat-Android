package com.teople.umat.core.data.repository

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import com.teople.umat.core.data.CorePreferenceRepository
import com.teople.umat.core.data.preference.PREFERENCE_SHOWN_GUIDE_DIALOG
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class CorePreferenceRepositoryImpl @Inject constructor(
    private val preferences: DataStore<Preferences>
) : CorePreferenceRepository {

    override fun getShownGuideDialog(): Flow<Boolean> {
        return preferences.data.map { perf ->
            perf[PREFERENCE_SHOWN_GUIDE_DIALOG] ?: false
        }
    }

    override suspend fun setShownGuideDialog(value: Boolean) {
        preferences.edit { perf ->
            perf[PREFERENCE_SHOWN_GUIDE_DIALOG] = value
        }
    }
}