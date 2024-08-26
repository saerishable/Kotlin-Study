package variance

import kotlin.collections.MutableList
fun <T> copyData(src: MutableList <T>, dest: MutableList<T>) {
    for (item in src) {
        dest.add(item)
    }
}

fun <T> outCopyData(src: MutableList<out T>, dest: MutableList<T>) {
    for (item in src) {
        dest.add(item)
    }
}

fun <T> inCopyData(src: MutableList<T>, dest: MutableList<in T>) {
    for (item in src) {
        dest.add(item)
    }
}

fun <T : R, R> twoCopyData(src: MutableList<T>, dest: MutableList<R>) {
    for (item in src) {
        dest.add(item)
    }
}

fun main() {
    val numbers = mutableListOf(1, 2, 3)
    val any = mutableListOf<Any>()
    twoCopyData(numbers, any)
    println(any)
}
