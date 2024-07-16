data class Person(val name: String, val age: Int)

fun findOldest(people: List<Person>) {
    var max = 0
    var oldest: Person? = null

    for (person in people) {
        if (person.age > max) {
            max = person.age
            oldest = person
        }
    }

    println(oldest)
}

fun main() {
    val people = listOf(Person("saeyeon", 22), Person("cherry", 5))
    findOldest(people)

    people.maxBy ({ p: Person -> p.age })
    people.maxBy() { p: Person -> p.age }
    people.maxBy { p: Person -> p.age }
    people.maxBy { p -> p.age }
    people.maxBy { it.age }
    people.maxBy(Person::age)

    val getAge = { p: Person -> p.age }
    val getAgeRef = Person::age

    people.maxBy(getAge)

    val names = people.joinToString(separator = " ", transform = { p: Person -> p.name })
    println(names)

    people.joinToString(" ") { p: Person -> p.name }
}