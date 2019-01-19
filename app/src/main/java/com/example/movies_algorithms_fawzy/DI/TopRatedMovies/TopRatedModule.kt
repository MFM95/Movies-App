package com.example.movies_algorithms_fawzy.DI.TopRatedMovies

import android.app.Activity
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.support.v4.app.FragmentActivity
import com.example.movies_algorithms_fawzy.Features.MoviesFeature.Data.MoviesAPI
import com.example.movies_algorithms_fawzy.Features.MoviesFeature.Data.Repos.MoviesRepoImpl
import com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.Repos.MoviesRepo
import com.example.movies_algorithms_fawzy.Features.MoviesFeature.Presentation.ViewModels.TopRatedMoviesVMFactory
import com.example.movies_algorithms_fawzy.Features.MoviesFeature.Presentation.ViewModels.TopRatedMoviesViewModel
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class TopRatedModule () {

    @Provides
    fun providesMoviesAPI (retrofit: Retrofit) = retrofit.create(MoviesAPI::class.java)

    // returns the interface not the implementing class, despite of the return body
    @Provides
    fun providesMoviesRepo (moviesAPI: MoviesAPI) : MoviesRepo = MoviesRepoImpl(moviesAPI)

   /* @Provides
    fun providesTopRatedMoviesViewModel (factory:TopRatedMoviesVMFactory): TopRatedMoviesViewModel =
        ViewModelProviders.of(activity, factory).get(TopRatedMoviesViewModel::class.java)*/


}