package ClassLayer

interface Expression

class Num(val value: Int): Expression
class Sum(val left: Expression, val right: Expression): Expression

fun evaluate(e: Expression): Int =
    when (e) {
        is Num -> e.value
        is Sum -> evaluate(e.right) + evaluate(e.left)
        else ->
            throw IllegalArgumentException("Unknown expression")
    }

sealed class Expr {
    class Num(val value: Int): Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()


}

fun eval(e: Expr): Int =
    when (e) {
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.left) + eval(e.right)
    }