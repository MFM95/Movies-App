// Generated by Dagger (https://google.github.io/dagger).
package com.example.movies_algorithms_fawzy.DI.TopRatedMovies;

import com.example.movies_algorithms_fawzy.Features.MoviesFeature.Data.MoviesAPI;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

public final class TopRatedModule_ProvidesMoviesAPIFactory implements Factory<MoviesAPI> {
  private final TopRatedModule module;

  private final Provider<Retrofit> retrofitProvider;

  public TopRatedModule_ProvidesMoviesAPIFactory(
      TopRatedModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public MoviesAPI get() {
    return provideInstance(module, retrofitProvider);
  }

  public static MoviesAPI provideInstance(
      TopRatedModule module, Provider<Retrofit> retrofitProvider) {
    return proxyProvidesMoviesAPI(module, retrofitProvider.get());
  }

  public static TopRatedModule_ProvidesMoviesAPIFactory create(
      TopRatedModule module, Provider<Retrofit> retrofitProvider) {
    return new TopRatedModule_ProvidesMoviesAPIFactory(module, retrofitProvider);
  }

  public static MoviesAPI proxyProvidesMoviesAPI(TopRatedModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(
        instance.providesMoviesAPI(retrofit),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
