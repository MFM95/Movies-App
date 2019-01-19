package com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Interactors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/example/movies_algorithms_fawzy/Features/MovieDetailsFeatures/Domain/Interactors/GetMovieDetailsUSeCase;", "", "movieDetailsRepo", "Lcom/example/movies_algorithms_fawzy/Features/MovieDetailsFeatures/Domain/Repos/MovieDetailsRepo;", "(Lcom/example/movies_algorithms_fawzy/Features/MovieDetailsFeatures/Domain/Repos/MovieDetailsRepo;)V", "getMovieDetailsRepo", "()Lcom/example/movies_algorithms_fawzy/Features/MovieDetailsFeatures/Domain/Repos/MovieDetailsRepo;", "getMovieDetails", "Lio/reactivex/Observable;", "Lcom/example/movies_algorithms_fawzy/Features/MovieDetailsFeatures/Domain/Models/MovieDetails;", "id", "", "app_debug"})
public final class GetMovieDetailsUSeCase {
    @org.jetbrains.annotations.NotNull()
    private final com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Repos.MovieDetailsRepo movieDetailsRepo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Models.MovieDetails> getMovieDetails(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Repos.MovieDetailsRepo getMovieDetailsRepo() {
        return null;
    }
    
    @javax.inject.Inject()
    public GetMovieDetailsUSeCase(@org.jetbrains.annotations.NotNull()
    com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Repos.MovieDetailsRepo movieDetailsRepo) {
        super();
    }
}