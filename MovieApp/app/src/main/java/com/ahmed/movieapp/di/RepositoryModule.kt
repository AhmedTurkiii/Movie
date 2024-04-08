package com.ahmed.movieapp.di

import com.ahmed.movieapp.model.repository.*
import com.ahmed.movieapp.model.repository.contract.MovieRepository
import com.ahmed.movieapp.model.repository.imp.MovieRepositoryImp
import com.ahmed.movieapp.model.repository.imp.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {
    @Binds
    fun getMovieRepository(impl: MovieRepositoryImp): MovieRepository
}