package ClassLayer

class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}