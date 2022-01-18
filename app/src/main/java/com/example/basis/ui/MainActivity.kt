package com.example.basis.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.HorizontalScrollView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.basis.R
import com.example.basis.data.Data
import com.example.basis.ui.adapter.MainAdapter
import com.example.basis.ui.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModel: MainViewModel
    var list = ArrayList<Data>()
    lateinit var mainAdapter : MainAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        setRecyclerAdapter()
        mainViewModel.callAPi()

        mainViewModel.liveData.observe(this,{
            list.clear()
            list.addAll(it)
            mainAdapter.notifyDataSetChanged()
        })
    }
    fun setRecyclerAdapter() {
        mainAdapter = MainAdapter(list)
        val linearLayoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.apply {
            adapter = mainAdapter
            layoutManager = linearLayoutManager
        }
    }
}