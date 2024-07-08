package EnumAndWhen

fun evalJava(e: Expression): Int {
    if (e is Num) {
        val n = e as Num
        return n.number
    }

    if (e is Sum) {
        return evalJava(e.left) + evalJava(e.right)
    }

    throw IllegalArgumentException("Unknown expression")
}

fun evalIf(e: Expression): Int =
    if (e is Num) {
        e.number
    } else if (e is Sum) {
        evalIf(e.left) + evalIf(e.right)
    } else {
        throw IllegalArgumentException("Unknown expression")
    }

fun evalWhen(e: Expression): Int =
    when (e) {
        is Num ->
            e.number

        is Sum ->
            evalWhen(e.left) + evalWhen(e.right)

        else ->
            throw IllegalArgumentException("Unknown expression")
    }

fun evalWithLogging(e: Expression): Int =
    when (e) {
        is Num -> {
            println("num: ${e.number}")
            e.number
        }

        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("sum: $left + $right")
            left + right
        }

        else -> throw IllegalArgumentException("Unknown expression")
    }