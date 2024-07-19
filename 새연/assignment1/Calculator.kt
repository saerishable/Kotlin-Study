package com.example.miraclekotlin.assignment1

import android.util.Log

fun calculate(left: Int, operator: String, right: Int): Any {
    if (right == 0) {
        return "Cannot divide by zero"
    }

    var result = left

    when (operator) {
        "+" -> result += right
        "-" -> result -= right
        "*" -> result *= right
        "/" -> result /= right
    }
    return result
}

fun main() {
    val expression = "100 / 0"
    val expList = expression.split(" ")

    val left = expList[0].toInt()
    val op = expList[1]
    val right = expList[2].toInt()

    val result = calculate(left, op, right)

    Log.d("HW01", "result: $result, (expression: $expression)")
}