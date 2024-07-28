// 5번 문제
package com.example.myapplication

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect

@Composable
fun IsPalindrome() {
    LaunchedEffect(Unit) {
        isPalindrome()
    }
}

private fun isPalindrome() {
    val str = arrayOf(
        "jinwoo",
        "SEOUL",
        "DDADD",
        "WoWoW"
    )

    //reverse string and compare
    for (i in str){
        if (i.reversed() == i) {
            Log.d("HW01", "$i is palindrome!")
        } else {
            Log.d("HW01", "$i is not palindrome!")
            Log.d("HW01", "reversed: ${i.length}")
        }
    }
}