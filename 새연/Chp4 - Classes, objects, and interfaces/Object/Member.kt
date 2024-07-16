package Object

class Member {
    val name: String

    constructor(email: String) {
        name = email.substringBefore('@')
    }

//    constructor(accountId: Int) {
//        name = getName(accountId)
//    }
}

class MemberFactoryMethod(val name: String) {
    companion object {
        fun newSubscribingMember(email: String) = MemberFactoryMethod(email.substringBefore('@'))

//        fun newPremiumMember(accountId: Int) = MemberFactoryMethod(getName(accountId))
    }
}