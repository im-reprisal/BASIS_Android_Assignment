package com.example.basis.api

import com.example.basis.data.Data

sealed class RetrofitHelper {

    data class OnSuccess(val dataList: List<Data>) : RetrofitHelper()
    data class OnFailure(val error: String) : RetrofitHelper()

}