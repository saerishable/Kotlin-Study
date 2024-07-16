fun salute() = println("Salute")

fun sendEmail(person: Person, message: String) {}

val action = { person: Person, message: String -> sendEmail(person, message)}
val nextAction = ::sendEmail

val personAge = Person::age
fun main() {
    run (::salute)

    val person = Person("saeyeon", 23)
    println(personAge(person))

    val dmitryAge1 = { person.age }
    val dmitryAge2 = person::age
    println(dmitryAge2())
}