package com.example.miraclekotlin.assignment1

import android.util.Log

fun main() {
    var str = "I Love Kotlin"

    for (i in 0 .. str.count()) {
        val first = str[0]
        str.substring(1, str.count())
        str += first
    }
    Log.d("HW01", str)
}