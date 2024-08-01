fun foo(l: Long) = println(l)

fun main() {
    val i = 1
//    val l: Long = i
    val l: Long = i.toLong()

    val x = 1
    val list = listOf(1L, 2L, 5L)
//    x in list
    println(x.toLong() in listOf(1L, 2L, 5L))

    val b: Byte = 1
    val long = b + 1L
    foo(long)

    println("522".toInt())
}