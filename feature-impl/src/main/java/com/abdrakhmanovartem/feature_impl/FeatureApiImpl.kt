package com.abdrakhmanovartem.feature_impl

import android.content.Context
import com.abdrakhmanovartem.feature_api.FeatureApi
import javax.inject.Inject

class FeatureApiImpl @Inject constructor(): FeatureApi {

    override fun startFeature(context: Context) {
        context.startActivity(FeatureActivity.newIntent(context))
    }
}