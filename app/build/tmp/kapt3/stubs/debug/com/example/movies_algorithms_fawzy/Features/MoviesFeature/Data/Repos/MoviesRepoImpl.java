package com.example.movies_algorithms_fawzy.Features.MoviesFeature.Data.Repos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/example/movies_algorithms_fawzy/Features/MoviesFeature/Data/Repos/MoviesRepoImpl;", "Lcom/example/movies_algorithms_fawzy/Features/MoviesFeature/Domain/Repos/MoviesRepo;", "moviesAPI", "Lcom/example/movies_algorithms_fawzy/Features/MoviesFeature/Data/MoviesAPI;", "(Lcom/example/movies_algorithms_fawzy/Features/MoviesFeature/Data/MoviesAPI;)V", "getMoviesAPI", "()Lcom/example/movies_algorithms_fawzy/Features/MoviesFeature/Data/MoviesAPI;", "getTopRatedMovies", "Lio/reactivex/Observable;", "Lcom/example/movies_algorithms_fawzy/Features/MoviesFeature/Domain/DataClasses/MovieListResult;", "app_debug"})
public final class MoviesRepoImpl implements com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.Repos.MoviesRepo {
    @org.jetbrains.annotations.NotNull()
    private final com.example.movies_algorithms_fawzy.Features.MoviesFeature.Data.MoviesAPI moviesAPI = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.DataClasses.MovieListResult> getTopRatedMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movies_algorithms_fawzy.Features.MoviesFeature.Data.MoviesAPI getMoviesAPI() {
        return null;
    }
    
    public MoviesRepoImpl(@org.jetbrains.annotations.NotNull()
    com.example.movies_algorithms_fawzy.Features.MoviesFeature.Data.MoviesAPI moviesAPI) {
        super();
    }
}