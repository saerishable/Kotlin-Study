// 6번 문제
package com.example.myapplication

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import kotlin.random.Random

@Composable
fun SameNumber() {
    LaunchedEffect(Unit) {
        sameNumber()
    }
}

private fun sameNumber() {
    // Select two random numbers
    val testNumbers = listOf(Random.nextInt(10,99), Random.nextInt(10,99))

    //Use fixed numbers for testing
    val fixedNumbers = listOf(95, 99)

    for (i in fixedNumbers) {
        if (i.toString()[0] == i.toString()[1]){
            Log.d("HW01", "Yes! two numbers are same! (Number: $i)")
        } else {
            Log.d("HW01", "No! two numbers are not same! (Number: $i)")
        }
    }
}