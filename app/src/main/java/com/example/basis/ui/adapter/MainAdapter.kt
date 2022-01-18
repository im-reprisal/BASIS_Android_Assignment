package com.example.basis.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.basis.R
import com.example.basis.data.Data
import com.example.basis.ui.viewholder.MainViewHolder

class MainAdapter(private val dataList : List<Data>) : RecyclerView.Adapter<MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, pos: Int) {
        val data = dataList[pos]
        holder.setData(data)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}