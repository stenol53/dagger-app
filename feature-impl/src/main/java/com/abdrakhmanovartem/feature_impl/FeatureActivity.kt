package com.abdrakhmanovartem.feature_impl

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FeatureActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature)
    }

    override fun onDestroy() {
        super.onDestroy()

        if (isFinishing) {

        }
    }

    companion object {
        fun newIntent(context: Context) = Intent(context, FeatureActivity::class.java)
    }
}