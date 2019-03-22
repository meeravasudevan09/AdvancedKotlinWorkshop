package com.example.mobilebootcamp.advancedkotlinworkshop

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/** Companion Objects
 *
 * 1. How to access a method from various activities & fragments?
 * 2. How to use constants throughout your app?
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
