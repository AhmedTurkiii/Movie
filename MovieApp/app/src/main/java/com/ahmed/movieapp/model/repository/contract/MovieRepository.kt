package com.ahmed.movieapp.model.repository.contract

import com.ahmed.movieapp.model.data.network.response.MovieEntity
import kotlinx.coroutines.flow.Flow

interface MovieRepository {
    fun getMovieList(): Flow<Result<List<MovieEntity>>>
}