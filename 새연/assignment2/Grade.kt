package com.example.assignment.assignment2

import android.util.Log

fun main() {
    val math = 100
    val science = 90
    val english = 80

    val me = Grade(math, science, english)
    Log.d("ITM","my math: $math, my science: $science, my english: $english")
    Log.d("ITM","Average is ${me.average()}")

}

class Grade(math:Int, science:Int, english: Int) {
    private val average = math + science + english / 3

    fun average(): String {
        return average.toString()
    }
}
