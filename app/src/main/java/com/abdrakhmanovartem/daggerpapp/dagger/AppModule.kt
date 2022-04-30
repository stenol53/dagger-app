package com.abdrakhmanovartem.daggerpapp.dagger

import android.content.Context
import com.abdrakhmanovartem.daggerpapp.ResourcesProvider
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideResources(context: Context): ResourcesProvider = ResourcesProvider.Impl(context)

}