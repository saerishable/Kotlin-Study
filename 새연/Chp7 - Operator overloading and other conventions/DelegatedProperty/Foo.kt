package DelegatedProperty

import java.lang.reflect.Type

class Delegate {
    operator fun getValue (param1: Any?, param2: Any?) {
        TODO()
    }

    fun setValue(param1: Any?, param2: Any?) {

    }
}
class Foo {
    private val delegate = Delegate()

    val param1: Any? = null
    val param2: Any? = null
    var p: Unit
        set(value) = delegate.setValue(param1, param2)
            get() = delegate.getValue(param1, param2)
}

fun main() {
    val foo = Foo()
    val oldValue = foo.p
//    foo.p = newValue
}