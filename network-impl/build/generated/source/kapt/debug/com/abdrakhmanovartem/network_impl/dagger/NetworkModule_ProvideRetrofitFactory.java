// Generated by Dagger (https://dagger.dev).
package com.abdrakhmanovartem.network_impl.dagger;

import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final Provider<OkHttpClient> clientProvider;

  private final Provider<Gson> gsonProvider;

  public NetworkModule_ProvideRetrofitFactory(Provider<OkHttpClient> clientProvider,
      Provider<Gson> gsonProvider) {
    this.clientProvider = clientProvider;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(clientProvider.get(), gsonProvider.get());
  }

  public static NetworkModule_ProvideRetrofitFactory create(Provider<OkHttpClient> clientProvider,
      Provider<Gson> gsonProvider) {
    return new NetworkModule_ProvideRetrofitFactory(clientProvider, gsonProvider);
  }

  public static Retrofit provideRetrofit(OkHttpClient client, Gson gson) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideRetrofit(client, gson));
  }
}
