package inlineFunction

import java.io.BufferedReader
import java.io.FileReader
import java.util.concurrent.locks.Lock
import kotlin.concurrent.withLock

fun <T> Lock.withLock(action: () -> T): T {
    lock()
    try {
        return action()
    } finally {
        unlock()
    }
}

fun readFirstLineFromFile(path: String): String {
    BufferedReader(FileReader(path)).use { br ->
        return br.readLine()
    }
}

fun main() {
    val lock: Lock = TODO()
    lock.withLock {
        /* 락에 의해 보호되는 자원 사용 */
    }
}