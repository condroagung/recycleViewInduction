package com.rakamin.listcycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rakamin.listcycleview.Model.DataObject
import com.rakamin.listcycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ListAdapter
    private lateinit var binding: ActivityMainBinding
    private lateinit var listCustomObject : ListVM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listCustomObject = ViewModelProvider(this)[ListVM::class.java]
        
        recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)

        listCustomObject.cestomObject.observe(this){ cestomObject ->
            adapter = ListAdapter(cestomObject)
            recyclerView.adapter = adapter
        }

        binding.fabButton.setOnClickListener {
            listCustomObject.addAnimeObjects("Unknown","Unknown","1900","")
            adapter.notifyItemInserted(listCustomObject.cestomObject.value!!.size - 1)
            Toast.makeText(this,"Add Data Successfull",Toast.LENGTH_SHORT).show()
        }
    }
}