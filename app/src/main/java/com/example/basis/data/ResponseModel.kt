package com.example.basis.data


import com.google.gson.annotations.SerializedName

data class ResponseModel(
    @SerializedName("data")
    val `data`: List<Data>
)