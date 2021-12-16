package org.versusgame.api.helper

import org.versusgame.api.retrofit.ApiInterface
import org.versusgame.api.retrofit.model.AnimalsApiModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class NetworkHelper(private val apiClient: Retrofit) {

    fun getAnimals(
        onFailure: (message: String) -> Unit,
        onResponse: (List<AnimalsApiModel>) -> Unit
    ) {
        val call = apiClient.create(ApiInterface::class.java).getApiAnimal()
        call.enqueue(object : Callback<List<AnimalsApiModel>> {
            override fun onResponse(
                call: Call<List<AnimalsApiModel>>?,
                response: Response<List<AnimalsApiModel>>?
            ) {
                onResponse.invoke(response?.body()!!)
            }

            override fun onFailure(call: Call<List<AnimalsApiModel>>?, t: Throwable?) {
                onFailure.invoke(t?.message!!)
            }

        })
    }
}