package com.abdrakhmanovartem.daggerpapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.abdrakhmanovartem.common.ComponentDependenciesProvider
import com.abdrakhmanovartem.common.HasComponentDependencies
import com.abdrakhmanovartem.daggerpapp.di.AppComponent
import com.abdrakhmanovartem.daggerpapp.di.DaggerAppComponent
import com.abdrakhmanovartem.some_feature.SomeFeatureFragment
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasComponentDependencies {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
            .build()
    }

    @Inject
    override lateinit var dependencies: ComponentDependenciesProvider
        protected set

    override fun onCreate(savedInstanceState: Bundle?) {
        appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, SomeFeatureFragment())
                .commit()
        }
    }
}