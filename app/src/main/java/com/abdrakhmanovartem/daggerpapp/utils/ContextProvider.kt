package com.abdrakhmanovartem.daggerpapp.utils

import android.content.Context
import java.lang.ref.WeakReference
import javax.inject.Inject

interface IContextProvider <T> {

    fun set(context: T)
    fun get(): T?
}

class ContextProvider<T : Context> @Inject constructor() : IContextProvider<T> {

    constructor(context: T) : this() {
        weakContext = WeakReference(context)
    }

    private var weakContext: WeakReference<T>? = null

    override fun set(context: T) {
        weakContext = WeakReference(context)
    }

    override fun get(): T? = weakContext?.get()

}