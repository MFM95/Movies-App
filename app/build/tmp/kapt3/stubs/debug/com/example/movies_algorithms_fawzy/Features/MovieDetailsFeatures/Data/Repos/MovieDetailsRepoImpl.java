package com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Data.Repos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/example/movies_algorithms_fawzy/Features/MovieDetailsFeatures/Data/Repos/MovieDetailsRepoImpl;", "Lcom/example/movies_algorithms_fawzy/Features/MovieDetailsFeatures/Domain/Repos/MovieDetailsRepo;", "movieDetailsAPI", "Lcom/example/movies_algorithms_fawzy/Features/MovieDetailsFeatures/Data/MovieDetailsAPI;", "(Lcom/example/movies_algorithms_fawzy/Features/MovieDetailsFeatures/Data/MovieDetailsAPI;)V", "getMovieDetailsAPI", "()Lcom/example/movies_algorithms_fawzy/Features/MovieDetailsFeatures/Data/MovieDetailsAPI;", "getMovieDetails", "Lio/reactivex/Observable;", "Lcom/example/movies_algorithms_fawzy/Features/MovieDetailsFeatures/Domain/Models/MovieDetails;", "id", "", "app_debug"})
public final class MovieDetailsRepoImpl implements com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Repos.MovieDetailsRepo {
    @org.jetbrains.annotations.NotNull()
    private final com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Data.MovieDetailsAPI movieDetailsAPI = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Models.MovieDetails> getMovieDetails(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Data.MovieDetailsAPI getMovieDetailsAPI() {
        return null;
    }
    
    public MovieDetailsRepoImpl(@org.jetbrains.annotations.NotNull()
    com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Data.MovieDetailsAPI movieDetailsAPI) {
        super();
    }
}