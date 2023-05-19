package com.rakamin.listcycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rakamin.listcycleview.Model.DataObject

class ListAdapter(private val data : List<DataObject>) : RecyclerView.Adapter<ListHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ListHolder(itemView)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ListHolder, position: Int) {
        holder.bind(data[position])
    }
}
