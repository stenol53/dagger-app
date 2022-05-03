package com.abdrakhmanovartem.daggerpapp.screens.main.dagger

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.abdrakhmanovartem.daggerpapp.dagger.AppComponent
import com.abdrakhmanovartem.daggerpapp.dagger.ViewModelFactoryModule
import com.abdrakhmanovartem.daggerpapp.dagger.common.ActivityScope
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@Subcomponent(
    modules = [MainModule::class, ViewModelFactoryModule::class]
)
@ActivityScope
interface MainComponent {

    val viewModelFactory: ViewModelProvider.Factory

    @Subcomponent.Factory
    interface Factory {
        fun newInstance(
            @BindsInstance activity: AppCompatActivity
        ): MainComponent
    }

//    companion object {
//        fun create(
//            activity: AppCompatActivity
//        ) = DaggerMainComponent.factory().newInstance(activity)
//    }
}