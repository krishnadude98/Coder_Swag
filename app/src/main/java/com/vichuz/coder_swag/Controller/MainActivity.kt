package com.vichuz.coder_swag.Controller

import android.content.Intent
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
import com.vichuz.coder_swag.Utility.ExtraCategory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: CategoryRecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryRecycleAdapter(this,DataService.categories){category ->
            val productIntent= Intent(this,ProductsActivity::class.java)
            productIntent.putExtra(ExtraCategory,category.title)
            startActivity(productIntent)



        }
        categoryListView.adapter = adapter

        val layoutManager=LinearLayoutManager(this)
        categoryListView.layoutManager= layoutManager
        categoryListView.setHasFixedSize(true)

    }
}
