package com.example.mobilebootcamp.advancedkotlinworkshop

import com.example.mobilebootcamp.advancedkotlinworkshop.data.Button
import com.example.mobilebootcamp.advancedkotlinworkshop.data.PoetryGenerator
import java.util.*

/**
 * Scope functions - allow changing the scope/range of a variable
 * Kotlin scoping functions - `apply`, `run`, `with`, `let`, `also`
 *
 * they return a value, either
 * - The object itself or
 * - the last value of the block
 */

fun main(args: Array<String>) {

    val buttons = arrayOf(
        Button("red", "large"),
        Button("yellow", "medium"),
        Button("green", "large")
    )

    println(Arrays.toString(buttons))

    /**
     * Change colour & size of a button
     */

    val buttonIWantToChange = buttons[0]
    buttonIWantToChange.colour = "BLACK"
    buttonIWantToChange.size = "small"

    /** `apply`
     *
     * object referenced as `this`
     * returns the object
     * used for object initialization
     */

    buttons[0].apply {
        colour = "BLACK"
        size = "small"
        println(this)
    }

//    Create and configure
    val newButton = Button().apply {
        colour = "cyan"
    }

    /** `let`
     *
     * object referenced as `it`
     * returns the last statement
     * useful to work with nullable types
     */
    buttons[0].let {
        it.colour = "BLUE"
        it.size = "XL"
        println(it)
    }

    val optionalNumber: Int? = null
    optionalNumber?.let { println(it * 10) }

    /** `with`
     *
     * object referenced as `this`
     * returns the last statement
     */

    val w = Button()
    with(w) {
        colour = "cyan"
        size = "small"
        println(this)
    }

    /** `run`
     *
     * object referenced as `this`
     * returns the last statement
     */

    val line = PoetryGenerator().run {
        style = "Emily Dickinson"
        style += "Lucille Clifton"
        generate()
    }

    /** `also`
     *
     * object referenced as `this`
     * returns the object
     */

    val anotherLine = PoetryGenerator().run {
        style = "Emily Dickinson"
        style += "Lucille Clifton"
        generate()
    }.also { println("Line generated") }

}
