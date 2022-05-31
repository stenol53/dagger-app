package com.abdrakhmanovartem.some_feature

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.abdrakhmanovartem.common.findComponentDependencies
import com.abdrakhmanovartem.some_feature.api.AnotherDep
import com.abdrakhmanovartem.some_feature.api.SomeDep
import com.abdrakhmanovartem.some_feature.di.DaggerSomeFeatureComponent
import com.abdrakhmanovartem.some_feature.di.SomeFeatureComponent
import javax.inject.Inject

class SomeFeatureActivity : AppCompatActivity() {

//    private val component: SomeFeatureComponent by lazy {
//        DaggerSomeFeatureComponent.builder()
//            .someFeatureDependencies(findComponentDependencies())
//            .build()
//    }
//
//    @Inject
//    lateinit var someDep: SomeDep
//
//    @Inject
//    lateinit var anotherDep: AnotherDep

    override fun onCreate(savedInstanceState: Bundle?) {
//        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_some_feature)
    }
}