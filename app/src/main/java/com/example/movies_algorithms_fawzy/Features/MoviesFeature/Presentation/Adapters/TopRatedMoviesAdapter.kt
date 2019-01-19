package com.example.movies_algorithms_fawzy.Features.MoviesFeature.Presentation.Adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.movies_algorithms_fawzy.BuildConfig
import com.example.movies_algorithms_fawzy.Common.imagehelper.ImageLoader
import com.example.movies_algorithms_fawzy.Features.MoviesFeature.Domain.Models.MovieData
import com.example.movies_algorithms_fawzy.R
import kotlinx.android.synthetic.main.movie_row.view.*

class TopRatedMoviesAdapter constructor(private val imageLoader: ImageLoader,
                                        private val onMovieSelected: (MovieData, View) -> Unit) :
    RecyclerView.Adapter<TopRatedMoviesAdapter.MovieCellViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieCellViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.movie_row,
            parent,
            false)
        return MovieCellViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieCellViewHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie, imageLoader, onMovieSelected)
    }

    private val movies: MutableList<MovieData> = mutableListOf()

    override fun getItemCount(): Int {
        return movies.size
    }


    fun addMovies(movies: List<MovieData>) {
        this.movies.addAll(movies)
        notifyDataSetChanged()
    }

    class MovieCellViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(movie: MovieData, imageLoader: ImageLoader, listener: (MovieData, View) -> Unit) = with(itemView) {
            title.text = movie.title
            movie.posterPath?.let { imageLoader.load("${BuildConfig.IMG_BASE_URL}$it", poster_image) }
            setOnClickListener { listener(movie, itemView) }
        }

    }
}