fun main() {
    var people = listOf(Person("saeyeon", 23), Person("cherry", 5))

    people.map(Person::name).filter { it.startsWith("s") }

    people.asSequence()
        .map(Person::name)
        .filter { it.startsWith("a") }
        .toList()

    people.asSequence()
        .map(Person::name)
        .filter { it.length < 7 }
        .toList()

    people.asSequence()
        .filter { it.name.length < 7 }
        .map(Person::name)
        .toList()

    listOf(1, 2, 3, 4).asSequence()
        .map { println("map($it)"); it * it }
        .filter { println("filter($it"); it % 2 == 0}
        .toList()

    listOf(1, 2, 3, 4).asSequence()
        .map { it * it }.find { it > 3 }
}