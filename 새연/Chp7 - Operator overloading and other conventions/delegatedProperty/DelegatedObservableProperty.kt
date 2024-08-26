package delegatedProperty

import kotlin.reflect.KProperty

class DelegatedObservableProperty(var propValue: Int, val changeSupport: PropetyChangeSupport) {
    operator fun getValue(employee: DelegatedEmployee, prop: KProperty<*>): Int = propValue
    operator fun setValue(employee: DelegatedEmployee, prop: KProperty<*>, newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }

}

class DelegatedEmployee(val name: String, age: Int, salary: Int) : PropetyChangeAware() {
    var age: Int by DelegatedObservableProperty(age, changeSupport)
    var salary: Int by DelegatedObservableProperty(salary, changeSupport)
}

class LibraryEmployee(val name: String, age: Int, salary: Int) : PropetyChangeAware() {
    private val observer = {
        prop: KProperty<*>, oldValue: Int, newValue: Int ->
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
}

