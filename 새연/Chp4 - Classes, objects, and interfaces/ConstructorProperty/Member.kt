package ConstructorProperty

interface Member {
    val name: String
}

interface MemberGetter {
    val email: String
    val name: String
        get() = email.substringBefore('@')
}

