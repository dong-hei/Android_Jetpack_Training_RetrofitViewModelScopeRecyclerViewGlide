package com.dk.retrofitviewmodelscoperecyclerviewglide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dk.retrofitviewmodelscoperecyclerviewglide.adapter.CustomAdapter
import com.dk.retrofitviewmodelscoperecyclerviewglide.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vm = ViewModelProvider(this).get(MainViewModel::class.java)
        vm.getAllData()

        val rv = findViewById<RecyclerView>(R.id.rv)
        vm.result.observe(this, Observer {
            val customAdapter = CustomAdapter(this, it)
            rv.adapter = customAdapter
            rv.layoutManager = LinearLayoutManager(this)
        })
    }
}