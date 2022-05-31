package com.abdrakhmanovartem.daggerpapp.di

import com.abdrakhmanovartem.common.ComponentDependencies
import com.abdrakhmanovartem.common.ComponentDependenciesKey
import com.abdrakhmanovartem.some_feature.api.SomeFeatureDependencies
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ComponentDependenciesModule {

    @Binds
    @IntoMap
    @ComponentDependenciesKey(SomeFeatureDependencies::class)
    abstract fun provideSomeFeatureDependencies(component: AppComponent): ComponentDependencies

}