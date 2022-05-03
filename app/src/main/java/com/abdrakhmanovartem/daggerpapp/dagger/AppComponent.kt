package com.abdrakhmanovartem.daggerpapp.dagger

import com.abdrakhmanovartem.core_api.dagger.ContextProvider
import com.abdrakhmanovartem.daggerpapp.App
import com.abdrakhmanovartem.daggerpapp.api.ApiService
import com.abdrakhmanovartem.network_api.dagger.NetworkProvider
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [AppModule::class],
    dependencies = [ContextProvider::class, NetworkProvider::class]
)
@Singleton
interface AppComponent : ContextProvider, NetworkProvider {

    val apiService: ApiService

    fun inject(app: App)

    @Component.Builder
    interface Builder {

        fun contextProvider(provider: ContextProvider): Builder

        fun networkProvider(provider: NetworkProvider): Builder

        fun build(): AppComponent
    }

}