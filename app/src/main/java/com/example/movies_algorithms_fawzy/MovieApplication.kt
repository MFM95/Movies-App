package com.example.movies_algorithms_fawzy

import android.app.Application
import com.example.movies_algorithms_fawzy.DI.MovieDetails.MovieDetailsComponent
import com.example.movies_algorithms_fawzy.DI.MovieDetails.MovieDetailsModule
import com.example.movies_algorithms_fawzy.DI.TopRatedMovies.TopRatedModule
import com.example.movies_algorithms_fawzy.DI.TopRatedMovies.TopRatedMoviesComponent
import com.example.movies_algorithms_fawzy.DI.application.AppModule
import com.example.movies_algorithms_fawzy.DI.application.DaggerMainComponent
import com.example.movies_algorithms_fawzy.DI.application.MainComponent
import com.example.movies_algorithms_fawzy.DI.network.NetworkModule

class MovieApplication : Application() {
    private lateinit var mainComponent: MainComponent
    private var topRatedComponent: TopRatedMoviesComponent? = null
    private var movieDetailsComponent: MovieDetailsComponent? = null

    override fun onCreate() {
        super.onCreate()
        initDependencies()

    }

    private fun initDependencies() {
        mainComponent = DaggerMainComponent.builder()
            .appModule(AppModule(applicationContext))
            .networkModule(NetworkModule(BuildConfig.BASE_URL, BuildConfig.THE_MOVIE_API_KEY))
            .build()
    }

    fun createTopRatedComponent(): TopRatedMoviesComponent {
        topRatedComponent = mainComponent.plus(TopRatedModule())
        return topRatedComponent!!
    }


    fun releaseTopRatedComponent() {
        topRatedComponent = null
    }

    fun createMovieDetailsComponent() : MovieDetailsComponent{
        movieDetailsComponent = mainComponent.plus(MovieDetailsModule())
        return movieDetailsComponent !!
    }

    fun releaseMovieDetailsComponent() {
        movieDetailsComponent = null
    }
}