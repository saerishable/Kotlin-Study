package com.example.miraclekotlin.assignment1

import android.util.Log

fun main() {
    val range = 10..99
    val testNum = 99
    val inputNum = range.random()

    var answer = "No"
    var flag = "NOT"

    if (inputNum == testNum) {
        answer = "Yes"
        flag = ""
    }

    Log.d("HW01", "$answer! two numbers are $flag same! (Number: $inputNum)")
}