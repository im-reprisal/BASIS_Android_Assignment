package com.example.basis.api

import com.example.basis.data.ResponseModel
import com.example.basis.extras.Constants.END_URL
import retrofit2.http.GET

interface ApiService {
    @GET(END_URL)
    suspend fun getAllData() : ResponseModel
}