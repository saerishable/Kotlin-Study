package Object

class Companion {
    companion object {
        fun bar() {
            println("Companion object called")
        }
    }
}

fun main() {
    Companion.bar()
}