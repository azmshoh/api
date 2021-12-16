package org.versusgame.api.retrofit.model

import com.google.gson.annotations.SerializedName

data class AnimalsApiModel(
    val id: Int,
    val title: String,
    val description: String,
    val img1: String?,
    val img2: String?,
    val img3: String?,
    val price: Int,
    val view: Int,
    val phone: Int,
    @SerializedName("user_id")
    val userId: Int,
    @SerializedName("category_id")
    val categoryId: Int,
    @SerializedName("city_id")
    val cityId: Int,
    val top: Int,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("updated_at")
    val updatedAt: String
)