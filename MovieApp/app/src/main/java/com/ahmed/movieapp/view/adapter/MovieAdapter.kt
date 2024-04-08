package com.ahmed.movieapp.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ahmed.movieapp.R
import com.ahmed.movieapp.model.data.network.response.MovieEntity
import com.bumptech.glide.Glide

class MovieAdapter :
    ListAdapter<MovieEntity, MovieAdapter.ViewPagerViewHolder>(ViewPagerCallBack) {

    private lateinit var itemClickListener: ((Int) -> Unit)

    fun itemClickListener(listener: ((Int) -> Unit)) {
        itemClickListener = listener
    }

    inner class ViewPagerViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private lateinit var titleTextView: TextView
        private lateinit var ratingTextView: TextView
        private lateinit var imageImageView: ImageView

        fun onBind(data: MovieEntity) {

            titleTextView = itemView.findViewById(R.id.titleTextView)
            ratingTextView = itemView.findViewById(R.id.ratingTextView)
            imageImageView = itemView.findViewById(R.id.imageImageView)

            itemView.apply {
                titleTextView.text = data.originalTitle
                ratingTextView.text = "Rating: ${data.voteAverage}/10"
                Glide.with(context).load("https://image.tmdb.org/t/p/w500/${data.posterPath}")
                    .into(imageImageView)
                setOnClickListener {
                    data.apply {
                        itemClickListener.invoke(id)
                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        return ViewPagerViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_pager, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }

    object ViewPagerCallBack : DiffUtil.ItemCallback<MovieEntity>() {
        override fun areItemsTheSame(oldItem: MovieEntity, newItem: MovieEntity): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: MovieEntity, newItem: MovieEntity): Boolean {
            return oldItem == newItem
        }
    }
}