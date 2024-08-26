package variance

import kotlin.collections.List

fun printContents(list: List<String>) {
    println(list.joinToString())
}

fun addAnswer(list: MutableList<Any>) {
    list.add(522)
}

fun main() {
    printContents(listOf("abc", "bac"))

    val strings = mutableListOf("abc", "bac")
//    addAnswer(strings)
    println(strings.maxBy { it.length })
}