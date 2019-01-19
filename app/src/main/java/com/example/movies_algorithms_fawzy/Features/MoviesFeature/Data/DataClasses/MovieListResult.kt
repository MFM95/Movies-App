package com.example.movies_algorithms_fawzy.Features.MoviesFeature.Data.DataClasses

import com.google.gson.annotations.SerializedName

fun MovieListResult.map() = com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.DataClasses.MovieListResult(
    this.page, this.movies.map { it.map()}
)
class MovieListResult {

    var page: Int = 0
    @SerializedName("results")
    lateinit var movies: List<MovieData>
}