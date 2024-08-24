package `Overloading arithmetic operators`.Arithmetic

data class Point (val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is Point) return false
        return other.x == x && other.y == y
    }
}

operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

fun main() {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)
    println(p1 * 1.5)

    println('a' * 3)

    println(0x0F and 0xF0)
    println(0x0F or 0xF0)
    println(0x0F shl 4)

    println(Point(10, 20) == Point(10, 20))
    println(Point(10, 20) != Point(5, 20))
    println(null == Point(10, 20))
}