package EnumAndWhen
import EnumAndWhen.Color.*

fun getColor(color: Color) =
    when (color) {
        RED -> "Apple"
        GREEN -> "Melon"
        BLUE -> "Blueberry"
    }

fun getWarmth(color: Color) =
    when (color) {
        GREEN -> "neutral"
        RED, BLUE -> "not neutral"
    }

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(RED, GREEN) -> "Brown"
        setOf(RED, BLUE) -> "Purple"
        setOf(GREEN, BLUE) -> "Turquoise"

        else -> throw Exception("Dirty color")
    }

fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == RED && c2 == GREEN) -> "Brown"
        (c1 == RED && c2 == BLUE) -> "Purple"
        (c1 == GREEN && c2 == BLUE) -> "Turquoise"

        else -> throw Exception("Dirty color")
    }