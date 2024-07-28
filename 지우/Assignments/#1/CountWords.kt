// 3번 문제
package com.example.myapplication

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect

@Composable
fun CountWords() {
    LaunchedEffect(Unit) {
        countWords()
    }
}

private fun countWords() {
    val strLine = arrayOf(
        "Seoul national University of Science and Technology",
        "Seoul Station",
        "IT Management",
        "Android and Kotlin is not that difficult",
        "Exit"
        )

    for (i in strLine) {
        val result = i.count { it.isWhitespace()} + 1
        Log.d("HW01", "The number of words is $result")
    }
}