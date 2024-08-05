package DestructingDeclaration

import java.beans.PropertyChangeListener

class Employee(val name: String, age: Int, salary: Int) : PropetyChangeAware() {
    var age: Int = age
        set(value) {
            val oldValue = field
            field = value
            changeSupport.firePropertyChange("age", oldValue, value)
        }

    var salary: Int = salary
        set(value) {
            val oldValue = field
            field = value
            changeSupport.firePropertyChange("salary", oldValue, value)
        }
}

fun main() {
    val employee = Employee("saeyeon", 24, 1000)
    employee.addPropertyChangeListener(
        PropertyChangeListener { event ->
            println("Property ${event.propertyName} changed " +
            "from ${event.oldValue} to ${event.newValue}")
        }
    )

    employee.age
    employee.salary
}