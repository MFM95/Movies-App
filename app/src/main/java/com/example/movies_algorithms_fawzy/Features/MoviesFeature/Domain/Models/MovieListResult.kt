package com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.DataClasses

import com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.Models.MovieData
import com.google.gson.annotations.SerializedName

data class MovieListResult (val page: Int, val movies: List<MovieData>)