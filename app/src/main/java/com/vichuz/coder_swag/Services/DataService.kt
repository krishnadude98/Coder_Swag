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
    val Hats= listOf(
        Product("Devslopes Graphic Beanie","50rs","hat01"),
        Product("Devslopes Hat Black ","60rs","hat02"),
        Product("Devslopes Hat White","70rs","hat03"),
        Product("Devslopes Hat Snapack","40rs","hat04")


    )
    val Hoodies= listOf(
        Product("Deveslopes Hoodie Grey","100rs","hoodie01"),
        Product("Deveslopes Hoodie Red","170rs","hoodie02"),
        Product("Deveslopes Grey Hoodie","108rs","hoodie03"),
        Product("Deveslopes Black Hoodie","250rs","hoodie04")
    )
    val Shirts= listOf(
        Product("Deveslopes Shirt Black","190rs","shirt01"),
        Product("Deveslopes Badge Light Grey","270rs","shirt02"),
        Product("Deveslopes logo Shirt Red","308rs","shirt03"),
        Product("Deveslopes Hustle","210rs","shirt04"),
        Product("Kick Flip Studios","320rs","shirt05")

    )

}