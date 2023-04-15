package com.koindidemo.ex1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.koindidemo.R
import com.koindidemo.ex1.data.DefaultData
import com.koindidemo.ex1.data.UserRepository
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val userRepository : UserRepository by inject()
    private val userPresenter : UserPresenter by inject()
    private val userViewModel : UserViewModel by viewModel()
    private lateinit var tv : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userRepository.addUsers(DefaultData.DEFAULT_USERS)
        tv = findViewById(R.id.tv)
        val name = userPresenter.sayHello("koin1")
        val name1 = userViewModel.sayHello("koin")
        tv.text = "${name} \n ${name1} \n ${userViewModel.wishMe()}"

    }
}