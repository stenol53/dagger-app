package com.abdrakhmanovartem.daggerpapp.dagger

import android.content.Context
import com.abdrakhmanovartem.daggerpapp.App

class ComponentInjector(app: App) {

    val appComponent: AppComponent = AppComponent.create(app)

    companion object {
        fun get(context: Context): ComponentInjector =
            (context.applicationContext as App).getComponentInjector()
    }
}