package com.koindidemo.ex2_retrofitmvvm.ui.main.view;

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.koindidemo.R
import com.koindidemo.ex2_retrofitmvvm.data.model.User
import com.koindidemo.ex2_retrofitmvvm.ui.main.adapter.MainAdapter
import com.koindidemo.ex2_retrofitmvvm.ui.main.viewmodel.MainViewModel
import com.koindidemo.ex2_retrofitmvvm.utils.Status


import org.koin.androidx.viewmodel.ext.android.viewModel


class MainActivity : AppCompatActivity() {

    private val mainViewModel : MainViewModel by viewModel()
    private lateinit var adapter: MainAdapter
    private lateinit var recyclerView : RecyclerView
    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex2_main)
        setupUI()
        setupObserver()

    }

    private fun setupUI() {
        recyclerView = findViewById(R.id.recyclerView)
        progressBar= findViewById(R.id.progressBar)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = MainAdapter(arrayListOf())
        recyclerView.addItemDecoration(
            DividerItemDecoration(
                recyclerView.context,
                (recyclerView.layoutManager as LinearLayoutManager).orientation
            )
        )
        recyclerView.adapter = adapter
    }

    private fun setupObserver() {
        mainViewModel.users.observe(this, Observer {
            when (it.status) {
                Status.SUCCESS -> {
                    progressBar.visibility = View.GONE
                    it.data?.let { users -> renderList(users) }
                    recyclerView.visibility = View.VISIBLE
                }
                Status.LOADING -> {
                    progressBar.visibility = View.VISIBLE
                    recyclerView.visibility = View.GONE
                }
                Status.ERROR -> {
                    //Handle Error
                    progressBar.visibility = View.GONE
                    Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                }
            }
        })
    }

    private fun renderList(users: List<User>) {
        adapter.addData(users)
        adapter.notifyDataSetChanged()
    }
}
