package com.ahmed.movieapp.model.data.network.response

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MovieResponse(
    val page: Int,
    val results: List<MovieEntity>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)

data class MovieEntity(
    @SerializedName("original_title")
    val originalTitle: String,
    @SerializedName("poster_path")
    val posterPath: String,
    @SerializedName("vote_average")
    val voteAverage: Double,
    val id: Int,
) : Serializable