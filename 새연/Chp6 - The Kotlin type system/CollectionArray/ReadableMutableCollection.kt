fun <T> copyElements(source: Collection<T>, target: MutableCollection<T>) {
    for (item in source) {
        target.add(item)
    }
}

fun main() {
    val source: Collection<Int> = arrayListOf(1, 2, 5)
    val target: MutableCollection<Int> = arrayListOf(4)
//    val target: Collection<Int> = arrayListOf(4)

    copyElements(source, target)
    println(target)
}