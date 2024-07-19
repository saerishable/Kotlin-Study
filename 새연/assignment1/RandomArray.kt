package com.example.miraclekotlin.assignment1

import android.util.Log


fun main() {
    val capacity = 10
    val range = 1..100
    val myUniqueArray: IntArray ?= null

    for (i in 0 until capacity) {
        myUniqueArray?.set(i, range.random())
    }

    Log.d("HW01", "result: $myUniqueArray, capacity: $capacity")
}