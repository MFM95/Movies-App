package com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Interactors

import com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Repos.MovieDetailsRepo
import javax.inject.Inject

class GetMovieDetailsUSeCase @Inject constructor(val movieDetailsRepo: MovieDetailsRepo) {
    fun getMovieDetails(id: Int) = movieDetailsRepo.getMovieDetails(id)
}