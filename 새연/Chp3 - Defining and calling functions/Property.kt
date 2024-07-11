package `Chp3 - Defining and calling functions`

var opCount = 0

val UNIX_LINE_SEPARATOR = "\n"
const val CONST_UNIX_LINE_SEPARATOR = "\n"
fun performOperation() {
    opCount++
    println("operation performed $opCount times")
}

fun separateLine() {
    print(UNIX_LINE_SEPARATOR)
    print(CONST_UNIX_LINE_SEPARATOR)
}