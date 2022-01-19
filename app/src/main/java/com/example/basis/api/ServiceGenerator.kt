package com.example.basis.api

import com.example.basis.extras.Constants.BASE_URL
import retrofit2.Retrofit

object ServiceGenerator {
    fun getRetrofit() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(CustomConverterFactory())
        .build()
    fun getApiService() = getRetrofit().create(ApiService::class.java)
}