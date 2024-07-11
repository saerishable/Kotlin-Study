fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = path.substringBeforeLast(".")
    val extension = path.substringAfterLast(".")

    println("Dir: $directory, name: $fileName, extension: $extension ")
}

fun parsePathRegex(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)

    if (matchResult != null) {
        val (directory, fileName, extension) = matchResult.destructured
        println("Dir: $directory, name: $fileName, extension: $extension ")
    }
}

fun main() {
    println("saeyeon.5.22".split("\\.|-".toRegex()))
    println("saeyeon.5.22".split(".", "-"))
    println("saeyeon.5.22".split('.', '-'))

    parsePath("/Users/saeyeon/kotlin/parsePath.kt")

    val price = 99.9
    println("""price : $price""")
    val kotlinLogo = """| //
                        .| //
                        .| /\
                        .""".trimMargin(".")
    println(kotlinLogo)

}