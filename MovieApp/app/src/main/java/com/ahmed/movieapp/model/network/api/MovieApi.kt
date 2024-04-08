package com.ahmed.movieapp.model.data.network.api

import com.ahmed.movieapp.model.data.network.response.*
import com.ahmed.movieapp.model.data.network.response.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {
    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key") api_key: String = "59a02a732ba859a065a5860b822ffbe4",
    ): Response<MovieResponse>


}