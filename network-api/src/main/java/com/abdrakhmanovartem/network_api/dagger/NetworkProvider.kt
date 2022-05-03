package com.abdrakhmanovartem.network_api.dagger

import com.google.gson.Gson
import okhttp3.OkHttpClient
import retrofit2.Retrofit

interface NetworkProvider {

    fun provideGson(): Gson

    fun provideOkHttpClient(): OkHttpClient

    fun provideRetrofit(): Retrofit

}