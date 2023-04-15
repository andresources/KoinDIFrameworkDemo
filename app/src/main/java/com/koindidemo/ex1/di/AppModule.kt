package com.koindidemo.data

import com.koindidemo.ex1.UserPresenter
import com.koindidemo.ex1.UserViewModel
import com.koindidemo.ex1.data.TestRes
import com.koindidemo.ex1.data.UserRepository
import com.koindidemo.ex1.data.UserRepositoryImpl
import org.koin.dsl.module

val appModule = module{
    single<UserRepository> { UserRepositoryImpl() }
    factory { UserPresenter(get()) }
    factory { UserViewModel(get(),get()) }
    single { TestRes() }
}