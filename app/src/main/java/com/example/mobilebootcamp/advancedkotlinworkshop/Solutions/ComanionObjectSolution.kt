package com.example.mobilebootcamp.advancedkotlinworkshop.Solutions

/**
 * Exercise: Call the `shareApp` method and print the `DATABASE_NAME` in main()
 */

class SocialMediaSharingUtils {

    //    Access this method from various Activities & Fragments
    companion object {
        fun shareApp() {
            println("Share this awesome app")
        }
    }
}

class ConstantsUtils {
    companion object {
        //        val DATABASE_NAME = "My database" // only accessible in this class
        const val DATABASE_NAME = "My database"
    }
}

fun main() {

    // Call the shareApp method
    SocialMediaSharingUtils.shareApp()

    // Call the constant variable
    println(ConstantsUtils.DATABASE_NAME)
}
