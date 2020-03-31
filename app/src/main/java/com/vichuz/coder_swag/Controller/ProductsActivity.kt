package com.vichuz.coder_swag.Controller

import android.content.res.Configuration
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.vichuz.coder_swag.Adapters.ProductsAdapter
import com.vichuz.coder_swag.R
import com.vichuz.coder_swag.Services.DataService
import com.vichuz.coder_swag.Utility.ExtraCategory
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {
    lateinit var adapter: ProductsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        val CategoryTipe= intent.getStringExtra(ExtraCategory)
        adapter= ProductsAdapter(this,DataService.getProducts(CategoryTipe))
        var spancount=2
        val orientation = resources.configuration.orientation
        if (spancount==Configuration.ORIENTATION_LANDSCAPE){
            spancount=3
        }
        val screensize= resources.configuration.screenWidthDp
        if (screensize>720 )
        {
            spancount=3
        }
        val layoutManager=GridLayoutManager(this,spancount)
        productListView.layoutManager=layoutManager
        productListView.adapter=adapter
    }
}
