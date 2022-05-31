package com.abdrakhmanovartem.some_feature.api

import com.abdrakhmanovartem.common.ComponentDependencies

interface SomeFeatureDependencies : ComponentDependencies {

    fun someDep(): SomeDep
    fun anotherDep(): AnotherDep
}