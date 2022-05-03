package com.abdrakhmanovartem.daggerpapp.dagger

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.abdrakhmanovartem.daggerpapp.App
import com.abdrakhmanovartem.daggerpapp.screens.main.dagger.MainComponent

class ComponentInjector(app: App) {

    val appComponent: AppComponent = AppComponent.create(app)

    private var mainComponent: MainComponent? = null

    fun getMainComponent(activity: AppCompatActivity): MainComponent {
        return mainComponent ?:
            appComponent.plusMainComponent().newInstance(activity).also {
                mainComponent = it
            }
    }

    fun clearMainComponent() {
        mainComponent = null
    }

    companion object {
        fun get(context: Context): ComponentInjector =
            (context.applicationContext as App).getComponentInjector()
    }
}