package com.abdrakhmanovartem.daggerpapp.dagger

import com.abdrakhmanovartem.daggerpapp.api.ApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
object AppModule {

    @Provides
    fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)
}