package com.example.mobilebootcamp.advancedkotlinworkshop

import kotlin.system.measureNanoTime

/**
 * Inline Functions
 *
 * Adding the `inline` annotation means that function as well as function parameters will be
 * expanded at call site thereby reducing call overhead
 *
 * To see how inline works, run the Kotlin Bytecode and press `Decompile`
 * Tools -> Kotlin -> Show Kotlin Bytecode
 */
fun higherOrderFunction(block: () -> Unit) {
    println("I'm the No Inline higher order function")
    block()
}

inline fun inlineHigherOrderFunction(block: () -> Unit) {
    println("I'm the Inline higher order function")
    block()
}

fun main() {
    val noInlineCallTime = measureNanoTime {
        higherOrderFunction {}
    }
    val inlineCallTime = measureNanoTime {
        inlineHigherOrderFunction {}
    }

    println("It took $noInlineCallTime ns to process non inlined function")

    println("It took $inlineCallTime ns to process Inline function")
}
