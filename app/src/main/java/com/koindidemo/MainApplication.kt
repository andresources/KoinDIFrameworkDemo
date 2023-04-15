package com.koindidemo

import android.app.Application
import com.koindidemo.data.appModule1
import com.koindidemo.ex2_retrofitmvvm.data.module.appModule
import com.koindidemo.ex2_retrofitmvvm.data.module.repoModule
import com.koindidemo.ex2_retrofitmvvm.data.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            androidLogger()
            modules(listOf(appModule1,appModule, repoModule, viewModelModule))
        }
    }
}