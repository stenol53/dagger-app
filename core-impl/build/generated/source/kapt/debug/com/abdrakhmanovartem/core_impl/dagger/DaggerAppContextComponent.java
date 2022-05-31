// Generated by Dagger (https://dagger.dev).
package com.abdrakhmanovartem.core_impl.dagger;

import android.content.Context;
import com.abdrakhmanovartem.core_api.App;
import com.abdrakhmanovartem.core_api.ResourcesProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppContextComponent implements AppContextComponent {
  private final App app;

  private DaggerAppContextComponent(App appParam) {
    this.app = appParam;
  }

  public static AppContextComponent.Factory factory() {
    return new Factory();
  }

  @Override
  public Context provideContext() {
    return AppContextModule_ProvideAppContextFactory.provideAppContext(app);
  }

  @Override
  public ResourcesProvider provideResourcesProvider() {
    return AppContextModule_ProvideResourcesProviderFactory.provideResourcesProvider(app);
  }

  private static final class Factory implements AppContextComponent.Factory {
    @Override
    public AppContextComponent create(App app) {
      Preconditions.checkNotNull(app);
      return new DaggerAppContextComponent(app);
    }
  }
}
