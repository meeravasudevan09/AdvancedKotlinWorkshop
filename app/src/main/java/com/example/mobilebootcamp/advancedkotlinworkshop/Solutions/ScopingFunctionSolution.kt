package com.example.mobilebootcamp.advancedkotlinworkshop.Solutions

import com.example.mobilebootcamp.advancedkotlinworkshop.Exercises.Person

data class Person(var name: String, var age: Int, var job: String? = "XXX")

fun main() {
    val firstPerson = Person("Donna", 25, "Developer")
    val secondPerson = Person("Rowena", 40)
    val nullablePerson: Person? =
        Person("XXX", 0, "YYY")

    // Using `.let` add name, age, job of nullablePerson (if nullablePerson is not null)
    // print the object
    nullablePerson?.let {
        it.name = "Rose"
        it.age = 70
        it.job = "Ghostbuster"
        println(it)
    }

    // Using `.apply` increment firstperson age and change job to "superhero"
    // print the object
    firstPerson.apply {
        age += 1
        job = "Superhero"
        println(this)
    }

    // Using `run { }` print older person
    run {
        if (firstPerson.age >= secondPerson.age) println(firstPerson) else println(secondPerson)
    }

    // Using `.run` increment and print firstperson age using someMethod()
    firstPerson.run {
        age += 1
        someMethod(age)
    }

    // Using `.also` increment firstperson age and change job to "alchemist"
    // print object
    firstPerson.also {
        it.age += 1
        it.job = "Alchemist"
        println(it)
    }

    // Using `with` increment and print firstperson age age using someMethod()
    with(firstPerson) {
        age += 1
        someMethod(age)
    }

}

fun someMethod(age: Int) {
    println("Age is now $age")
}
