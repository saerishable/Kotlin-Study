// 7번 문제
package com.example.myapplication

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import kotlin.random.Random

@Composable
fun CountCharacters() {
    LaunchedEffect(Unit) {
        countCharacters()
    }
}

private fun countCharacters() {
    val sequence = "abcabcdefabc"
    val charSet = mutableSetOf<Char>()
    var count = 0

    //Add each character to charSet
    for (c in sequence) {
        charSet.add(c)
    }

    //Count each character
    for (i in charSet) {
        for (j in sequence) {
            if (i == j) {
                count++
            }
        }
        Log.d("HW01", "$i: $count")
        count = 0
    }
}