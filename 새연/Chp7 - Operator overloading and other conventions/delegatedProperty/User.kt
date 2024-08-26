package delegatedProperty

data class Email(val email: String)

class User(val name: String) {
    private var _emails: List<Email>? = null
    val emails: List<Email>
        get() {
            if (_emails == null) {
                _emails = loadEmails(this)
            }
            return _emails!!
        }

    val lazyEmails by lazy { loadEmails(this) }
}

fun loadEmails(user: User): List<Email>? {
    println("${user.name}의 이메일")
    return listOf()
}

fun main() {
    val user = User("saeyeon")
    user.emails
    user.emails
}