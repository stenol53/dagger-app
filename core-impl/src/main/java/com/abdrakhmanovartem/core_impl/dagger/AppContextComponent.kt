package com.abdrakhmanovartem.core_impl.dagger

import com.abdrakhmanovartem.core_api.App
import com.abdrakhmanovartem.core_api.dagger.ContextProvider
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [AppContextModule::class]
)
@Singleton
interface AppContextComponent : ContextProvider {

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance app: App
        ): AppContextComponent
    }

    companion object {
        fun init(app: App) = DaggerAppContextComponent.factory().create(app)
    }

}