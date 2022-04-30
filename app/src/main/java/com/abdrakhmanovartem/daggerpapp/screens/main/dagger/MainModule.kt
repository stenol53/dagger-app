package com.abdrakhmanovartem.daggerpapp.screens.main.dagger

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import com.abdrakhmanovartem.daggerpapp.dagger.common.ViewModelKey
import com.abdrakhmanovartem.daggerpapp.screens.main.repository.MainRepository
import com.abdrakhmanovartem.daggerpapp.screens.main.repository.MainRepositoryImpl
import com.abdrakhmanovartem.daggerpapp.screens.main.router.MainRouter
import com.abdrakhmanovartem.daggerpapp.screens.main.router.MainRouterImpl
import com.abdrakhmanovartem.daggerpapp.screens.main.viewmodel.MainViewModel
import com.abdrakhmanovartem.daggerpapp.utils.ContextProvider
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
abstract class MainModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindViewModel(viewModel: MainViewModel): ViewModel

    @Binds
    abstract fun bindMainRepository(repositoryImpl: MainRepositoryImpl): MainRepository

    @Binds
    abstract fun bindRouter(router: MainRouterImpl): MainRouter

    @Module
    companion object {

        @Provides
        fun provideContextProvider(activity: AppCompatActivity) = ContextProvider(activity)

    }

}