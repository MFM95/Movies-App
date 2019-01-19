package com.example.movies_algorithms_fawzy.Features.MoviesFeature.Presentation.ViewModels

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import javax.inject.Inject


class TopRatedMoviesVMFactory @Inject constructor(val topRatedMoviesViewModel: TopRatedMoviesViewModel) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return topRatedMoviesViewModel as T
    }

}