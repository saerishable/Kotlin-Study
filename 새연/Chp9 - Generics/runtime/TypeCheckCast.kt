package runtime

val list1: List<String> = listOf("saeyeon", "cherry")
val list2: List<Int> = listOf(23, 5)

fun printSum(c: Collection<*>) {
    val intList = c as? List<Int>
        ?: throw IllegalArgumentException("List is expected")
    println(intList.sum())
}

fun knowTypePrintSum(c: Collection<Int>) {
    if (c is List<Int>) {
        println(c.sum())
    }
}

fun main() {
    printSum(listOf(1, 2 ,3))
    printSum(setOf(1, 2, 3))
    knowTypePrintSum(listOf(1, 2 ,3))
}