package com.abdrakhmanovartem.daggerpapp.dagger

import android.content.Context
import com.abdrakhmanovartem.daggerpapp.App
import com.abdrakhmanovartem.daggerpapp.screens.main.dagger.MainComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [AppModule::class, NetworkModule::class]
)
@Singleton
interface AppComponent {

    fun inject(app: App)

    // Subcomponents
    fun plusMainComponent(): MainComponent.Factory

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