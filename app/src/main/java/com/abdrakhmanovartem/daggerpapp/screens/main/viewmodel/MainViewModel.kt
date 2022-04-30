package com.abdrakhmanovartem.daggerpapp.screens.main.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.abdrakhmanovartem.daggerpapp.ResourcesProvider
import com.abdrakhmanovartem.daggerpapp.screens.main.model.DataItem
import com.abdrakhmanovartem.daggerpapp.screens.main.repository.MainRepository
import com.abdrakhmanovartem.daggerpapp.screens.main.router.MainRouter
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val repository: MainRepository,
    private val router: MainRouter,
    private val resourcesProvider: ResourcesProvider
) : ViewModel() {

    private val _itemsLiveData: MutableLiveData<List<DataItem>> = MutableLiveData()
    val itemsLiveData: LiveData<List<DataItem>> = _itemsLiveData

    fun fetchItems() {
        viewModelScope.launch {
            kotlin.runCatching {
                repository.getData()
            }.onSuccess { data ->
                _itemsLiveData.postValue(data)
            }.onFailure {
                // Error
            }
        }
    }

    fun openDetailsScreen() = router.openDetailsScreen()
}