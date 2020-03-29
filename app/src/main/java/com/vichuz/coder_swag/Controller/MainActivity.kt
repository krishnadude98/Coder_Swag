package com.vichuz.coder_swag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.vichuz.coder_swag.Adapters.CategoryAdapter
import com.vichuz.coder_swag.Adapters.CategoryRecycleAdapter
import com.vichuz.coder_swag.Model.Category
import com.vichuz.coder_swag.R
import com.vichuz.coder_swag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: CategoryRecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryRecycleAdapter(this,DataService.categories)
        categoryListView.adapter = adapter

        val layoutManager=LinearLayoutManager(this)
        categoryListView.layoutManager= layoutManager
        categoryListView.setHasFixedSize(true)

    }
}
