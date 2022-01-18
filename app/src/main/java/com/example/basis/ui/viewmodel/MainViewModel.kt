package com.example.basis.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.basis.data.Data
import com.example.basis.repository.MainRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    private val mainRepository = MainRepository()
    private val mutablelivedata = MutableLiveData<List<Data>>()
    val liveData: LiveData<List<Data>> = mutablelivedata
    fun callAPi() {
        CoroutineScope(Dispatchers.IO).launch {
            val response = mainRepository.getResponseFromAPI()
            mutablelivedata.postValue(response)
        }
    }
}