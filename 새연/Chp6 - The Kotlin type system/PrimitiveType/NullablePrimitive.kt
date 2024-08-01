import javax.print.attribute.standard.MediaSize.Other

data class Person(val name: String, val age: Int? = null) {
    fun isOlderThan(other: Person): Boolean? {
        if (age == null || other.age == null) {
            return null
        }

        return age > other.age
    }
}

fun main() {
    println(Person("saeyeon", 23).isOlderThan(Person("cherry", 5)))
    println(Person("saeyeon", 23).isOlderThan(Person("pochacco")))
}