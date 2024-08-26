package variance

interface Producer<out T> {
    fun produce(): T
}

open class Animal {
    fun feed() {}
}

class Herd<out T : Animal> (vararg animals: T){
    val size: Int
        get() = TODO()

    operator fun get(i: Int): T {
        TODO()
    }
}

class HerdProperty<T: Animal>(var leadAnimal: T, vararg animals: T)

class Cat : Animal() {
    fun cleanLitter() {
        TODO()
    }
}

fun feedAll(animals: Herd<Animal>) {
    for (i in 0 until animals.size) {
        animals[i].feed()
    }
}

fun takeCareOfCats(cats: Herd<Cat>) {
    for (i in 0 until cats.size) {
        cats[i].cleanLitter()
        feedAll(cats)
    }
}

