package com.ahmed.movieapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavGraph
import androidx.navigation.fragment.NavHostFragment
import com.ahmed.movieapp.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var host: NavHostFragment
    private lateinit var graph: NavGraph

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        host = supportFragmentManager.findFragmentById(R.id.navHost) as NavHostFragment
        graph = host.navController.navInflater.inflate(R.navigation.nav_graph)
        graph.setStartDestination(R.id.mainScreen)

    }

    override fun onResume() {
        graph.setStartDestination(R.id.mainScreen)
        host.navController.graph = graph
        super.onResume()
    }
}