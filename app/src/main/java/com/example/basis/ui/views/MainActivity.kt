package com.example.basis.ui.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.basis.R
import com.example.basis.data.Data
import com.example.basis.api.RetrofitHelper
import com.example.basis.ui.adapter.DataAdapter
import com.example.basis.ui.viewmodel.DataViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModel: DataViewModel
    var list = ArrayList<Data>()
    lateinit var mainAdapter : DataAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(DataViewModel::class.java)
        setRecyclerAdapter()
        mainViewModel.callAPi()

        mainViewModel.liveData.observe(this,{
            it.let {
                when (it) {
                    is RetrofitHelper.OnSuccess -> {
                        list = it.dataList as ArrayList<Data>
                        setRecyclerAdapter()
                    }

                    is RetrofitHelper.OnFailure -> {
                        Toast.makeText(this@MainActivity, it.error, Toast.LENGTH_SHORT).show()
                    }
                }
            }
        })
    }
    fun setRecyclerAdapter() {
        mainAdapter = DataAdapter(list)
        val linearLayoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.apply {
            adapter = mainAdapter
            layoutManager = linearLayoutManager
        }
    }
}