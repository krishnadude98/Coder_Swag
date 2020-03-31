package com.vichuz.coder_swag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vichuz.coder_swag.R
import com.vichuz.coder_swag.Utility.ExtraCategory

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        val CategoryTipe= intent.getStringExtra(ExtraCategory)
        println(CategoryTipe)
    }
}
