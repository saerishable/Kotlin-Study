package `Chp6 - The Kotlin type system`.Nullability

fun ignoreNull(s: String?) {
    val notNull: String = s!!
    println(notNull.length)
}

fun main() {
    ignoreNull(null)
}
