package flowControl

data class Person(val name:String, val age: Int)

val people = listOf(Person("saeyeon", 22), Person("cherry", 5))

fun lookForSaeyeon(people: List<Person>) {
    for (person in people) {
        if (person.name == "saeyeon") {
            println("found")
            return
        }
    }
    println("not found")
}

fun lookForSaeyeonForEach(people: List<Person>) {
    people.forEach {
        if (it.name == "saeyeon") {
            println("found")
            return
        }
    }
    println("not found")
}


fun main() {
    lookForSaeyeon(people)
}