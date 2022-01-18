package com.example.basis.api

import com.example.basis.CustomConverterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.google.gson.GsonBuilder
class ServiceGenerator {
    var gson = GsonBuilder()
        .setLenient()
        .create()

    fun getRetrofit() = Retrofit.Builder()
        .baseUrl("https://gist.githubusercontent.com/")
        .addConverterFactory(CustomConverterFactory())
        .build()
//     fun getRetrofit() =
//        Retrofit.Builder()
//            .baseUrl("https://gist.githubusercontent.com/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
    fun getApiService() = getRetrofit().create(ApiService::class.java)
}