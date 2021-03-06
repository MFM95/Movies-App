// Generated by Dagger (https://google.github.io/dagger).
package com.example.movies_algorithms_fawzy.DI.application;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class AppModule_ProvideAppContextFactory implements Factory<Context> {
  private final AppModule module;

  public AppModule_ProvideAppContextFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return provideInstance(module);
  }

  public static Context provideInstance(AppModule module) {
    return proxyProvideAppContext(module);
  }

  public static AppModule_ProvideAppContextFactory create(AppModule module) {
    return new AppModule_ProvideAppContextFactory(module);
  }

  public static Context proxyProvideAppContext(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideAppContext(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
