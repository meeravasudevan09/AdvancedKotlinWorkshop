package com.example.mobilebootcamp.advancedkotlinworkshop

/** Companion Objects
 * Object declaration inside a class marked with the `companion` keyword
 *
 * Members of the companion object can be called by simply using the class
 * name as qualifier
 */

// Example 1
class Person {
    fun callMe() = println("I'm being called")

    companion object {
        fun callMeCompanion() = println("I'm being called using companion obj")
    }
}

// Example 2
class Car(val horsepowers: Int) {
    companion object {
        val cars = mutableListOf<Car>()

        fun makeCar(horsepowers: Int): Car {
            val car = Car(horsepowers)
            cars.add(car)
            return car
        }
    }
}

fun main() {
    // Accessing members normally without using companion object
    val p1 = Person()
    p1.callMe()

    // Using Companion Object
    Person.callMeCompanion()

    val car = Car.makeCar(150)
    println(Car.cars.size)
}
