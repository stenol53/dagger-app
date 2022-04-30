package com.abdrakhmanovartem.daggerpapp.screens.details

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abdrakhmanovartem.daggerpapp.R

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
    }

    companion object {
        fun newIntent(context: Context) = Intent(context, DetailsActivity::class.java)
    }
}