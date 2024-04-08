package com.ahmed.movieapp.di

import android.content.Context
import com.ahmed.movieapp.model.data.network.api.MovieApi
import com.chuckerteam.chucker.api.ChuckerCollector
import com.chuckerteam.chucker.api.ChuckerInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    private val baseUrl = "https://api.themoviedb.org/3/"

    @[Provides Singleton]
    fun getOkHTTPClient(@ApplicationContext context: Context): OkHttpClient =
        OkHttpClient.Builder().build()

    @[Provides Singleton Named("MovieApi")]
    fun getMovieRetrofit(client: OkHttpClient): Retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Provides
    fun getMovieApi(@Named("MovieApi") retrofit: Retrofit): MovieApi =
        retrofit.create(MovieApi::class.java)
}