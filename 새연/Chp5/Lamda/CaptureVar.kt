class Ref<T> (var value: T)

fun main() {
    val counter1 = Ref(0)
    val inc1 = { counter1.value++ }

    var counter2 = 0
    val inc2 = {counter2++}
}