package `Chp6 - The Kotlin type system`.Nullability

fun verifyInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("Fill in required fields")
    }
}

fun  String?.isNullOrBlank(): Boolean =
    this == null || this.isBlank()

fun main() {
    verifyInput(" ")
    verifyInput(null)
}