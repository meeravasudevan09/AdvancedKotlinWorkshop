package com.example.mobilebootcamp.advancedkotlinworkshop

/**
 * Sealed class allows you to represent constrained hierarchies in which an object can
 * only be of one of the given types.
 *
 * basically an enum on steroids
 *
 * To declare a class as sealed, we insert the sealed modifier before the class modifier
 * in the class declaration header
 */

sealed class Shape

object Circle : Shape()
object Triangle : Shape()
object Rectangle : Shape()

//  `when` allows to apply different actions based on the type of class, making the statement `else` unnecessary
fun whatIsIt(shape: Shape) = when (shape) {
    is Circle -> println("A circle")
    is Triangle -> println("A triangle")
    is Rectangle -> println("A rectangle")
}

fun main() {
    val shape: Shape = Circle

    whatIsIt(shape)
}
