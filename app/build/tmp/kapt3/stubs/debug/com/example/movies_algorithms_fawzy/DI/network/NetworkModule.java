package com.example.movies_algorithms_fawzy.DI.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH\u0007J \u0010\n\u001a\u00020\u000b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/movies_algorithms_fawzy/DI/network/NetworkModule;", "", "baseUrl", "", "apiKey", "(Ljava/lang/String;Ljava/lang/String;)V", "provideInterceptors", "Ljava/util/ArrayList;", "Lokhttp3/Interceptor;", "Lkotlin/collections/ArrayList;", "provideRetrofit", "Lretrofit2/Retrofit;", "interceptors", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    private final java.lang.String baseUrl = null;
    private final java.lang.String apiKey = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final java.util.ArrayList<okhttp3.Interceptor> provideInterceptors() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<okhttp3.Interceptor> interceptors) {
        return null;
    }
    
    public NetworkModule(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey) {
        super();
    }
}