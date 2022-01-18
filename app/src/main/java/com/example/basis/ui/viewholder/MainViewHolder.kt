package com.example.basis.ui.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.basis.data.Data
import kotlinx.android.synthetic.main.item_layout.view.*

class MainViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    fun setData(data: Data) {
        view.apply {
           tvPageNo.text = data.id
            tvId.text = data.id
            tvTitle.text = data.text
        }
    }
}