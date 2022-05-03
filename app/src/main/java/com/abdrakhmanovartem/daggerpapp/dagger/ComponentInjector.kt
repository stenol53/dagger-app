package com.abdrakhmanovartem.daggerpapp.dagger

import android.content.Context
import com.abdrakhmanovartem.core_api.dagger.ContextProvider
import com.abdrakhmanovartem.core_impl.dagger.AppContextComponent
import com.abdrakhmanovartem.daggerpapp.App
import com.abdrakhmanovartem.network_api.dagger.NetworkProvider
import com.abdrakhmanovartem.network_impl.dagger.NetworkComponent

class ComponentInjector(app: App) {

    val appComponent: AppComponent

    init {
        val contextProvider: ContextProvider = AppContextComponent.init(app)
        val networkProvider: NetworkProvider = NetworkComponent.init()

        appComponent = DaggerAppComponent.builder()
            .contextProvider(contextProvider)
            .networkProvider(networkProvider)
            .build()
    }

    companion object {
        fun get(context: Context): ComponentInjector =
            (context.applicationContext as App).getComponentInjector()
    }
}