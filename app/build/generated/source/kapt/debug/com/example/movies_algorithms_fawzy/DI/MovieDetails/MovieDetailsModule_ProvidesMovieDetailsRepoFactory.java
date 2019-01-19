// Generated by Dagger (https://google.github.io/dagger).
package com.example.movies_algorithms_fawzy.DI.MovieDetails;

import com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Data.MovieDetailsAPI;
import com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Repos.MovieDetailsRepo;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class MovieDetailsModule_ProvidesMovieDetailsRepoFactory
    implements Factory<MovieDetailsRepo> {
  private final MovieDetailsModule module;

  private final Provider<MovieDetailsAPI> movieDetailsAPIProvider;

  public MovieDetailsModule_ProvidesMovieDetailsRepoFactory(
      MovieDetailsModule module, Provider<MovieDetailsAPI> movieDetailsAPIProvider) {
    this.module = module;
    this.movieDetailsAPIProvider = movieDetailsAPIProvider;
  }

  @Override
  public MovieDetailsRepo get() {
    return provideInstance(module, movieDetailsAPIProvider);
  }

  public static MovieDetailsRepo provideInstance(
      MovieDetailsModule module, Provider<MovieDetailsAPI> movieDetailsAPIProvider) {
    return proxyProvidesMovieDetailsRepo(module, movieDetailsAPIProvider.get());
  }

  public static MovieDetailsModule_ProvidesMovieDetailsRepoFactory create(
      MovieDetailsModule module, Provider<MovieDetailsAPI> movieDetailsAPIProvider) {
    return new MovieDetailsModule_ProvidesMovieDetailsRepoFactory(module, movieDetailsAPIProvider);
  }

  public static MovieDetailsRepo proxyProvidesMovieDetailsRepo(
      MovieDetailsModule instance, MovieDetailsAPI movieDetailsAPI) {
    return Preconditions.checkNotNull(
        instance.providesMovieDetailsRepo(movieDetailsAPI),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}