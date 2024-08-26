package destructingDeclaration

import `Overloading arithmetic operators`.Arithmetic.Point

class PointComponent(val x: Int, val y: Int) {
    operator fun component1() = x
    operator fun component2() = y
}

fun main() {
    val point = Point(10, 20)
    val (x, y) = point
    println(x)
    println(y)
}