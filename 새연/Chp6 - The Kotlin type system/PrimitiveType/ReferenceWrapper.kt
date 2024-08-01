val i: Int = 1
val list: List<Int> = listOf(1, 2, 5)

fun showProgress(progress: Int) {
    val percentage = progress.coerceIn(0, 100)
    println("We're ${percentage}% done")
}

fun main() {
    showProgress(522)
}