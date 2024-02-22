package com.teople.umat.core.data.di

import com.teople.umat.core.data.CoreSearchRepository
import com.teople.umat.core.data.repository.CoreSearchRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class CoreRepositoryViewModelModule {

    @Binds
    @ViewModelScoped
    abstract fun bindCoreSearchRepository(
        impl: CoreSearchRepositoryImpl
    ): CoreSearchRepository
}

@Module
@InstallIn(SingletonComponent::class)
abstract class CoreRepositorySingletonModule {

    // TODO("로그인 관련 싱글톤")
}