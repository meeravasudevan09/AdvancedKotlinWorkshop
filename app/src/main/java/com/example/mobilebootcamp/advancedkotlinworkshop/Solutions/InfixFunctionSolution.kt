package com.example.mobilebootcamp.advancedkotlinworkshop.Solutions

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

    //    Verify that the assertion `result is 5` passes
    result isEqualTo 5

    //    Verify that the assertion `result is 7` fails
    result isEqualTo 7

    //    Verify that the assertion `result is Different to 5` fails
    result isDifferentFrom 5

}
