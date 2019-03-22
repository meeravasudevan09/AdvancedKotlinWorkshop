package com.example.mobilebootcamp.advancedkotlinworkshop.Exercises

import com.example.mobilebootcamp.advancedkotlinworkshop.Solutions.Person

data class Person(var name: String, var age: Int, var job: String? = "XXX")

fun main() {
    val firstPerson = Person("Donna", 25, "Developer")
    val secondPerson = Person("Rowena", 40)
    val nullablePerson: Person? = Person("XXX", 0, "YYY")

    // TODO 3.1. Using `.let` add name, age, job of nullablePerson (if nullablePerson is not null), print the object


    // TODO 3.2. Using `.apply` increment firstperson age and change job to "superhero", print the object


    // TODO 3.3. Using `run { }` print older person


    // TODO 3.4. Using `.run` increment and print firstperson age using someMethod()


    // TODO 3.5. Using `.also` increment firstperson age and change job to "alchemist",  print object


    // TODO 3.6. Using `with` increment and print firstperson age using someMethod()


}

fun someMethod(age: Int) {
    println("Age is now $age")
}
