package variance

import kotlin.collections.List

interface Comparator<in T> {
    fun compare(e1: T, e2: T): Int { TODO() }
}

interface Function<in P, out R> {
    operator fun invoke(p: P): R
}

fun enumerateCats(f: (Cat) -> Number) {
    TODO()
}

fun Animal.getIndex(): Int = TODO()

fun main() {
    val anyComparator = Comparator<Any> {
        e1, e2 -> e1.hashCode() - e2.hashCode()
    }

    val strings : List<String> = listOf<String>("saeyeon", "cherry")
    strings.sortedWith(anyComparator)

    enumerateCats(Animal::getIndex)
}