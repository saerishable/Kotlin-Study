package genericTypeParam.genericClass

import kotlin.String

interface Comparable<T> {
    operator fun compareTo(other: T): Int
}
class String : Comparable<String> {
    override fun compareTo(other: String): Int = TODO("Not yet implemented")
}