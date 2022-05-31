package com.abdrakhmanovartem.some_feature

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.abdrakhmanovartem.common.findComponentDependencies
import com.abdrakhmanovartem.some_feature.api.AnotherDep
import com.abdrakhmanovartem.some_feature.api.SomeDep
import com.abdrakhmanovartem.some_feature.di.DaggerSomeFeatureComponent
import com.abdrakhmanovartem.some_feature.di.SomeFeatureComponent
import javax.inject.Inject

class SomeFeatureFragment : Fragment() {

    private val component: SomeFeatureComponent by lazy {
        DaggerSomeFeatureComponent.builder()
            .someFeatureDependencies(findComponentDependencies())
            .build()
    }

    @Inject
    lateinit var someDep: SomeDep

    @Inject
    lateinit var anotherDep: AnotherDep

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
    }
}