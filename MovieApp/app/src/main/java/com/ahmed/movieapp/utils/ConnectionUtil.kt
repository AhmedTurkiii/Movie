package com.ahmed.movieapp.utils

import android.annotation.SuppressLint
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import com.ahmed.movieapp.application.MovieApp

/**
 * Utility class for checking network connectivity
 */
object ConnectionUtil {
    
    /**
     * Checks if the device has an active internet connection
     * @return true if connected to internet, false otherwise
     */
    fun hasConnection(): Boolean = MovieApp.instance.isAvailableNetwork()
}

@SuppressLint("MissingPermission")
private fun Context.isAvailableNetwork(): Boolean {
    val connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        val networkCapabilities = connectivityManager.activeNetwork ?: return false
        val activeNetwork = connectivityManager.getNetworkCapabilities(networkCapabilities) ?: return false
        
        activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) ||
        activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) ||
        activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET)
    } else {
        @Suppress("DEPRECATION")
        connectivityManager.activeNetworkInfo?.let { networkInfo ->
            when (networkInfo.type) {
                ConnectivityManager.TYPE_WIFI,
                ConnectivityManager.TYPE_MOBILE,
                ConnectivityManager.TYPE_ETHERNET -> true
                else -> false
            }
        } ?: false
    }
}