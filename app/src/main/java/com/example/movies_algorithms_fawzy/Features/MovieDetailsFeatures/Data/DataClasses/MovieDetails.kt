package com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Data.DataClasses

import com.google.gson.annotations.SerializedName

fun MovieDetails.map() =  com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Models.MovieDetails(
    title, posterPath, voteAverage, voteCount, originalLanguage, releaseDate)
 class MovieDetails (


    @SerializedName("adult")
    var adult: Boolean = false,


    @SerializedName("budget")
    var budget: Int? = null,

    @SerializedName("homepage")
    var homepage: String? = null,
     @SerializedName("id")
    var id: Int = -1,

    @SerializedName("imdb_id")
    var imdbId: String? = null,

    @SerializedName("popularity")
    var popularity: Double = 0.0,

    @SerializedName("revenue")
    var revenue: Int? = null,

    @SerializedName("runtime")
    var runtime: Int? = null,

    @SerializedName("tagline")
    var tagline: String? = null,

    @SerializedName("video")
    var video: Boolean = false,

    @SerializedName("vote_average")
    var voteAverage: Double = 0.0,

    @SerializedName("vote_count")
    var voteCount: Int = 0,

    @SerializedName("title")
    var title: String,

    @SerializedName("poster_path")
    var posterPath: String,

    @SerializedName("original_language")
    var originalLanguage: String,

    @SerializedName("original_title")
    var originalTitle: String,

    @SerializedName("backdrop_path")
    var backdropPath: String,

    @SerializedName("overview")
    var overview: String,

    @SerializedName("release_date")
    var releaseDate: String
)