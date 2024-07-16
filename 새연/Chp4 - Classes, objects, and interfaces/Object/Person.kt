package Object

interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}

fun <T> loadFromJSON(factory: JSONFactory<T>): T {
    TODO("Not yet implemented")
}

class UserImpl(val name: String) {
    companion object : JSONFactory<UserImpl> {
        override fun fromJSON(jsonText: String): UserImpl {
            TODO("Not yet implemented")
        }
    }


}
class User (val name: String) {
    companion object Loader {
        fun fromJSON(jsonText: String): Person {
            TODO("Not yet implemented")
        }
    }
}

// 비즈니스 로직 모듈
class UserExtension(val firstName: String, val lastName: String) {
    companion object {

    }
}

// 클라이언트 - 서버 통신 모듈
fun UserExtension.Companion.fromJSON(jsonText: String): UserExtension {
    TODO()
}

fun main() {
    val user1 = User.Loader.fromJSON("{name: 'Saeyeon'}")
    user1.name

    val user2 = User.fromJSON("{name: 'Saeyeon'}")
    user2.name

    loadFromJSON(UserImpl)

    val user = UserExtension.fromJSON(jsonText = "{name: 'Saeyeon'}")
}