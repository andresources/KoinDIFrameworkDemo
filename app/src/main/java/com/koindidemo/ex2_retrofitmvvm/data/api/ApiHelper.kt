package com.koindidemo.ex2_retrofitmvvm.data.api;

import com.koindidemo.ex2_retrofitmvvm.data.model.User
import retrofit2.Response

interface ApiHelper {
    suspend fun getUsers(): Response<List<User>>
}