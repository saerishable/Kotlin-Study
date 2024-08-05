package `Overloading arithmetic operators`

import java.time.LocalDate

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
    object : Iterator<LocalDate> {
        var current = start

        override fun hasNext() = current <= endInclusive
        override fun next() = current.apply {
            current = plusDays(1)
        }
    }

fun main() {
    val year = LocalDate.ofYearDay(2024, 1)
    val daysOff = year.minusDays(1)..year
    for (dayOff in daysOff) {
        println(dayOff)
    }
}