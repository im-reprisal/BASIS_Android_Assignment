package com.example.basis.api

import com.example.basis.data.Data
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface ApiService {
    @GET("{userName}/{userId}/{raw}/{id}/{brokerName}.json")
    fun data(
        @Path("userName") userName: String?,
        @Path("userId") userid: String?,
        @Path("raw") raw: String?,
        @Path("id") id: String?,
        @Path("brokerName") brokerName: String?
    ): Call<ArrayList<Data?>?>?
}