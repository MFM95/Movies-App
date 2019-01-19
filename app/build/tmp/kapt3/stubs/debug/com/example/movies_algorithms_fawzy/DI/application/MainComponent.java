package com.example.movies_algorithms_fawzy.DI.application;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/example/movies_algorithms_fawzy/DI/application/MainComponent;", "", "plus", "Lcom/example/movies_algorithms_fawzy/DI/MovieDetails/MovieDetailsComponent;", "movieDetailsModule", "Lcom/example/movies_algorithms_fawzy/DI/MovieDetails/MovieDetailsModule;", "Lcom/example/movies_algorithms_fawzy/DI/TopRatedMovies/TopRatedMoviesComponent;", "topRatedMoviesModule", "Lcom/example/movies_algorithms_fawzy/DI/TopRatedMovies/TopRatedModule;", "app_debug"})
@dagger.Component(modules = {com.example.movies_algorithms_fawzy.DI.application.AppModule.class, com.example.movies_algorithms_fawzy.DI.network.NetworkModule.class, dagger.android.support.AndroidSupportInjectionModule.class})
@javax.inject.Singleton()
public abstract interface MainComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.movies_algorithms_fawzy.DI.TopRatedMovies.TopRatedMoviesComponent plus(@org.jetbrains.annotations.NotNull()
    com.example.movies_algorithms_fawzy.DI.TopRatedMovies.TopRatedModule topRatedMoviesModule);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.movies_algorithms_fawzy.DI.MovieDetails.MovieDetailsComponent plus(@org.jetbrains.annotations.NotNull()
    com.example.movies_algorithms_fawzy.DI.MovieDetails.MovieDetailsModule movieDetailsModule);
}