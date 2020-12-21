package com.example.latihanpraktikum11.api

import com.example.latihanpraktikum11.model.Photo
import io.reactivex.Single
import retrofit2.http.GET

interface PhotosApi {
    @GET("photos")
    fun getPhotos(): Single<List<Photo>>
}