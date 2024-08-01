package `Chp6 - The Kotlin type system`.Nullability

fun strLen(s: String?)  = s?.length

fun strLenSafe(s: String?): Int =
    s?.length ?: 0

fun main() {
    val x: String? = null
    println(strLenSafe(x))
    println(strLenSafe("abc"))
}