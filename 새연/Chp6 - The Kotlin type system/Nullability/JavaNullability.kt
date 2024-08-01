package `Chp6 - The Kotlin type system`.Nullability

import java.util.*

fun yell(person: Person) {
    println(person.name.uppercase() + "!!!")
}

fun yellSafe(person: Person) {
    println((person.name ?: "Anyone").uppercase() + "!!!")
}
fun main() {
//    yell(Person(null))
//    yellSafe(Person(null))
}