package com.koindidemo.ex2_retrofitmvvm.data.api;

import com.koindidemo.ex2_retrofitmvvm.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): Response<List<User>>

}