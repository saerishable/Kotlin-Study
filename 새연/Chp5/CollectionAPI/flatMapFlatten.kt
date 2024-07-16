class Book(val name: String, val authors: List<String>)

fun main() {

    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })

    var books = listOf(
        Book("Thursday Next", listOf("Jasper Fforde")),
        Book("Mort", listOf("Terry Pratchett")),
        Book("Good Omens", listOf("Terry Pratchett", "Neil Gaiman")))

    println(books.flatMap { it.authors }.toSet()) // [Jasper Fforde, Terry Pratchett, Neil Gaiman]

    val lists = listOf(listOf("a", "b", "c"), listOf("d", "e", "f"))
    println(lists.flatten())
}