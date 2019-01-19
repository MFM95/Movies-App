package com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Repos

import com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Models.MovieDetails
import io.reactivex.Observable

interface MovieDetailsRepo {
    fun getMovieDetails(id: Int): Observable<MovieDetails>
}