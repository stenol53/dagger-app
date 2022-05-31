package com.abdrakhmanovartem.network_impl.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/abdrakhmanovartem/network_impl/dagger/NetworkComponent;", "Lcom/abdrakhmanovartem/network_api/dagger/NetworkProvider;", "Companion", "Factory", "network-impl_debug"})
@javax.inject.Singleton()
@dagger.Component(modules = {com.abdrakhmanovartem.network_impl.dagger.NetworkModule.class})
public abstract interface NetworkComponent extends com.abdrakhmanovartem.network_api.dagger.NetworkProvider {
    @org.jetbrains.annotations.NotNull()
    public static final com.abdrakhmanovartem.network_impl.dagger.NetworkComponent.Companion Companion = null;
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/abdrakhmanovartem/network_impl/dagger/NetworkComponent$Factory;", "", "create", "Lcom/abdrakhmanovartem/network_impl/dagger/NetworkComponent;", "network-impl_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.abdrakhmanovartem.network_impl.dagger.NetworkComponent create();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/abdrakhmanovartem/network_impl/dagger/NetworkComponent$Companion;", "", "()V", "init", "Lcom/abdrakhmanovartem/network_api/dagger/NetworkProvider;", "network-impl_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.abdrakhmanovartem.network_api.dagger.NetworkProvider init() {
            return null;
        }
    }
}