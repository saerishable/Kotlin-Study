package com.example.miraclekotlin.assignment1

import android.util.Log

fun main() {
    val strLine = "IT Management"
    val strList = strLine.split(" ")
    val count = strList.count()

    Log.d("HW01", "The number of words is  $count")
}