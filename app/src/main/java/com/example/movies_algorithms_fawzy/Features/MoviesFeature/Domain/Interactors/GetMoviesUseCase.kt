package com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.Interactors

import com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.Repos.MoviesRepo
import javax.inject.Inject

class GetMoviesUseCase @Inject constructor(val moviesRepo: MoviesRepo){
    fun getTopRatedMovies() = moviesRepo.getTopRatedMovies()

}