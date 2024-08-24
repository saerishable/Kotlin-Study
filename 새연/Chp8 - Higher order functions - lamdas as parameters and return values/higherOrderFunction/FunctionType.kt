package higherOrderFunction

//val sum = { x: Int, y: Int -> x + y }
val sum : (Int, Int) -> Int = { x, y -> x + y }

//val action = { println(42)}
val action : () -> Unit = { println(42) }

var canReturnNull: (Int, Int) -> Int? = { x, y -> null }

var funOrNull: ((Int, Int) -> Int)? = null

fun performRequest(
    url: String,
    callback: (code: Int, content: String) -> Unit) {
    /* ... */
}

fun main() {
    val url = "http://kotl.in"

    performRequest(url) { code, content -> /* ... */ }
    performRequest(url) { code, page -> /* ... */ }

}