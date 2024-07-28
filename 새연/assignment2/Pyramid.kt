package com.example.assignment.assignment2

fun drawPyramid(floor: Int) {
    val pyramid = StringBuilder().run {
        for (i in 0 until floor) {
            val spaces = " ".repeat(floor - i - 1)
            val stars = "*".repeat(2 * i + 1)
            append(spaces).append(stars).append("\n")
        }
        toString()
    }
    println(pyramid)
}

fun main() {
    drawPyramid(5)
}