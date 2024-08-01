package `Chp6 - The Kotlin type system`.Nullability

fun printAllCaps(s: String?) {
    val allCaps: String? = s?.uppercase()
    println(allCaps)
}

fun main() {
    printAllCaps("abc")
    printAllCaps(null)
}