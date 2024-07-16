data class User(val name: String, val age: Int)
val createUser = ::User

fun User.isAdult() = age >= 19
val predicate = User::isAdult

fun main() {
    val user = createUser("saeyeon", 23)
    println(user)
}