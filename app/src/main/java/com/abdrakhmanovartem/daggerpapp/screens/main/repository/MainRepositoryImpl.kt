package com.abdrakhmanovartem.daggerpapp.screens.main.repository

import com.abdrakhmanovartem.daggerpapp.api.ApiService
import com.abdrakhmanovartem.daggerpapp.screens.main.model.DataItem
import com.abdrakhmanovartem.daggerpapp.utils.check
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : MainRepository {

    override suspend fun getData(): List<DataItem> {
        return apiService.getData().check()
    }
}