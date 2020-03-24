package com.vichuz.coder_swag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.vichuz.coder_swag.Model.Category
import com.vichuz.coder_swag.R
import com.vichuz.coder_swag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter:ArrayAdapter<Category>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,DataService.categories)
        categoryListView.adapter=adapter

    }
}
