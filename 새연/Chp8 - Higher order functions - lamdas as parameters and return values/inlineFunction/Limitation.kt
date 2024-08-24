package inlineFunction

import javax.xml.crypto.dsig.Transform

fun <T, R> Sequence<T>.map(transform: (T) -> R): Sequence<R> {
    return TransfromingSequence(this, transform)
}

inline fun foo(inlined: () -> Unit, noinline notInlined: () -> Unit) {
    TODO()
}