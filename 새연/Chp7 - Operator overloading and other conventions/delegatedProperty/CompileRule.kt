package delegatedProperty

import java.lang.reflect.Type

class C {
    var prop: Type by MyDelegate()
}

class Compile {
    private val <delegate> = MyDelegate()
    var prop: Type
        get() = <delegate>.getValue(this, <property>)
            set(value: Type) = <delegate>.setValue(this, <property>, value)
}

fun main() {
    val c = C()
}
