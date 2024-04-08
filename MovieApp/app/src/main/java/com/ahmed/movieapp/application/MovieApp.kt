package com.ahmed.movieapp.application

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MovieApp : Application() {
    companion object {
        lateinit var instance: MovieApp
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}
