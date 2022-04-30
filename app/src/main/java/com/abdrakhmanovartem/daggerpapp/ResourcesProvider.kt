package com.abdrakhmanovartem.daggerpapp

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.appcompat.content.res.AppCompatResources

interface ResourcesProvider {

    fun getString(id: Int): String

    fun getStringArray(id: Int): Array<String>

    fun getDrawable(id: Int): Drawable?

    class Impl(private val context: Context) : ResourcesProvider {

        override fun getString(id: Int): String = context.getString(id)

        override fun getStringArray(id: Int): Array<String> = context.resources.getStringArray(id)

        override fun getDrawable(id: Int): Drawable? = AppCompatResources.getDrawable(context, id)
    }
}