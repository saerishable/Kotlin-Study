// 1번 문제

package com.example.myapplication

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import kotlin.random.Random

@Composable
fun Calculator() {
    LaunchedEffect(Unit) {
        calculateAndLog()
    }
}

private fun calculateAndLog() {
    val givenNumber = 100
    val randomNumbers = List(5) { Random.nextInt(1, 30) }
    val operators = listOf('+', '-', '*', '/', '%')

    for (operator in operators) {
        val randomNumber = randomNumbers[operators.indexOf(operator)]
        val expression = "$givenNumber $operator $randomNumber"

        val result = when (operator) {
            '+' -> givenNumber + randomNumber
            '-' -> givenNumber - randomNumber
            '*' -> givenNumber * randomNumber
            '/' -> try {
                givenNumber / randomNumber
            } catch (e: ArithmeticException) {
                "Cannot divide by zero"
            }
            '%' -> givenNumber % randomNumber
            else -> "Invalid operator"
        }

        Log.d("HW01", "result: $result, (expression: $expression)")
    }
}