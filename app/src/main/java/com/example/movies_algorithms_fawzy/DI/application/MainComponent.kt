package com.example.movies_algorithms_fawzy.DI.application


import com.example.movies_algorithms_fawzy.DI.MovieDetails.MovieDetailsComponent
import com.example.movies_algorithms_fawzy.DI.MovieDetails.MovieDetailsModule
import com.example.movies_algorithms_fawzy.DI.TopRatedMovies.TopRatedModule
import com.example.movies_algorithms_fawzy.DI.TopRatedMovies.TopRatedMoviesComponent
import com.example.movies_algorithms_fawzy.DI.network.NetworkModule
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules = [
    (AppModule::class),
    (NetworkModule::class)
    ,(AndroidSupportInjectionModule::class)

    /*
    ,(MovieListFragmentModule::class)
,(ViewModelModule::class::class)
*/

])

interface MainComponent {
    fun plus(topRatedMoviesModule: TopRatedModule): TopRatedMoviesComponent
    fun plus(movieDetailsModule: MovieDetailsModule) : MovieDetailsComponent
}
