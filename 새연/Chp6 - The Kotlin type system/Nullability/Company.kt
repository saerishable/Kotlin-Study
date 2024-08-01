package `Chp6 - The Kotlin type system`.Nullability

class Employee(val name: String, val manager: Employee?)
fun managerName(employee: Employee): String? = employee.manager?.name

class Person(val name: String, val company: Company?) {
    val email: String
        get() {
            TODO()
        }
}

class Company (val name: String, val address: Address)
class Address(val street: String, val zipCode: Int, val city: String, val country: String)

fun Person.countryName(): String {
    return company?.address?.country ?: "Unknown"
}

fun printAddress(person: Person) {
    val address = person.company?.address
        ?: throw IllegalArgumentException("No address")
    with (address) {
        println("$street, $zipCode $city, $country")
    }
}
fun main() {
    val ceo = Employee("cherry", null)
    val developer = Employee("saeyeon", ceo)

    println(managerName(ceo))
    println(managerName(developer))

    val person = Person("saeyeon", null)
    println(person.countryName())

    val address = Address("Baker street", 221, "London", "UK")
    val seoultech = Company("Seoultech", address)
    val saeyeon = Person("saeyeon", seoultech)

    printAddress(saeyeon)
}