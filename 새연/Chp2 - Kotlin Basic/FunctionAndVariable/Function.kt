package `Chp2 - Kotlin Basic`.FunctionAndVariable

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// 중괄호 및 return 생략
fun simpleMax(a: Int, b: Int): Int = if (a > b) a else b

// 반환형 생략
fun moreSimpleMax(a: Int, b: Int) = if (a > b) a else b


