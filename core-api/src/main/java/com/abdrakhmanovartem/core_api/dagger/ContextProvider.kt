package com.abdrakhmanovartem.core_api.dagger

import android.content.Context
import com.abdrakhmanovartem.core_api.ResourcesProvider

interface ContextProvider {

    fun provideContext(): Context

    fun provideResourcesProvider(): ResourcesProvider
}