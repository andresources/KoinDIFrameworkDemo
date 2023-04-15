package com.koindidemo;

public class Theory {
    /*
       ***Koin is a smart Kotlin dependency injection library
       ***Koin provides easy and powerfull API to retrieve your dependencies anywhere in Android components,
          with just using by inject() or by viewModel()
       ***There are 3 steps(1. Define Modules, 2.Start Koin, 3.Inject in App Component)


       *********************   1. Define Modules  *************
       // Given some classes
          class MyRepository()

       // Inject via constructor
          class MyPresenter(val repository : MyRepository)

       // just declare it
       val myModule = module{
            singleOf(::MyPresenter)
            singleOf(::MyRepository)
       }
       *
       *
       *********************   2. Start Koin  *************
            class MyApplication : Application() {
              override fun onCreate() {
                super.onCreate()
                // start Koin!
                startKoin {
                  // declare used Android context
                  androidContext(this)
                  // declare modules
                  modules(myModule)
                }
              }
            }

       *******************   3. Inject in App Component  *************
        // Just inject your dependency
        val myPresenter : MyPresenter by inject()

    */
}