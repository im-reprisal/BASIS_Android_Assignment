package com.example.basis.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.basis.data.Data
import com.example.basis.databinding.ItemLayoutBinding

class DataAdapter(val context: Context,private val dataList : List<Data>) : RecyclerView.Adapter<DataViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val itemLayoutBinding = ItemLayoutBinding.inflate(LayoutInflater.from(context),parent,false)
        return DataViewHolder(itemLayoutBinding)
    }
    override fun onBindViewHolder(holder: DataViewHolder, pos: Int) {
        val data = dataList[pos]
        holder.itemLayoutBinding.tvPageNo.text = data.id
        holder.itemLayoutBinding.tvId.text = data.id
        holder.itemLayoutBinding.tvTitle.text = data.text
    }
    override fun getItemCount(): Int {
        return dataList.size
    }
}

class DataViewHolder(val itemLayoutBinding: ItemLayoutBinding) : RecyclerView.ViewHolder(itemLayoutBinding.root)