package com.ahmed.movieapp.viewmodel.imp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ahmed.movieapp.model.data.network.response.MovieEntity
import com.ahmed.movieapp.model.repository.imp.MovieRepositoryImp
import com.ahmed.movieapp.utils.hasConnection
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(private val repo: MovieRepositoryImp) : ViewModel() {
    var errorMessageLiveData: MutableLiveData<String> = MutableLiveData()
    var movieListLiveData: MutableLiveData<List<MovieEntity>> = MutableLiveData()
    var progressLiveData: MutableLiveData<Boolean> = MutableLiveData()

    fun loadData() {
        progressLiveData.value = true
        if (hasConnection()) {
            repo.getMovieList().onEach {
                it.onFailure {
                    progressLiveData.value = false
                    errorMessageLiveData.value = it.message.toString()
                }

                it.onSuccess {
                    progressLiveData.value = false
                    movieListLiveData.value = it
                }
            }.launchIn(viewModelScope)

        } else {
            // TODO: Display error message and ask user to enabled wifi or mobile date
        }
    }
}