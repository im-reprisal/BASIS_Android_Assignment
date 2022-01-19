package com.example.basis.ui.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.basis.R
import com.example.basis.data.Data
import com.example.basis.api.RetrofitHelper
import com.example.basis.databinding.ActivityMainBinding
import com.example.basis.ui.adapter.DataAdapter
import com.example.basis.ui.viewmodel.DataViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: DataViewModel
    var list = ArrayList<Data>()
    lateinit var mainAdapter : DataAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(DataViewModel::class.java)
        setRecyclerAdaptor()
        mainViewModel.callAPi()
        mainViewModel.liveData.observe(this,{
            it.let {
                when (it) {
                    is RetrofitHelper.OnSuccess -> {
                        list = it.dataList as ArrayList<Data>
                        setRecyclerAdaptor()
                    }
                    is RetrofitHelper.OnFailure -> {
                        Toast.makeText(this@MainActivity, it.error, Toast.LENGTH_SHORT).show()
                    }
                }
            }
        })
    }
    fun setRecyclerAdaptor() {
        mainAdapter = DataAdapter(this,list)
        val linearLayoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.recyclerView.apply {
            adapter = mainAdapter
            layoutManager = linearLayoutManager
        }
    }
}