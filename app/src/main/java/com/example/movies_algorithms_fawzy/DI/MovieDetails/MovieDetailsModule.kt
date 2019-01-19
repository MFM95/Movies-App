package com.example.movies_algorithms_fawzy.DI.MovieDetails

import com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Data.MovieDetailsAPI
import com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Data.Repos.MovieDetailsRepoImpl
import com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Repos.MovieDetailsRepo
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class MovieDetailsModule() {

    @Provides
    fun providesMovieDetailsAPI (retrofit: Retrofit) = retrofit.create(MovieDetailsAPI::class.java)

    @Provides
    fun providesMovieDetailsRepo (movieDetailsAPI: MovieDetailsAPI): MovieDetailsRepo = MovieDetailsRepoImpl(movieDetailsAPI)

}