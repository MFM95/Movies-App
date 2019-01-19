package com.example.movies_algorithms_fawzy.DI.application;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/movies_algorithms_fawzy/DI/application/AppModule;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "appContext", "kotlin.jvm.PlatformType", "provideAppContext", "provideImageLoader", "Lcom/example/movies_algorithms_fawzy/Common/imagehelper/ImageLoader;", "app_debug"})
@dagger.Module()
public final class AppModule {
    private final android.content.Context appContext = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final android.content.Context provideAppContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.movies_algorithms_fawzy.Common.imagehelper.ImageLoader provideImageLoader(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public AppModule(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}