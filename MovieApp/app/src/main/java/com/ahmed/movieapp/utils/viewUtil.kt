package com.ahmed.movieapp.utils

import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar

fun View.visible() {
    this.visibility = View.VISIBLE
}

fun View.invisible() {
    this.visibility = View.INVISIBLE
}

fun Fragment.showSnack(string: String) {
    Snackbar.make(requireView(), string, 1000).show()
}