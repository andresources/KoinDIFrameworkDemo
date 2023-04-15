package com.koindidemo.ex2_retrofitmvvm.data.module

import com.koindidemo.ex2_retrofitmvvm.data.repository.MainRepository
import org.koin.dsl.module

val repoModule = module {
    single {
        MainRepository(get())
    }
}