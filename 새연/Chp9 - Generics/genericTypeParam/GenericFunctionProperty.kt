import GenericClass.List

val authors = listOf("Dmitry", "Svetlana")

val readerList: MutableList<String> = mutableListOf()
val readers = mutableListOf<String>()

fun <T> List<T>.filter() {}

fun <T> List<T>.slice(indices: IntRange) {}

val <T> List<T>.penultimate: T
    get() = this[size - 2]

fun main() {
    val letters = ('a'..'z').toList()
    println(letters.slice<Char>(5..22))
    println(letters.slice(4..14))

    println(readers.filter())

    println(listOf(1, 2, 3, 4).penultimate)
}