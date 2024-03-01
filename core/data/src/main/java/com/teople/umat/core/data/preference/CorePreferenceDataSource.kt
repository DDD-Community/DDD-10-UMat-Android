package com.teople.umat.core.data.preference

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.preferencesDataStore

private const val PREFERENCE_NAME = "com.teople.umat"

val Context.dataStore: DataStore<Preferences> by preferencesDataStore(
    name = PREFERENCE_NAME
)

val PREFERENCE_SHOWN_GUIDE_DIALOG = booleanPreferencesKey(
    name = "preference:shownGuideDialog"
)