package com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.Repos

import com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.DataClasses.MovieListResult
import io.reactivex.Observable

interface MoviesRepo {
    fun getTopRatedMovies(): Observable<MovieListResult>
}