package com.example.mobilebootcamp.advancedkotlinworkshop.Exercises

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

    // TODO 1.1 Call the shareApp method


    // TODO 1.2 Print the constant variable DATABASE_NAME

}
