// 4번 문제
package com.example.myapplication

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect

@Composable
fun RotateString() {
    LaunchedEffect(Unit) {
        rotateString()
    }
}

private fun rotateString() {
    var str = "I Love Kotlin"
    var i:Int = 0

    while (i < str.length+1){
        //Print str
        Log.d("HW01", str)

        //Rotate str by extract the first character and add it to the end of the string
        str = str.substring(1) + str[0]
        i++
    }
}