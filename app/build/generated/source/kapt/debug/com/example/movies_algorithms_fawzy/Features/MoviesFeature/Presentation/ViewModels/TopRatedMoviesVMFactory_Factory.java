// Generated by Dagger (https://google.github.io/dagger).
package com.example.movies_algorithms_fawzy.Features.MoviesFeature.Presentation.ViewModels;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class TopRatedMoviesVMFactory_Factory implements Factory<TopRatedMoviesVMFactory> {
  private final Provider<TopRatedMoviesViewModel> topRatedMoviesViewModelProvider;

  public TopRatedMoviesVMFactory_Factory(
      Provider<TopRatedMoviesViewModel> topRatedMoviesViewModelProvider) {
    this.topRatedMoviesViewModelProvider = topRatedMoviesViewModelProvider;
  }

  @Override
  public TopRatedMoviesVMFactory get() {
    return provideInstance(topRatedMoviesViewModelProvider);
  }

  public static TopRatedMoviesVMFactory provideInstance(
      Provider<TopRatedMoviesViewModel> topRatedMoviesViewModelProvider) {
    return new TopRatedMoviesVMFactory(topRatedMoviesViewModelProvider.get());
  }

  public static TopRatedMoviesVMFactory_Factory create(
      Provider<TopRatedMoviesViewModel> topRatedMoviesViewModelProvider) {
    return new TopRatedMoviesVMFactory_Factory(topRatedMoviesViewModelProvider);
  }

  public static TopRatedMoviesVMFactory newTopRatedMoviesVMFactory(
      TopRatedMoviesViewModel topRatedMoviesViewModel) {
    return new TopRatedMoviesVMFactory(topRatedMoviesViewModel);
  }
}
