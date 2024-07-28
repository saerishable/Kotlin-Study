package com.example.assignment.assignment2

import android.util.Log

open class Point(open var x: Int, open var y: Int) {
    fun move(x: Int, y: Int) {
        this.x = x
        this.y = y
    }

    open fun show() {
        Log.d("HW01", "Current Point: ($x, $y)")
    }
}

class ColorPoint(x: Int, y: Int, var color: String) : Point(x, y) {
    override var y: Int
        get() = super.y
        set(value) {
            Log.d("HW01", "y value changed: $value")
            super.y = value
        }

    fun setPoint(x: Int, y: Int) {
        this.x = x
        this.y = y
    }

    override fun show() {
        Log.d("HW01", "Current Point: ($x, $y), Color: $color")
    }
}

fun main() {
    val p = Point(5, 5)
    p.x = 10
    p.y = 20
    p.show()

    val cp = ColorPoint(5, 5, "YELLOW")
    cp.setPoint(10, 20)
    cp.color = "GREEN"
    cp.y = 100
    cp.show()
}
