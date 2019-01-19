package com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Presentation.ViewModels

import android.arch.lifecycle.MutableLiveData
import com.example.movies_algorithms_fawzy.Base.BaseViewModel
import com.example.movies_algorithms_fawzy.Common.SingleLiveEvent
import com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Interactors.GetMovieDetailsUSeCase
import com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Models.MovieDetails
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MovieDetailsViewModel @Inject constructor(private val getMovieDetailsUSeCase: GetMovieDetailsUSeCase) : BaseViewModel() {
    var errorState : SingleLiveEvent<Throwable> = SingleLiveEvent()
    var movieDetailsLiveData: MutableLiveData<MovieDetails> = MutableLiveData()
    fun getMovieDetails(id: Int) {
        addDisposable(
            getMovieDetailsUSeCase.getMovieDetails(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        {
                            movieDetailsLiveData.value = it
                        },
                        {
                            errorState.value = it
                        })
        )
    }
}