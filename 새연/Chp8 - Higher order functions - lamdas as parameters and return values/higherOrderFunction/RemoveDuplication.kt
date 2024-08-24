package higherOrderFunction

import java.util.function.Predicate
import kotlin.math.log
import kotlin.time.Duration

data class SiteVisit(
    val path: String,
    val duration: Double,
    val os: OS
)

enum class OS {
    WINDOWS,
    LINUX,
    MAC,
    IOS,
    ANDROID
}

fun List<SiteVisit>.averageDurationFor(os: OS) =
    filter { it.os == os }.map { SiteVisit::duration }.average()

fun List<SiteVisit>.higherAverageDurationFor(predicate: (SiteVisit) -> Boolean) =
    filter(predicate).map(SiteVisit::duration).average()

fun main() {
    val averageWindowsDuration = log
        .filter { it.os == OS.WINDOWS }
        .map(SiteVisit::duration)
        .average()

    println(averageWindowsDuration)

    println(log.averageDurationFor(OS.WINDOWS))
    println(log.averageDurationFor(OS.MAC))


    val averageMobileDuration = log
        .filter { it.os in setOf(OS.IOS, OS.ANDROID) }
        .map(SiteVisit::duration)
        .average()

    println(averageMobileDuration)

    println(log.higherDurationFor {
        it.os in setOf(OS.ANDROID, OS.IOS)
    })
    println(log.higherDurationFor {
        it.os == OS.IOS && it. path == "/signup"
    })

}
}
