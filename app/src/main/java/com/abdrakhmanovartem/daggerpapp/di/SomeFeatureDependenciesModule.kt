package com.abdrakhmanovartem.daggerpapp.di

import com.abdrakhmanovartem.some_feature.api.AnotherDep
import com.abdrakhmanovartem.some_feature.api.SomeDep
import dagger.Module
import dagger.Provides

@Module
object SomeFeatureDependenciesModule {

    @Provides
    fun provideSomeDep() = object : SomeDep {
        // ...
    }

    @Provides
    fun provideAnotherDep() = object : AnotherDep {
        // ...
    }
}