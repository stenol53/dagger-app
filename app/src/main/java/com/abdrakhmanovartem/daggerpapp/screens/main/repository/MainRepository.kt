package com.abdrakhmanovartem.daggerpapp.screens.main.repository

import com.abdrakhmanovartem.daggerpapp.screens.main.model.DataItem

interface MainRepository {

    suspend fun getData(): List<DataItem>
}