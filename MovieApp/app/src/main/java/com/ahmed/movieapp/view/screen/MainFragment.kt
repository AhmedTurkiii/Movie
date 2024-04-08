package com.ahmed.movieapp.view.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.viewpager2.widget.ViewPager2
import com.ahmed.movieapp.R
import com.ahmed.movieapp.model.data.network.response.MovieEntity
import com.ahmed.movieapp.view.adapter.MovieAdapter
import com.ahmed.movieapp.utils.*
import com.ahmed.movieapp.viewmodel.imp.HomeScreenViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {

    private val viewModel: HomeScreenViewModel by viewModels<HomeScreenViewModel>()
    private lateinit var homeViewPager: ViewPager2
    private lateinit var popularTextView: TextView
    private lateinit var progressBar: ProgressBar

    private val adapter by lazy { MovieAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.progressLiveData.observe(this, progressDataObserver)
        viewModel.errorMessageLiveData.observe(this, messageDataObserver)
        viewModel.movieListLiveData.observe(this, movieDataObserver)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.home_screen, container, false);
        homeViewPager = view.findViewById(R.id.homeViewPager)
        popularTextView = view.findViewById(R.id.popularTextView)
        progressBar = view.findViewById(R.id.progressBar)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.loadData()
        setUpPager()

    }

    private val movieDataObserver = Observer<List<MovieEntity>> {
        adapter.submitList(it)
    }

    private val progressDataObserver = Observer<Boolean> {
        checkProgress(it)
    }

    private val messageDataObserver = Observer<String> {
        showSnack(it)
    }

    private fun checkProgress(boolean: Boolean) {
        requireView().apply {
            if (boolean) {
                homeViewPager.invisible()
                popularTextView.invisible()
                progressBar.visible()
            } else {
                homeViewPager.visible()
                popularTextView.visible()
                progressBar.invisible()
            }
        }
    }

    private fun setUpPager() {
        homeViewPager.adapter = adapter
        homeViewPager.offscreenPageLimit = 1
        homeViewPager.setPageTransformer(CardTransformer(requireContext()))
        val itemDecoration = HorizontalMarginItemDecoration(
            requireContext(),
            R.dimen.viewpager_current_item_horizontal_margin
        )
        homeViewPager.addItemDecoration(itemDecoration)
        adapter.itemClickListener {
            Toast.makeText(context, "User click on the moview", Toast.LENGTH_SHORT).show()
//            val bundle = Bundle()
            // Ahmed Torki text
//            bundle.putInt("back", 0)
//            bundle.putInt("data", it)
//            findNavController().navigate(R.id.movieDetailScreen, bundle)
        }
    }
}