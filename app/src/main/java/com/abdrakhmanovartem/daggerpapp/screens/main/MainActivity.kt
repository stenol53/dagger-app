package com.abdrakhmanovartem.daggerpapp.screens.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.abdrakhmanovartem.daggerpapp.R
import com.abdrakhmanovartem.daggerpapp.dagger.ComponentInjector
import com.abdrakhmanovartem.daggerpapp.screens.main.dagger.DaggerMainComponent
import com.abdrakhmanovartem.daggerpapp.screens.main.dagger.MainComponent
import com.abdrakhmanovartem.daggerpapp.screens.main.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private val component: MainComponent by lazy {
        MainComponent.create(this, ComponentInjector.get(this).appComponent)
    }

    private val viewModel: MainViewModel by viewModels { component.viewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        observeViewModel()

        viewModel.fetchItems()
    }

    private fun observeViewModel() {
        viewModel.itemsLiveData.observe(this) {
            // ...
        }
    }
}