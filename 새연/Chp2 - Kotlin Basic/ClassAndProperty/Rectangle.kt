package `Chp2 - Kotlin Basic`.ClassAndProperty

class Rectangle (val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}