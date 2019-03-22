package com.example.mobilebootcamp.advancedkotlinworkshop

/**
 * Infix Functions
 *
 * Functions marked with the infix keyword can also be called using the infix notation (omitting the dot and the
 * parentheses for the call). Infix functions must satisfy the following requirements:
 * - They must be member functions or extension functions;
 * - They must have a single parameter;
 * - The parameter must not accept variable number of arguments and must have no default value.
 *
 * easy to read
 */

fun main() {

    infix fun Int.add(x: Int): Int {
        return this + x
    }

    // calling the function using the infix notation
    println(1 add 2)

    // is the same as
    println(1.add(2))

}
