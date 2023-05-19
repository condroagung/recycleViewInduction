package com.rakamin.listcycleview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rakamin.listcycleview.Model.DataObject

class ListHolder (view : View) : RecyclerView.ViewHolder(view) {
    private val textName: TextView = view.findViewById(R.id.textName)
    private val textGenre : TextView = view.findViewById(R.id.textGenre)
    private val textYear : TextView = view.findViewById(R.id.textYear)
    private val imageLink : ImageView = view.findViewById(R.id.imageView)

    fun bind(item: DataObject) {
        textName.text = item.name
        textGenre.text = item.genre
        textYear.text = item.year
        Glide.with(itemView).load(item.picture).into(imageLink)
        println("${item.picture}")
    }
}
