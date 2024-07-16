fun main() {
    val sum = { x: Int, y: Int -> x + y }
    println(sum(5, 22))

    run { println(22) }

    val minus = { x: Int, y: Int ->
        print("$x - $y = ")
        x - y
    }

    println(minus(5, 22))
}