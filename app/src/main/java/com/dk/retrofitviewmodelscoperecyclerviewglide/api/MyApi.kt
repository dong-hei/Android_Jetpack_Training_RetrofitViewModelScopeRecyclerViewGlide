package com.dk.retrofitviewmodelscoperecyclerviewglide.api

import android.media.Image.Plane
import com.dk.retrofitviewmodelscoperecyclerviewglide.model.Plant
import retrofit2.http.GET

interface MyApi {

    @GET("googlecodelabs/kotlin-coroutines/master/advanced-coroutines-codelab/sunflower/src/main/assets/plants.json")
    suspend fun getAllPlants() : List<Plant>
}