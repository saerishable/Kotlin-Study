package inlineFunction

import java.util.concurrent.locks.Lock

inline fun <T> synchronized(lock: Lock, action: () -> T): T {
    lock.lock()
    try {
        return action()
    } finally {
        lock.unlock()
    }
}

fun foo(lock: Lock) {
    println("Before sync")
    synchronized(lock) {
        println("Action")
    }
    println("After sync")
}

fun __foo__(lock: Lock) {
    println("Before sync")
    lock.lock()
    try {
        println("Action")
    } finally {
        lock.unlock()
    }
    println("After sync")

}

class LockOwner(val lock: Lock) {
    fun runUnderLock(body: () -> Unit) {
        synchronized(lock, body)
    }

    fun __runUnderLock__(body: () -> Unit) {
        lock.lock()
        try {
            body()
        } finally {
            lock.unlock()
        }
    }
}

fun main() {
    val lock = Lock()
    synchronized(lock) {
        TODO()
    }
}