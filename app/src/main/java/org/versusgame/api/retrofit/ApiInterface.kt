package org.versusgame.api.retrofit

import org.versusgame.api.retrofit.model.AnimalsApiModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("api/animal")
    fun getApiAnimal(): Call<List<AnimalsApiModel>>

}