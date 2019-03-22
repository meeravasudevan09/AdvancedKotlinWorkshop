package com.example.mobilebootcamp.advancedkotlinworkshop

/**
 * Higher Order Function (HOF) is simply a lambdaFunction that either
 * - accepts another lambdaFunction as a parameter,
 * - returns a lambdaFunction as its return value, or
 * - both
 *
 * Lambda expressions or Anonymous functions -
 * are functions that are not declared, but passed immediately as an expression
 *
 * HOFs are highly useful in processing collections
 */

// HOF accepting a lambdaFunction as parameter
// parameter `lambdaFunction` takes a String and returns a String
fun hofWithFunctionAsParameter(lambdaFunction: (String) -> String) {
    val hello = lambdaFunction("Hello Bootcampers")
    println(hello)
}

// `operation` is a higher-order function that returns a function `square`
// :: is the notation that references a function by name in Kotlin
fun operation(): (Int) -> (Int) {
    return ::square
}

// `square` matches the function signature of `operation`
fun square(n: Int) = n * n

fun main() {

//    Example 1
    hofWithFunctionAsParameter { someString ->
        "$someString! Welcome to Day 2"
    }

//    Example 2
    val hofThatReturnsAFunction = operation() // Here hofThatReturnsAFunction becomes square which is returned by operation
    println(hofThatReturnsAFunction(2)) // The square function is actually executed.

//    Example 3 - using HOF for collection processing
    val names = listOf("donna", "jack", "rose", "nardole")

    names
        .filter { it.length < 6 }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
}
