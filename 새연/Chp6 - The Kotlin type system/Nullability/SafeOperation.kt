package `Chp6 - The Kotlin type system`.Nullability

class Name(val firstName: String, val lastName: String) {
    override fun equals(other: Any?): Boolean {
        val otherName = other as? Name ?: return false

        return otherName.firstName == firstName && otherName.lastName == lastName
    }

    override fun hashCode(): Int = firstName.hashCode() * 37 + lastName.hashCode()
}

fun main() {
    val n1 = Name("Saeyeon", "Lim")
    val n2 = Name("Saeyeon", "Lim")

    println(n1 == n2) // false
    println(n1.equals(n2)) // true
}