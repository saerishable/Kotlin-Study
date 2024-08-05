package `Overloading arithmetic operators`

data class Rectangle(val upperLeft: Point, val lowerRight: Point)

operator fun Rectangle.contains(point: Point): Boolean {
    return point.x in upperLeft.x until lowerRight.x &&
            point.y in upperLeft.y until lowerRight.y
}

fun main() {
    val rectangle = Rectangle(Point(10, 20), Point(50, 50))
    println(Point(20, 30) in rectangle)
    println(Point(5, 5) in rectangle)
}