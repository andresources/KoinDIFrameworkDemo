package com.koindidemo.ex1

import androidx.lifecycle.ViewModel
import com.koindidemo.ex1.data.TestRes
import com.koindidemo.ex1.data.UserRepository

class UserViewModel constructor(private val repository: UserRepository, private val testR : TestRes) : ViewModel(){
    fun sayHello(name: String) : String{
        return repository.findUser(name)?.let { "Hello ${it.name} " } ?: "User $name not found!"
    }

    fun wishMe() : String{
        return testR.wishMe()
    }
}