
fun main() {
    val canBeInSchool = { p: Person -> p.age >= 6 }
    val people = listOf(Person("saeyeon", 23), Person("cherry", 5))

    println(people.all(canBeInSchool))
    println(people.any(canBeInSchool))

    println(people.count(canBeInSchool))
    println(people.filter(canBeInSchool).size)

    println(people.find(canBeInSchool))
    println(people.firstOrNull(canBeInSchool))

    println(people.groupBy { it.age })
    println(people.groupBy(personAge))

    val list = listOf("a", "ab", "b")
    println(list.groupBy(String::first))
}