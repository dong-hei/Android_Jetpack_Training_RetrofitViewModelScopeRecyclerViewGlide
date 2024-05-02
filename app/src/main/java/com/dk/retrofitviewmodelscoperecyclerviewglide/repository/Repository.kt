package com.dk.retrofitviewmodelscoperecyclerviewglide.repository

import com.dk.retrofitviewmodelscoperecyclerviewglide.api.MyApi
import com.dk.retrofitviewmodelscoperecyclerviewglide.api.RetrofitInstance

class Repository {

    private val client = RetrofitInstance.getInstance().create(MyApi::class.java)
    suspend fun getAllData() = client.getAllPlants()
}