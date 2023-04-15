package com.koindidemo.ex2_retrofitmvvm.data.module

import com.koindidemo.ex2_retrofitmvvm.ui.main.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel

import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        MainViewModel(get(),get())
    }
}