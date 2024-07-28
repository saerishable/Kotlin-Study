// 2번 문제
package com.example.myapplication

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import kotlin.random.Random

@Composable
fun Capacity() {
    LaunchedEffect(Unit) {
        capacityAndLog()
    }
}

private fun capacityAndLog() {
    val fixedCapacityList = listOf(3, 10, 20)
    var capacity:Int = 0

    for (i in fixedCapacityList) {
//        val randomSize = Random.nextInt(1, 100)

        // Initialize array1 with null values
        val array1 = mutableSetOf<Int>()

        // Fill array1 with random numbers ranged from 1 to 100
        while (array1.size < i) {
            array1.add(Random.nextInt(1, 101))
        }

        // Convert array1 to myUniqueArray and print it
        val myUniqueArray = array1.toIntArray().contentToString()

        //Set capacity
        capacity = i

        Log.d("HW01", "result: $myUniqueArray, (capacity: $capacity)")
    }
}