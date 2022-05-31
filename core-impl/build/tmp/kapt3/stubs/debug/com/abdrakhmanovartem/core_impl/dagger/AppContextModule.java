package com.abdrakhmanovartem.core_impl.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c1\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/abdrakhmanovartem/core_impl/dagger/AppContextModule;", "", "()V", "provideAppContext", "Landroid/content/Context;", "app", "Lcom/abdrakhmanovartem/core_api/App;", "provideResourcesProvider", "Lcom/abdrakhmanovartem/core_api/ResourcesProvider;", "core-impl_debug"})
@dagger.Module()
public final class AppContextModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.abdrakhmanovartem.core_impl.dagger.AppContextModule INSTANCE = null;
    
    private AppContextModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.Context provideAppContext(@org.jetbrains.annotations.NotNull()
    com.abdrakhmanovartem.core_api.App app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.abdrakhmanovartem.core_api.ResourcesProvider provideResourcesProvider(@org.jetbrains.annotations.NotNull()
    com.abdrakhmanovartem.core_api.App app) {
        return null;
    }
}