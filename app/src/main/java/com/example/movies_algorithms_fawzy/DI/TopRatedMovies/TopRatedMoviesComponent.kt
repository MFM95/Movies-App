package com.example.movies_algorithms_fawzy.DI.TopRatedMovies

import android.support.v4.app.FragmentActivity
import com.example.movies_algorithms_fawzy.Features.MoviesFeature.Presentation.Activities.TopRatedMoviesActivity
import dagger.Component
import dagger.Subcomponent

@Subcomponent(modules = [TopRatedModule::class])
interface TopRatedMoviesComponent {
    fun inject (activity: TopRatedMoviesActivity)
}