package com.example.mobilebootcamp.advancedkotlinworkshop.Exercises

import org.junit.Assert

class Assertion<T>(private val target: T) {
    infix fun isEqualTo(other: T) {
        Assert.assertEquals(other, target)
    }

    infix fun isDifferentFrom(other: T) {
        Assert.assertNotEquals(other, target)
    }
}

fun main() {
    val result = Assertion(5)

    //    TODO 4.1 Verify that the assertion `result is 5` passes


    //    TODO 4.2 Verify that the assertion `result is 7` fails


    //    TODO 4.1 Verify that the assertion `result is Different to 5` fails


}
