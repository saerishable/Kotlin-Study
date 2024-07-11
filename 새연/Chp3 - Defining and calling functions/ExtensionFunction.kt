package `Chp3 - Defining and calling functions`

fun String.lastChar(): Char = this.get(this.length - 1)

fun main() {
    print("Kotlin".lastChar())
}

