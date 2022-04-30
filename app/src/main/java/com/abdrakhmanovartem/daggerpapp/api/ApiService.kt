package com.abdrakhmanovartem.daggerpapp.api

import com.abdrakhmanovartem.daggerpapp.screens.model.DataItem
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("api/getData")
    suspend fun getData(): Response<List<DataItem>>
}