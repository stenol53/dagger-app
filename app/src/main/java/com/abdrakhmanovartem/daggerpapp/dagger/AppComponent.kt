package com.abdrakhmanovartem.daggerpapp.dagger

import android.content.Context
import com.abdrakhmanovartem.daggerpapp.App
import com.abdrakhmanovartem.daggerpapp.ResourcesProvider
import com.abdrakhmanovartem.daggerpapp.api.ApiService
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [AppModule::class, NetworkModule::class]
)
@Singleton
interface AppComponent {

    val apiService: ApiService
    val resourcesProvider: ResourcesProvider

    fun inject(app: App)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent
    }

    companion object {
        fun create(context: Context): AppComponent {
            return DaggerAppComponent.builder()
                .context(context)
                .build()
        }
    }

//    @Component.Factory
//    interface Factory {
//        fun create(
//            @BindsInstance context: Context
//        ): AppComponent
//    }
//
//    companion object {
//        fun create(context: Context): AppComponent {
//            return DaggerAppComponent.factory()
//                .create(context)
//        }
//    }

}