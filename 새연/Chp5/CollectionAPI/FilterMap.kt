import java.util.*

fun main() {
    val list = listOf(1, 2, 3)
    println(list.filter { it % 2 == 0 })

    var people = listOf(Person("saeyeon", 23), Person("cherry", 5))

    println(people .filter { it.age > 20 })
    println(people.map { it.name })
    println(people.map(Person::name))

    people.filter { it.age > 20 }.map(Person::name)
    people.filter { it.age == people.maxBy(Person::age).age }

    val maxAge = people.maxBy(Person::age).age
    people.filter { it.age == maxAge }

    val numbers = mapOf(0 to "zero", 5 to "five")
    println(numbers.mapValues { it.value.uppercase(Locale.getDefault()) })

}