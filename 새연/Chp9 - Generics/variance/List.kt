package variance

import kotlin.collections.List

interface List<out T> : Collection<T> {
    open fun get(index: Int): T

    fun subList(fromIndex: Int, toIndex: Int): List<T>

}

interface MutableList<T> : List<T>, MutableCollection<T> {
    override fun add(element: T): Boolean
}

