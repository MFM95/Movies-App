package com.example.movies_algorithms_fawzy.Features.MoviesFeature.Presentation.Activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u001aH\u0014J\b\u0010!\u001a\u00020\u001aH\u0002J\u0012\u0010\"\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010#H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/example/movies_algorithms_fawzy/Features/MoviesFeature/Presentation/Activities/TopRatedMoviesActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "factory", "Lcom/example/movies_algorithms_fawzy/Features/MoviesFeature/Presentation/ViewModels/TopRatedMoviesVMFactory;", "getFactory", "()Lcom/example/movies_algorithms_fawzy/Features/MoviesFeature/Presentation/ViewModels/TopRatedMoviesVMFactory;", "setFactory", "(Lcom/example/movies_algorithms_fawzy/Features/MoviesFeature/Presentation/ViewModels/TopRatedMoviesVMFactory;)V", "imageLoader", "Lcom/example/movies_algorithms_fawzy/Common/imagehelper/ImageLoader;", "getImageLoader", "()Lcom/example/movies_algorithms_fawzy/Common/imagehelper/ImageLoader;", "setImageLoader", "(Lcom/example/movies_algorithms_fawzy/Common/imagehelper/ImageLoader;)V", "moviesViewModel", "Lcom/example/movies_algorithms_fawzy/Features/MoviesFeature/Presentation/ViewModels/TopRatedMoviesViewModel;", "getMoviesViewModel", "()Lcom/example/movies_algorithms_fawzy/Features/MoviesFeature/Presentation/ViewModels/TopRatedMoviesViewModel;", "moviesViewModel$delegate", "Lkotlin/Lazy;", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "topRatedMoviesAdapter", "Lcom/example/movies_algorithms_fawzy/Features/MoviesFeature/Presentation/Adapters/TopRatedMoviesAdapter;", "displayMovies", "", "it", "Lcom/example/movies_algorithms_fawzy/Features/MoviesFeature/Domain/DataClasses/MovieListResult;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setupRecyclerView", "showError", "", "app_debug"})
public final class TopRatedMoviesActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.movies_algorithms_fawzy.Features.MoviesFeature.Presentation.ViewModels.TopRatedMoviesVMFactory factory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.movies_algorithms_fawzy.Common.imagehelper.ImageLoader imageLoader;
    private android.support.v7.widget.RecyclerView recyclerView;
    private com.example.movies_algorithms_fawzy.Features.MoviesFeature.Presentation.Adapters.TopRatedMoviesAdapter topRatedMoviesAdapter;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy moviesViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movies_algorithms_fawzy.Features.MoviesFeature.Presentation.ViewModels.TopRatedMoviesVMFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    com.example.movies_algorithms_fawzy.Features.MoviesFeature.Presentation.ViewModels.TopRatedMoviesVMFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movies_algorithms_fawzy.Common.imagehelper.ImageLoader getImageLoader() {
        return null;
    }
    
    public final void setImageLoader(@org.jetbrains.annotations.NotNull()
    com.example.movies_algorithms_fawzy.Common.imagehelper.ImageLoader p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movies_algorithms_fawzy.Features.MoviesFeature.Presentation.ViewModels.TopRatedMoviesViewModel getMoviesViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void displayMovies(com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.DataClasses.MovieListResult it) {
    }
    
    private final void showError(java.lang.Throwable it) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public TopRatedMoviesActivity() {
        super();
    }
}