package com.abdrakhmanovartem.daggerpapp

import android.app.Application
import com.abdrakhmanovartem.common.ComponentDependenciesProvider
import com.abdrakhmanovartem.common.HasComponentDependencies
import com.abdrakhmanovartem.daggerpapp.di.AppComponent
import com.abdrakhmanovartem.daggerpapp.di.DaggerAppComponent
import javax.inject.Inject

class App : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}