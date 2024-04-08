package com.ahmed.movieapp.model.repository.imp

import com.ahmed.movieapp.model.data.network.api.MovieApi
import com.ahmed.movieapp.model.repository.contract.MovieRepository
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import kotlin.Exception

class MovieRepositoryImp @Inject constructor(
    private val api: MovieApi,
) : MovieRepository {
    override fun getMovieList() = flow {

        if (api.getPopularMovies().isSuccessful) {
            emit(Result.success(api.getPopularMovies().body()!!.results))
        } else {
            emit(Result.failure(Exception(api.getPopularMovies().errorBody()?.string().toString())))
        }
    }
}