package com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Presentation.ViewModels

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import javax.inject.Inject

class MovieDetailsVMFactory @Inject constructor(val movieDetailsViewModel: MovieDetailsViewModel) : ViewModelProvider.Factory{

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return movieDetailsViewModel as T
    }

}