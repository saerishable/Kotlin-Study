package inlineFunction

data class Person(val name: String, val age: Int)


fun main() {
    val people = listOf(Person("saeyeon", 24), Person("cherry", 5))
    println(people.filter { it.age < 20 })

    val result = mutableListOf<Person>()
    for (person in people) {
        if (person.age < 20) {
            result.add(person)
        }
    }
    println(result)

    println(people.filter { it.age  > 20 }
        .map(Person::name))
}