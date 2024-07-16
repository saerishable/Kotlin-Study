import java.io.File

val naturalNums = generateSequence(0) { it + 1 }
val numsTo100 = naturalNums.takeWhile { it <= 100 }

fun File.isInsideHideDirectory() =
    generateSequence(this) { it.parentFile }
        .any { it.isHidden }
fun main() {
    println(numsTo100.sum())

    val file = File("Users/kotlin/.HiddenDir/file.txt")
    println(file.isInsideHideDirectory())
}