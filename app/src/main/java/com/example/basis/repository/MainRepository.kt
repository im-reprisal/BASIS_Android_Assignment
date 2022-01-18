package com.example.basis.repository

import com.example.basis.api.ServiceGenerator
import com.example.basis.data.Data


class MainRepository {
    suspend fun getResponseFromAPI(): List<Data> {
        return ServiceGenerator().getApiService().getAllData().data
    }
}