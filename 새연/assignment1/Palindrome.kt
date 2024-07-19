package com.example.miraclekotlin.assignment1

import android.util.Log

fun main() {
    val str = "saeyeon"
    var result = ""

    for (i in 0 .. str.count() / 2) {
        if (str[i] != str[str.count() - i - 1]) {
            result = "Not"
            break
        }
    }

    Log.d("HW01", "$str is $result palindrome!")
}