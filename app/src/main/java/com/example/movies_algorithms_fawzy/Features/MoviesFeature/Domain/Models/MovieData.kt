package com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.Models

import com.google.gson.annotations.SerializedName



data class MovieData(

        var id: Int = -1,
        var title: String,
        var posterPath: String? = null

)