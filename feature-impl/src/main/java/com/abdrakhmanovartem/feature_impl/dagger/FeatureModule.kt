package com.abdrakhmanovartem.feature_impl.dagger

import com.abdrakhmanovartem.feature_api.FeatureApi
import com.abdrakhmanovartem.feature_impl.FeatureApiImpl
import dagger.Binds
import dagger.Module

@Module
abstract class FeatureModule {

    @Binds
    abstract fun bindFeatureApi(featureApi: FeatureApiImpl): FeatureApi

}