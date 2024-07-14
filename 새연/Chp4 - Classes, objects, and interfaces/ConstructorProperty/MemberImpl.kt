package ConstructorProperty

class GeneralMember(val name: String) {
    var address: String = "Unspecified"
        set(value: String) {
            println("""
                Address was changed for $name :
                "$field" -> "$value".
            """.trimIndent())
            field = value
        }
}
class PrivateMember (override val name: String): Member

class SubscribingMember(val email: String): Member {
    override val name: String
        get() = email.substringBefore('@')
}

//class PremiumMember(val accountId: Int): Member {
//    override val name: String = getName(accountId)
//}