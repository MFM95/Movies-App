package com.example.movies_algorithms_fawzy.Features.MoviesFeature.Presentation.ViewModels

import android.arch.lifecycle.MutableLiveData
import com.example.movies_algorithms_fawzy.Base.BaseViewModel
import com.example.movies_algorithms_fawzy.Common.SingleLiveEvent
import com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.DataClasses.MovieListResult
import com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.Interactors.GetMoviesUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class TopRatedMoviesViewModel @Inject constructor(private val getMoviesUseCase: GetMoviesUseCase) : BaseViewModel() {
    var errorState: SingleLiveEvent<Throwable> =
        SingleLiveEvent()
    var moviesLiveData: MutableLiveData<MovieListResult> = MutableLiveData()
    fun getTopRatedMovies() {
        addDisposable(
            getMoviesUseCase.getTopRatedMovies()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                {
                    moviesLiveData.value = it
                },
                {
                    errorState.value = it
                })
        )

    }

}