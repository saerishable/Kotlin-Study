package `Chp3 - Defining and calling functions`

import javax.print.attribute.standard.MediaSize.Other

//fun <T> List<T>.last(): T { /* 마지막 원소 반환 */ }
//fun <T> Collection<Int>.max(): Int { /* 컬렉션 최대값 찾기 */ }
// fun <K, V> mapOf(vararg value: Pair<K, V>) : Map<K, V> {}

infix fun Any.to(other: Any) = Pair(this, other)

fun main(args: Array<String>) {
    val set = hashSetOf(24, 5, 22)
    val hashMap = hashMapOf(24 to "twenty-four", 5 to "five", 22 to "twenty-two")

    val numbers: Collection<Int> = setOf(24, 5, 22)
    println(numbers.max())

    val strings: List<String> = listOf("twenty-four", "five", "twenty-two")
    println( strings.last())

    val arrayList = arrayListOf("args: ", *args)
    println(arrayList)

    val infixMap = mapOf(24 to "twenty-four", 5 to "five", 22 to "twenty-two")
    val (number, name) = 24 to "twenty-four"
}

fun destructDeclaration(collection: Collection<Int>) {
    for ((index, element) in collection.withIndex()) {
        println("$index : $element")
    }
}

