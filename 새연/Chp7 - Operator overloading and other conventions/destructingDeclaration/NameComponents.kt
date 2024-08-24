package DestructingDeclaration

data class NameComponents(val name: String, val extension: String)

fun splitFileName(fullName: String): NameComponents {
    val result = fullName.split('.', limit = 2)
    return NameComponents(result[0], result[1])
}

fun destructingSplitFileName(fullName: String): NameComponents {
    val (name, extension) = fullName.split('.', limit = 2)
    return NameComponents(name, extension)
}
fun main() {
    val (name, extension) = splitFileName("example.kt")
    println(name)
    println(extension)
}