package com.abdrakhmanovartem.daggerpapp.screens.main.router

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.abdrakhmanovartem.daggerpapp.screens.details.DetailsActivity
import com.abdrakhmanovartem.daggerpapp.utils.ContextProvider
import javax.inject.Inject

class MainRouterImpl @Inject constructor(
    private val contextProvider: ContextProvider<AppCompatActivity>
) : MainRouter {

    override fun openDetailsScreen() = startActivity { DetailsActivity.newIntent(this) }


    private fun startActivity(
        intentBuilder: AppCompatActivity.() -> Intent
    ) {
        contextProvider.get()?.let { context ->
            val intent = intentBuilder.invoke(context)
            context.startActivity(intent)
        }
    }
}