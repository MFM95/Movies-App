package com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Presentation.ViewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"Lcom/example/movies_algorithms_fawzy/Features/MovieDetailsFeatures/Presentation/ViewModels/MovieDetailsViewModel;", "Lcom/example/movies_algorithms_fawzy/Base/BaseViewModel;", "getMovieDetailsUSeCase", "Lcom/example/movies_algorithms_fawzy/Features/MovieDetailsFeatures/Domain/Interactors/GetMovieDetailsUSeCase;", "(Lcom/example/movies_algorithms_fawzy/Features/MovieDetailsFeatures/Domain/Interactors/GetMovieDetailsUSeCase;)V", "errorState", "Lcom/example/movies_algorithms_fawzy/Common/SingleLiveEvent;", "", "getErrorState", "()Lcom/example/movies_algorithms_fawzy/Common/SingleLiveEvent;", "setErrorState", "(Lcom/example/movies_algorithms_fawzy/Common/SingleLiveEvent;)V", "movieDetailsLiveData", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/example/movies_algorithms_fawzy/Features/MovieDetailsFeatures/Domain/Models/MovieDetails;", "getMovieDetailsLiveData", "()Landroid/arch/lifecycle/MutableLiveData;", "setMovieDetailsLiveData", "(Landroid/arch/lifecycle/MutableLiveData;)V", "getMovieDetails", "", "id", "", "app_debug"})
public final class MovieDetailsViewModel extends com.example.movies_algorithms_fawzy.Base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.movies_algorithms_fawzy.Common.SingleLiveEvent<java.lang.Throwable> errorState;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Models.MovieDetails> movieDetailsLiveData;
    private final com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Interactors.GetMovieDetailsUSeCase getMovieDetailsUSeCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movies_algorithms_fawzy.Common.SingleLiveEvent<java.lang.Throwable> getErrorState() {
        return null;
    }
    
    public final void setErrorState(@org.jetbrains.annotations.NotNull()
    com.example.movies_algorithms_fawzy.Common.SingleLiveEvent<java.lang.Throwable> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Models.MovieDetails> getMovieDetailsLiveData() {
        return null;
    }
    
    public final void setMovieDetailsLiveData(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Models.MovieDetails> p0) {
    }
    
    public final void getMovieDetails(int id) {
    }
    
    @javax.inject.Inject()
    public MovieDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Interactors.GetMovieDetailsUSeCase getMovieDetailsUSeCase) {
        super();
    }
}