package DataClass

data class Client(val name: String, val postalCode: Int)
class ClientImpl (val name: String, val postalCode: Int) {
    override fun toString(): String = "Client(name= $name, postalCode= $postalCode)"

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client)
            return false
        return name == other.name && postalCode == other.postalCode
    }

    override fun hashCode(): Int = name.hashCode() * 31 + postalCode

    fun copy(name: String = this.name, postalCode: Int = this.postalCode) = Client(name, postalCode)
}

fun main() {
    val client1 = ClientImpl("saeyeon", 12345)
    val client2 = ClientImpl("saeyeon", 12345)

    println(client1 == client2)

    val processed = hashSetOf(ClientImpl("saeyeon", 12345))
//    println(processed.contains(Client("saeyeon", 12345)))
}