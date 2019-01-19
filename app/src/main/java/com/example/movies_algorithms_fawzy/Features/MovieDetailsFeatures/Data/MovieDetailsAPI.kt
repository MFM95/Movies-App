package com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Data

import com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Data.DataClasses.MovieDetails
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface MovieDetailsAPI {
    @GET("movie/{id}?")
    fun getMovieDetails(@Path("id") movieId: Int): Observable<MovieDetails>
}