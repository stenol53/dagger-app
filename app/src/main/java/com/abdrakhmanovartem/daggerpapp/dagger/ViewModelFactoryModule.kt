package com.abdrakhmanovartem.daggerpapp.dagger

import androidx.lifecycle.ViewModelProvider
import com.abdrakhmanovartem.daggerpapp.dagger.common.CommonViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: CommonViewModelFactory): ViewModelProvider.Factory

}