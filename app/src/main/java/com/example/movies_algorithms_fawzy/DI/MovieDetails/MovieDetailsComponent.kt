package com.example.movies_algorithms_fawzy.DI.MovieDetails

import com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Presentation.Activities.MovieDetailsActivity
import dagger.Subcomponent

@Subcomponent(modules = [MovieDetailsModule::class])
interface MovieDetailsComponent {
    fun inject (activity: MovieDetailsActivity)
}