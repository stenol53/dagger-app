package com.abdrakhmanovartem.daggerpapp

import android.app.Application
import android.util.Log
import com.abdrakhmanovartem.daggerpapp.dagger.ComponentInjector
import retrofit2.Retrofit
import javax.inject.Inject

class App : Application() {

    private lateinit var componentInjector: ComponentInjector

    @Inject
    protected lateinit var retrofit: Retrofit

    override fun onCreate() {
        super.onCreate()

        componentInjector = ComponentInjector(this)
        componentInjector.appComponent.inject(this)

        Log.d(TAG, retrofit.toString())
    }

    fun getComponentInjector() = componentInjector

    companion object {
        private const val TAG = "App"
    }
}