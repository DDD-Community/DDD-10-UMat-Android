package com.teople.umat.core.data.di

import com.teople.umat.core.data.di.constant.CoreRetrofitNamed
import com.teople.umat.core.data.remote.CoreGooglePlacesDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CoreRemoteDataSourceModule {

    @Provides
    @Singleton
    fun provideGooglePlacesDataSource(
        @Named(CoreRetrofitNamed.NAMED_RETROFIT_GOOGLE_PLACES) retrofit: Retrofit
    ): CoreGooglePlacesDataSource {
        return retrofit.create(CoreGooglePlacesDataSource::class.java)
    }
}