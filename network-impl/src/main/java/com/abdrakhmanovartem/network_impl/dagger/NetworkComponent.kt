package com.abdrakhmanovartem.network_impl.dagger

import com.abdrakhmanovartem.network_api.dagger.NetworkProvider
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [NetworkModule::class],
)
@Singleton
interface NetworkComponent : NetworkProvider {

    @Component.Factory
    interface Factory {
        fun create() : NetworkComponent
    }

    companion object {
        fun init(): NetworkProvider {
            return DaggerNetworkComponent.factory().create()
        }
    }
}