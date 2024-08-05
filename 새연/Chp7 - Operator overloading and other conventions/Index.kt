package `Overloading arithmetic operators`

operator fun Point.get(index: Int): Int {
    return when (index) {
        0 -> x
        1 -> y
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

operator fun Point.get(rowIndex: Int, colIndex: Int): Int {
    TODO()
}

fun main() {
    val p = Point(10, 20)
    println(p[1])
}