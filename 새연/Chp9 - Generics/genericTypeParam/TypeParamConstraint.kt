package genericTypeParam

fun <T: Number> List<T>.sum() {}

fun <T: Number> oneHalf(value: T): Double {
    return value.toDouble() / 2.0
}

fun <T: Comparable<T>> max(first: T, second: T): T {
    return if (first > second) first else second
}

fun <T> ensureTrailingPeriod(sequence: T)
    where T: CharSequence, T: Appendable {
        if (!sequence.endsWith('.')) {
            sequence.append('.')
        }
}

fun main() {
    println(listOf(1, 2, 3).sum())
    println(oneHalf(3))

    val sentence = StringBuilder("Hello World")
    ensureTrailingPeriod(sentence)
    println(sentence)
}