package com.abdrakhmanovartem.daggerpapp

import android.app.Application
import android.util.Log
import com.abdrakhmanovartem.daggerpapp.dagger.AppComponent
import retrofit2.Retrofit
import javax.inject.Inject

class App : Application() {

    @Inject
    protected lateinit var retrofit: Retrofit

    override fun onCreate() {
        super.onCreate()

        AppComponent.create(this).inject(this)

        Log.d(TAG, retrofit.toString())
    }


    companion object {
        private const val TAG = "App"
    }
}