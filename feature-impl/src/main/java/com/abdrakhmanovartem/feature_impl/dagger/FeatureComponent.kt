package com.abdrakhmanovartem.feature_impl.dagger

import com.abdrakhmanovartem.feature_api.FeatureApi
import com.abdrakhmanovartem.feature_api.FeatureDependencies
import com.abdrakhmanovartem.feature_impl.FeatureActivity
import dagger.Component
import java.lang.RuntimeException

@Component(
    modules = [FeatureModule::class],
    dependencies = [FeatureDependencies::class]
)
interface FeatureComponent : FeatureApi {

    fun inject(activity: FeatureActivity)

    @Component.Factory
    interface Factory {
        fun create(dependencies: FeatureDependencies): FeatureComponent
    }

    companion object {
        private var component: FeatureComponent? = null

        fun createAndGet(dependencies: FeatureDependencies): FeatureApi {
            return component ?: DaggerFeatureComponent.factory()
                .create(dependencies).also { component = it }
        }

        internal fun get(): FeatureComponent {
            return component ?: throw RuntimeException("")
        }

        internal fun clear() {
            component = null
        }
    }
}