package com.vichuz.coder_swag.Services

import com.vichuz.coder_swag.Model.Category
import com.vichuz.coder_swag.Model.Product

object DataService {
    val categories= listOf(
        Category("Shirts","shirtimage"),
        Category("Hoodies","hoodieimage"),
        Category("Hats","hatimage"),
        Category("Digital","digitalgoodsimage") ,
        Category("Shirts","shirtimage"),
        Category("Hoodies","hoodieimage"),
        Category("Hats","hatimage"),
         Category("Digital","digitalgoodsimage")
    )
    val hats= listOf(
        Product("Devslopes Graphic Beanie","50rs","hat1"),
        Product("Devslopes Hat Black ","60rs","hat2"),
        Product("Devslopes Hat White","70rs","hat3"),
        Product("Devslopes Hat Snapack","40rs","hat4")


    )
    val hoodies= listOf(
        Product("Deveslopes Hoodie Grey","100rs","hoodie1"),
        Product("Deveslopes Hoodie Red","170rs","hoodie2"),
        Product("Deveslopes Grey Hoodie","108rs","hoodie3"),
        Product("Deveslopes Black Hoodie","250rs","hoodie4")
    )
    val shirts= listOf(
        Product("Deveslopes Shirt Black","190rs","shirt1"),
        Product("Deveslopes Badge Light Grey","270rs","shirt2"),
        Product("Deveslopes logo Shirt Red","308rs","shirt3"),
        Product("Deveslopes Hustle","210rs","shirt4"),
        Product("Kick Flip Studios","320rs","shirt5")

    )
    val digitalGoods= listOf<Product>()

    fun getProducts(category:String):List<Product>{
        return when (category){
            "SHIRTS"-> shirts
            "HOODIES"-> hoodies
            "HATS"-> hats
            else -> digitalGoods
        }
    }

}