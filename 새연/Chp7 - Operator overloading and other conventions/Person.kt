package `Overloading arithmetic operators`

class Person (val firstName: String, val lastName: String) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::lastName, Person::firstName)
    }
}

fun main() {
    val p1 = Person("Saeyeon", "Lim")
    val p2 = Person("Cherry", "Lim")

    println(p1 < p2)
    println("abc" < "bac")
}