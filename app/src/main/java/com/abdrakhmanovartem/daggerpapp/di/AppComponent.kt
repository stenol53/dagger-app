package com.abdrakhmanovartem.daggerpapp.di

import com.abdrakhmanovartem.daggerpapp.MainActivity
import com.abdrakhmanovartem.some_feature.api.SomeFeatureDependencies
import dagger.Component

@Component(
    modules = [AppModule::class, SomeFeatureDependenciesModule::class, ComponentDependenciesModule::class]
)
interface AppComponent : SomeFeatureDependencies {

    fun inject(activity: MainActivity)

}