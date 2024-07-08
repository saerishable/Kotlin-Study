package `Chp2 - Kotlin Basic`.FunctionAndVariable

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"

    println("Hello $name")
    println("Hello ${args[0]}")
    println("Hello ${if (args.size > 0) args[0] else "someone"}")
}

