fun postponeComputation(delay: Int, param: Runnable) {
    println(42)
}


class DecompileHandleComputationClass(val id: String) : Runnable {
    override fun run() {
        println(id)
    }
}

fun decompileHandleComputation(id: String) {
    postponeComputation(1000, DecompileHandleComputationClass(id))
}



val runnable = Runnable { println(42)}
fun handleComputation() {
    postponeComputation(1000, runnable)
}



fun handleComputationId(id: String) {
    postponeComputation(1000) {
        println(id)
    }
}

fun main() {
    var computation: Computation ?= null

    if (computation != null) {
        computation.postponeComputation(1000) { println(42) }
    }
    postponeComputation(1000, object : Runnable {
        override fun run() {
            println(42)
        }
    })


}