package Object

data class Person(val name: String) {
    object NameComparator : Comparator<Person> {
        override fun compare(o1: Person, o2: Person): Int = o1.name.compareTo(o2.name)
    }
}
object Payroll {
    val Employees = arrayListOf<Person>()

    fun calculateSalary() {
        for (person in Employees) { /* ...  */ }
    }
}

fun main() {
    Payroll.Employees.add(Person("saeyeon"))
    Payroll.calculateSalary()

    val people = listOf(Person("saeyeon"), Person("cherry"))
    println(people.sortedWith(Person.NameComparator))
}