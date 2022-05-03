package com.abdrakhmanovartem.core_impl.dagger

import android.content.Context
import com.abdrakhmanovartem.core_api.App
import com.abdrakhmanovartem.core_api.ResourcesProvider
import dagger.Module
import dagger.Provides

@Module
internal object AppContextModule {

    @Provides
    fun provideAppContext(app: App): Context = app.getApplicationContext()

    @Provides
    fun provideResourcesProvider(app: App): ResourcesProvider =
        ResourcesProvider.Impl(app.getApplicationContext())
}