package com.abdrakhmanovartem.some_feature.di

import com.abdrakhmanovartem.some_feature.SomeFeatureFragment
import com.abdrakhmanovartem.some_feature.api.SomeFeatureDependencies
import dagger.Component

@Component(
    modules = [SomeFeatureModule::class],
    dependencies = [SomeFeatureDependencies::class]
)
internal interface SomeFeatureComponent {

    fun inject(fragment: SomeFeatureFragment)

}