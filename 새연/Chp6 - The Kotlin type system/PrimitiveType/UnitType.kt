fun f(): Unit { TODO() }

interface Processor<T>{
    fun process() {
        TODO()
    }
}

class NoResultProcessor : Processor<Unit> {
    override fun process() {
        super.process()
    }
}