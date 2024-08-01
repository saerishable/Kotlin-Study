package `Chp6 - The Kotlin type system`.Nullability

fun <T> printHashCode(t: T) {
    println(t?.hashCode())
}

fun <T: Any> printHashCodeUpperBound(t: T) {
    println(t.hashCode())
}

fun main() {
    println(printHashCode(null))
    println(printHashCodeUpperBound(522))
}