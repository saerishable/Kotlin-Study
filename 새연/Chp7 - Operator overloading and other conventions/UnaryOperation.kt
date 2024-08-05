package `Overloading arithmetic operators`

import java.math.BigDecimal

operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE

fun main() {
    val p = Point(10, 20)
    println(-p)

    var bd = BigDecimal.ZERO
    println(bd++)
    println(++bd)
}