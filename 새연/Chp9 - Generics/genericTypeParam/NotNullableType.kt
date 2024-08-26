package genericTypeParam

class Processor<T> {
    fun process(value: T) {
        value?.hashCode()
    }
}

class NotNullProcessor<T: Any> {
    fun process(value: T) {
        value.hashCode()
    }
}

fun main() {
    val nullableStringProcessor = Processor<String?>()
    nullableStringProcessor.process(null)
}