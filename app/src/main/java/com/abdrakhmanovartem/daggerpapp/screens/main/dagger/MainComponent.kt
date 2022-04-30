package com.abdrakhmanovartem.daggerpapp.screens.main.dagger

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.abdrakhmanovartem.daggerpapp.dagger.AppComponent
import com.abdrakhmanovartem.daggerpapp.dagger.ViewModelFactoryModule
import com.abdrakhmanovartem.daggerpapp.dagger.common.ActivityScope
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [MainModule::class, ViewModelFactoryModule::class],
    dependencies = [AppComponent::class]
)
@ActivityScope
interface MainComponent {

    val viewModelFactory: ViewModelProvider.Factory

    @Component.Factory
    interface Factory {
        fun newInstance(
            @BindsInstance activity: AppCompatActivity,
            appComponent: AppComponent
        ): MainComponent
    }

    companion object {
        fun create(
            activity: AppCompatActivity,
            appComponent: AppComponent
        ) = DaggerMainComponent.factory().newInstance(activity, appComponent)
    }
}