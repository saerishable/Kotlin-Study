fun alphabet(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("\nnow I now the alphabet")

    return result.toString()
}

fun alphabetWith(): String{
    val sb = StringBuilder()

    return with(sb) {
        for (letter in 'A' .. 'Z') {
            this.append(letter)
        }
        append("\nnow I now the alphabet")
        this.toString()
    }
}

fun alphabetWithShort() = with(StringBuilder()) {
    for (letter in 'A' .. 'Z') {
        append(letter)
    }
    append("\nnow I now the alphabet")
    toString()
}

fun alphabetApply() = StringBuilder().apply {
    for (letter in 'A' .. 'Z') {
        append(letter)
    }
    append("\nnow I now the alphabet")
}.toString()


fun alphabetBuildString() = buildString {
    for (letter in 'A' .. 'Z') {
        append(letter)
    }
    append("\nnow I now the alphabet")
}

fun main() {
    println(alphabet())
}