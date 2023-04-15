package com.koindidemo.ex2_retrofitmvvm.data.api;

import com.koindidemo.ex2_retrofitmvvm.data.model.User
import retrofit2.Response

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {

    override suspend fun getUsers(): Response<List<User>> = apiService.getUsers()

}