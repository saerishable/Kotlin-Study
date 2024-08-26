package delegatedProperty

import kotlin.reflect.KProperty

class ObservableProperty(val propName: String, var propValue: Int, val changeSupport: PropetyChangeSupport) {
    fun getValue(): Int = propValue

    fun setValue(newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(propName, oldValue, newValue)
    }
}

class newEmployee(val name: String, age: Int, salary: Int) : PropetyChangeAware() {
    val _age = ObservableProperty("age", age, changeSupport)
    var age: Int
        get() = _age.getValue()
        set(newValue) { _age.setValue(newValue) }

    val _salary = ObservableProperty("salary", salary, changeSupport)
    var salary: Int
        get() = _salary.getValue()
        set(newValue) { _salary.setValue(newValue) }
}

