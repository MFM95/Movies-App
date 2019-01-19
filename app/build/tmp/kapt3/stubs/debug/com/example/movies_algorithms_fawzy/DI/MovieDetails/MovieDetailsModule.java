package com.example.movies_algorithms_fawzy.DI.MovieDetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/movies_algorithms_fawzy/DI/MovieDetails/MovieDetailsModule;", "", "()V", "providesMovieDetailsAPI", "Lcom/example/movies_algorithms_fawzy/Features/MovieDetailsFeatures/Data/MovieDetailsAPI;", "kotlin.jvm.PlatformType", "retrofit", "Lretrofit2/Retrofit;", "providesMovieDetailsRepo", "Lcom/example/movies_algorithms_fawzy/Features/MovieDetailsFeatures/Domain/Repos/MovieDetailsRepo;", "movieDetailsAPI", "app_debug"})
@dagger.Module()
public final class MovieDetailsModule {
    
    @dagger.Provides()
    public final com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Data.MovieDetailsAPI providesMovieDetailsAPI(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Repos.MovieDetailsRepo providesMovieDetailsRepo(@org.jetbrains.annotations.NotNull()
    com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Data.MovieDetailsAPI movieDetailsAPI) {
        return null;
    }
    
    public MovieDetailsModule() {
        super();
    }
}