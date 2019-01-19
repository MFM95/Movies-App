package com.example.movies_algorithms_fawzy.Features.MoviesFeature.Presentation.Activities

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import com.example.movies_algorithms_fawzy.Common.imagehelper.ImageLoader
import com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Presentation.Activities.MovieDetailsActivity
import com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.DataClasses.MovieListResult
import com.example.movies_algorithms_fawzy.Features.MoviesFeature.Presentation.Adapters.TopRatedMoviesAdapter
import com.example.movies_algorithms_fawzy.Features.MoviesFeature.Presentation.ViewModels.TopRatedMoviesVMFactory
import com.example.movies_algorithms_fawzy.Features.MoviesFeature.Presentation.ViewModels.TopRatedMoviesViewModel
import com.example.movies_algorithms_fawzy.MovieApplication
import com.example.movies_algorithms_fawzy.R
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class TopRatedMoviesActivity : AppCompatActivity() {

    @Inject
    lateinit var factory: TopRatedMoviesVMFactory
    @Inject
    lateinit var imageLoader: ImageLoader
    private lateinit var recyclerView: RecyclerView
    private lateinit var topRatedMoviesAdapter: TopRatedMoviesAdapter

    val moviesViewModel by lazy {
        ViewModelProviders.of(this, factory).get(TopRatedMoviesViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))
        (application as MovieApplication).createTopRatedComponent().inject(this)
        moviesViewModel.moviesLiveData.observe(this, Observer {
            displayMovies(it)
        })
        moviesViewModel.errorState.observe(this, Observer {
            showError(it)
        })
        moviesViewModel.getTopRatedMovies()
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        topRatedMoviesAdapter = TopRatedMoviesAdapter(imageLoader, {movie, view ->
           val intent = Intent(this, MovieDetailsActivity::class.java)
            intent.putExtra("movieId", movie.id)
            startActivity(intent)
        })
        recyclerView = movies_recyclerView
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = topRatedMoviesAdapter
    }
    private fun displayMovies(it: MovieListResult?) {
        // Check if it is not null, If it is not null execute the let block
        it?.let { moviesList ->
            topRatedMoviesAdapter.addMovies(it.movies)
        }
    }

    private fun showError(it: Throwable?) {
        it?.let { error ->
             Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        (application as MovieApplication).releaseTopRatedComponent()
    }
}
