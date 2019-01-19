package com.example.movies_algorithms_fawzy.Features.MoviesFeature.Data.Repos

import com.example.movies_algorithms_fawzy.Features.MoviesFeature.Data.DataClasses.map
import com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.DataClasses.MovieListResult
import com.example.movies_algorithms_fawzy.Features.MoviesFeature.Data.MoviesAPI
import com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.Repos.MoviesRepo
import io.reactivex.Observable
import java.util.function.Function

class MoviesRepoImpl constructor(val moviesAPI: MoviesAPI) : MoviesRepo {
    override fun getTopRatedMovies(): Observable<MovieListResult> = moviesAPI.getTopRatedMovies().map {it.map()}

}