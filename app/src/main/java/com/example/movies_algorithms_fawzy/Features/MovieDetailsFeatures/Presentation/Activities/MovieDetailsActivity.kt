package com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Presentation.Activities

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Toast
import com.example.movies_algorithms_fawzy.BuildConfig
import com.example.movies_algorithms_fawzy.Common.imagehelper.ImageLoader
import com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Domain.Models.MovieDetails
import com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Presentation.ViewModels.MovieDetailsVMFactory
import com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Presentation.ViewModels.MovieDetailsViewModel
import com.example.movies_algorithms_fawzy.MovieApplication
import com.example.movies_algorithms_fawzy.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_movie_details.*
import javax.inject.Inject

class MovieDetailsActivity : AppCompatActivity() {

    @Inject
    lateinit var factory: MovieDetailsVMFactory

    @Inject
    lateinit var imageLoader: ImageLoader

    val movieDetailsViewModel by lazy {
        ViewModelProviders.of(this, factory).get(MovieDetailsViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)
        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        (application as MovieApplication).createMovieDetailsComponent().inject(this)
        val id: Int = intent.extras.getInt("movieId")
        movieDetailsViewModel.movieDetailsLiveData.observe(this, Observer {
            displayMovieDetails(it)
        })

        movieDetailsViewModel.errorState.observe(this, Observer {
            showError(it)
        })
        movieDetailsViewModel.getMovieDetails(id)
    }

    private fun displayMovieDetails(it: MovieDetails?) {
        it?.let { moviesDetails ->
            setTitle(moviesDetails.title)
            details_title.text = ""
            details_original_language.text = moviesDetails.original_language
            details_release_date.text = moviesDetails.release_date
            details_vote_average.text = moviesDetails.voteAverage.toString()
            details_vote_count.text = moviesDetails.voteCount.toString()
            moviesDetails.poster_path?.let { url -> imageLoader.load("${BuildConfig.IMG_BASE_URL}$url", details_poster_image) }




        }
    }

    private fun showError(it: Throwable?) {
        it?.let { error ->
            Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
        }
    }


    override fun onDestroy() {
        super.onDestroy()
         (application as MovieApplication).releaseMovieDetailsComponent()
    }
}
