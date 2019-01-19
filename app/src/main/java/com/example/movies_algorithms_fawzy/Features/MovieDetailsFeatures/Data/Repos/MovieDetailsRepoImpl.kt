package com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Data.Repos

import com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Data.DataClasses.map
import com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Data.MovieDetailsAPI
import com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Models.MovieDetails
import com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Repos.MovieDetailsRepo
import io.reactivex.Observable

class MovieDetailsRepoImpl(val movieDetailsAPI: MovieDetailsAPI) : MovieDetailsRepo {
    override fun getMovieDetails(id: Int): Observable<MovieDetails> = movieDetailsAPI.getMovieDetails(id).map { it.map() }
}