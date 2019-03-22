package com.example.mobilebootcamp.advancedkotlinworkshop.Exercises

data class Listing(val id : String, val agency: String, val price: Int)

fun main() {
    val listing1 = Listing("1", "raywhite", 10000)
    val listing2 = Listing("2", "buxton", 20000)
    val listing3 = Listing("3", "buxton", 30000)
    val listing4 = Listing("4", "raywhite", 40000)
    val listings = listOf(listing1, listing2, listing3, listing4)

    // TODO 5.1 Use filter to remove listings with price less than 20K


    // TODO 5.2 Use map to return a list of listing IDs


    // TODO 5.3 For listings with price >= 20K, Print each listing agency in UpperCase by order of descending listing price


}
