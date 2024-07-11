//@file: JvmName("String")
//
//@JvmOverloads
//fun <T> joinToString(
//    collection: Collection<T>,
//    separator: String = ", ",
//    prefix: String = "",
//    postfix: String = ""
//) : String {
//    val result = StringBuilder(prefix)
//
//    for ((index, element) in collection.withIndex()) {
//        if (index > 0) result.append(separator)
//        result.append(element)
//    }
//
//    result.append(postfix)
//    return result.toString()
//}
//
//fun <T> Collection<T>.joinToString (
//    separator: String = ", ",
//    prefix: String = "",
//    postfix: String = ""
//) : String {
//    val result = StringBuilder(prefix)
//
//    for ((index, element) in this.withIndex()) {
//        if (index > 0) result.append(separator)
//        result.append(element)
//    }
//
//    result.append(postfix)
//    return result.toString()
//}
//
//fun Collection<String>.join (
//    separator: String = ", ",
//    prefix: String = "",
//    postfix: String = ""
//) = joinToString(separator, prefix, postfix)
//
//fun main() {
//    val list = listOf(1, 2, 3)
//    val s1 = joinToString(list, ";", "(", ")")
//    val s2 = joinToString(list, separator = ";", prefix = "(", postfix = ")")
//    val s3 = joinToString(list)
//    val s4 = joinToString(list, prefix = "{", postfix = "}")
//
//    val e1 = list.joinToString()
//    val e2 = list.joinToString(";")
//    val e3 = list.joinToString(separator = ";", prefix = "{", postfix = "}")
//
//    val e4 = listOf("one", "two", "three").join("?")
//}