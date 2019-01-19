package com.example.movies_algorithms_fawzy.Features.MoviesFeature.Presentation.Adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\r\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/movies_algorithms_fawzy/Features/MoviesFeature/Presentation/Adapters/TopRatedMoviesAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/example/movies_algorithms_fawzy/Features/MoviesFeature/Presentation/Adapters/TopRatedMoviesAdapter$MovieCellViewHolder;", "imageLoader", "Lcom/example/movies_algorithms_fawzy/Common/imagehelper/ImageLoader;", "onMovieSelected", "Lkotlin/Function2;", "Lcom/example/movies_algorithms_fawzy/Features/MoviesFeature/Domain/Models/MovieData;", "Landroid/view/View;", "", "(Lcom/example/movies_algorithms_fawzy/Common/imagehelper/ImageLoader;Lkotlin/jvm/functions/Function2;)V", "movies", "", "addMovies", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MovieCellViewHolder", "app_debug"})
public final class TopRatedMoviesAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.example.movies_algorithms_fawzy.Features.MoviesFeature.Presentation.Adapters.TopRatedMoviesAdapter.MovieCellViewHolder> {
    private final java.util.List<com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.Models.MovieData> movies = null;
    private final com.example.movies_algorithms_fawzy.Common.imagehelper.ImageLoader imageLoader = null;
    private final kotlin.jvm.functions.Function2<com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.Models.MovieData, android.view.View, kotlin.Unit> onMovieSelected = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.movies_algorithms_fawzy.Features.MoviesFeature.Presentation.Adapters.TopRatedMoviesAdapter.MovieCellViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.movies_algorithms_fawzy.Features.MoviesFeature.Presentation.Adapters.TopRatedMoviesAdapter.MovieCellViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void addMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.Models.MovieData> movies) {
    }
    
    public TopRatedMoviesAdapter(@org.jetbrains.annotations.NotNull()
    com.example.movies_algorithms_fawzy.Common.imagehelper.ImageLoader imageLoader, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.Models.MovieData, ? super android.view.View, kotlin.Unit> onMovieSelected) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\f\u00a8\u0006\r"}, d2 = {"Lcom/example/movies_algorithms_fawzy/Features/MoviesFeature/Presentation/Adapters/TopRatedMoviesAdapter$MovieCellViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "movie", "Lcom/example/movies_algorithms_fawzy/Features/MoviesFeature/Domain/Models/MovieData;", "imageLoader", "Lcom/example/movies_algorithms_fawzy/Common/imagehelper/ImageLoader;", "listener", "Lkotlin/Function2;", "app_debug"})
    public static final class MovieCellViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.Models.MovieData movie, @org.jetbrains.annotations.NotNull()
        com.example.movies_algorithms_fawzy.Common.imagehelper.ImageLoader imageLoader, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.Models.MovieData, ? super android.view.View, kotlin.Unit> listener) {
        }
        
        public MovieCellViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}