package `Chp6 - The Kotlin type system`.Nullability

fun sendEmail(email: String) {
    println("Send email to $email")
}

fun main() {
    val email: String? = "dev.saeyeon@gmail.com"
    email?.let { email -> sendEmail(email) }
    email?.let { sendEmail(it) }

    val person: Person? = getTheBestPerson()
    if (person != null) sendEmail(person.email)

    getTheBestPerson()?.let { sendEmail(it.email) }
}

fun getTheBestPerson(): Person? = null
