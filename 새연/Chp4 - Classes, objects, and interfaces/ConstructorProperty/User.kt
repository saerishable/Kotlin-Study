package ConstructorProperty

open class User (val name: String, val isSubscribed: Boolean = true)

class UserInitLong private constructor(_name: String) {
    val name: String

    init {
        name = _name
    }
}

class UserInitShort constructor(_name: String) {
    val name = _name
}

class InstagramUser(name: String): User(name) { /* ... */ }


fun main() {
    val saeyeon = User("saeyeon")
    val cherry = User("cherry", false)
    val pochacco = User("pochacco", isSubscribed = false)
}
