package com.abdrakhmanovartem.core_impl.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/abdrakhmanovartem/core_impl/dagger/AppContextComponent;", "Lcom/abdrakhmanovartem/core_api/dagger/ContextProvider;", "Companion", "Factory", "core-impl_debug"})
@javax.inject.Singleton()
@dagger.Component(modules = {com.abdrakhmanovartem.core_impl.dagger.AppContextModule.class})
public abstract interface AppContextComponent extends com.abdrakhmanovartem.core_api.dagger.ContextProvider {
    @org.jetbrains.annotations.NotNull()
    public static final com.abdrakhmanovartem.core_impl.dagger.AppContextComponent.Companion Companion = null;
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/abdrakhmanovartem/core_impl/dagger/AppContextComponent$Factory;", "", "create", "Lcom/abdrakhmanovartem/core_impl/dagger/AppContextComponent;", "app", "Lcom/abdrakhmanovartem/core_api/App;", "core-impl_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.abdrakhmanovartem.core_impl.dagger.AppContextComponent create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        com.abdrakhmanovartem.core_api.App app);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/abdrakhmanovartem/core_impl/dagger/AppContextComponent$Companion;", "", "()V", "init", "error/NonExistentClass", "app", "Lcom/abdrakhmanovartem/core_api/App;", "(Lcom/abdrakhmanovartem/core_api/App;)Lerror/NonExistentClass;", "core-impl_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final error.NonExistentClass init(@org.jetbrains.annotations.NotNull()
        com.abdrakhmanovartem.core_api.App app) {
            return null;
        }
    }
}