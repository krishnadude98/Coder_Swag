package com.vichuz.coder_swag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.vichuz.coder_swag.Adapters.CategoryAdapter
import com.vichuz.coder_swag.Model.Category
import com.vichuz.coder_swag.R
import com.vichuz.coder_swag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter:CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter= CategoryAdapter(this,DataService.categories)
        categoryListView.adapter=adapter

    }
}
