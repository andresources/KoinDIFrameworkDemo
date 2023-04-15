package com.koindidemo.ex1

import com.koindidemo.ex1.data.UserRepository

class UserPresenter constructor(private val repository: UserRepository) {
    fun sayHello(name: String) : String{
        return repository.findUser(name)?.let { "Hello ${it.name} " } ?: "User $name not found!"
    }
}