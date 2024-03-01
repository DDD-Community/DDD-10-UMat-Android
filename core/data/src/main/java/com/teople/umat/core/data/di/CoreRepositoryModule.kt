package com.teople.umat.core.data.di

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.teople.umat.core.data.CorePlaceRepository
import com.teople.umat.core.data.CorePreferenceRepository
import com.teople.umat.core.data.CoreSearchRepository
import com.teople.umat.core.data.preference.dataStore
import com.teople.umat.core.data.repository.CorePlaceRepositoryImpl
import com.teople.umat.core.data.repository.CorePreferenceRepositoryImpl
import com.teople.umat.core.data.repository.CoreSearchRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
abstract class CoreRepositoryViewModelModule {

    @Binds
    @ViewModelScoped
    abstract fun bindCoreSearchRepository(
        impl: CoreSearchRepositoryImpl
    ): CoreSearchRepository

    @Binds
    @ViewModelScoped
    abstract fun bindCorePlaceRepository(
        impl: CorePlaceRepositoryImpl
    ): CorePlaceRepository

    @Binds
    @ViewModelScoped
    abstract fun bindCorePreferenceRepository(
        impl: CorePreferenceRepositoryImpl
    ): CorePreferenceRepository
}

@Module
@InstallIn(SingletonComponent::class)
class CoreRepositorySingletonModule {

    @Provides
    @Singleton
    fun provideDataStorePreference(
        @ApplicationContext context: Context
    ): DataStore<Preferences> {
        return context.dataStore
    }
}