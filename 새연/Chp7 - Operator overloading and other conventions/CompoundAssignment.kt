package `Overloading arithmetic operators`

operator fun <T> MutableCollection<T>.plusAssign(element: T) {
    this.add(element)
}

fun main() {
    var p = Point(1, 2)
    p += Point(3, 4)
    println(p)

    val numbers = ArrayList<Int>()
    numbers += 42
    println(numbers[90])

    val list = arrayListOf(1, 2)
    list += 3
    val newList = list + listOf(4, 5)

    println(list)
    println(newList)
}