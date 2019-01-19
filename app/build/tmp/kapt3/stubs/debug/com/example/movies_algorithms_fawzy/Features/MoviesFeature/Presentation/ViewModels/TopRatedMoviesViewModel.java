package com.example.movies_algorithms_fawzy.Features.MoviesFeature.Presentation.ViewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0014R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0015"}, d2 = {"Lcom/example/movies_algorithms_fawzy/Features/MoviesFeature/Presentation/ViewModels/TopRatedMoviesViewModel;", "Lcom/example/movies_algorithms_fawzy/Base/BaseViewModel;", "getMoviesUseCase", "Lcom/example/movies_algorithms_fawzy/Features/MoviesFeature/Domain/Interactors/GetMoviesUseCase;", "(Lcom/example/movies_algorithms_fawzy/Features/MoviesFeature/Domain/Interactors/GetMoviesUseCase;)V", "errorState", "Lcom/example/movies_algorithms_fawzy/Common/SingleLiveEvent;", "", "getErrorState", "()Lcom/example/movies_algorithms_fawzy/Common/SingleLiveEvent;", "setErrorState", "(Lcom/example/movies_algorithms_fawzy/Common/SingleLiveEvent;)V", "moviesLiveData", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/example/movies_algorithms_fawzy/Features/MoviesFeature/Domain/DataClasses/MovieListResult;", "getMoviesLiveData", "()Landroid/arch/lifecycle/MutableLiveData;", "setMoviesLiveData", "(Landroid/arch/lifecycle/MutableLiveData;)V", "getTopRatedMovies", "", "app_debug"})
public final class TopRatedMoviesViewModel extends com.example.movies_algorithms_fawzy.Base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.movies_algorithms_fawzy.Common.SingleLiveEvent<java.lang.Throwable> errorState;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.DataClasses.MovieListResult> moviesLiveData;
    private final com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.Interactors.GetMoviesUseCase getMoviesUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movies_algorithms_fawzy.Common.SingleLiveEvent<java.lang.Throwable> getErrorState() {
        return null;
    }
    
    public final void setErrorState(@org.jetbrains.annotations.NotNull()
    com.example.movies_algorithms_fawzy.Common.SingleLiveEvent<java.lang.Throwable> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.DataClasses.MovieListResult> getMoviesLiveData() {
        return null;
    }
    
    public final void setMoviesLiveData(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.DataClasses.MovieListResult> p0) {
    }
    
    public final void getTopRatedMovies() {
    }
    
    @javax.inject.Inject()
    public TopRatedMoviesViewModel(@org.jetbrains.annotations.NotNull()
    com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.Interactors.GetMoviesUseCase getMoviesUseCase) {
        super();
    }
}