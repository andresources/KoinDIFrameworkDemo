package com.koindidemo.ex2_retrofitmvvm.data.repository

import com.koindidemo.ex2_retrofitmvvm.data.api.ApiHelper

class MainRepository (private val apiHelper: ApiHelper) {

    suspend fun getUsers() =  apiHelper.getUsers()

}