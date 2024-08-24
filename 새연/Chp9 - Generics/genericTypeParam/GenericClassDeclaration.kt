package genericTypeParam.genericClass

interface List<T> {
    operator fun get(index: Int): T
}

class StringList: List<String> {
    override fun get(index: Int): String = TODO()
}

class ArrayList<T>: List<T> {
    override fun get(index: Int): T = TODO()
}