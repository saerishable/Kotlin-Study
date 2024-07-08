package `Chp2 - Kotlin Basic`.ClassAndProperty

class Person (
    val name: String,
    val isMarried: Boolean
)

fun main() {
    val person = Person("Saeyeon", false)
    println(person.name)
}