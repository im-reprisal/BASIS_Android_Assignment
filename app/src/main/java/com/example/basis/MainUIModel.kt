package com.example.basis

import com.example.basis.data.ResponseModel

sealed class MainUIModel {

    data class OnSuccess(val responseModel: ResponseModel) : MainUIModel()

    data class onFailure(val error: String) : MainUIModel()
}