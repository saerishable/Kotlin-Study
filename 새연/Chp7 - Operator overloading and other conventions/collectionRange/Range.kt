package `Overloading arithmetic operators`.CollectionRange

import java.time.LocalDate

operator fun <T: Comparable<T>> T.rangeTo(that: T): ClosedRange<T> {
    TODO()
}

fun main() {
    val now = LocalDate.now()
    val vacation = now..now.plusDays(30)
    println(now.plusWeeks(1) in vacation)

    val n = 9
    println(0..(n + 1))

    (0..n).forEach { println(it) }
}