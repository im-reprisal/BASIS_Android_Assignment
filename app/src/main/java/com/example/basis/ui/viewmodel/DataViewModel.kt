package com.example.basis.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.basis.repository.DataRepository
import com.example.basis.api.RetrofitHelper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DataViewModel: ViewModel() {

    private val mainRepository = DataRepository()
    private val mutableLiveData = MutableLiveData<RetrofitHelper>()
    val liveData: LiveData<RetrofitHelper> = mutableLiveData
    fun callAPi() {
        CoroutineScope(Dispatchers.IO).launch {
            val response = mainRepository.getResponseFromAPI()
            if (response != null) {
                mutableLiveData.postValue(RetrofitHelper.OnSuccess(response))
            }
            else{
                mutableLiveData.postValue(RetrofitHelper.OnFailure("Error"))
            }
        }
    }
}