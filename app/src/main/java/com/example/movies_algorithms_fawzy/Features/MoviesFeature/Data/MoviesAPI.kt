package com.example.movies_algorithms_fawzy.Features.MoviesFeature.Data

import com.example.movies_algorithms_fawzy.Features.MoviesFeature.Data.DataClasses.MovieListResult
import io.reactivex.Observable
import retrofit2.http.GET

interface MoviesAPI {
    @GET("movie/top_rated")
    fun getTopRatedMovies(): Observable<MovieListResult>
}