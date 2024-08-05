package DestructingDeclaration

class ObservableProperty(val propName: String, var propValue: Int, val changeSupport: PropetyChangeSupport) {
    fun getValue(): Int = propValue
    fun setValue(value: Int) {
        val oldValue = propValue
        propValue = value
        changeSupport.firePropertyChange(propName, oldValue, value)
    }
}

class newEmployee(val name: String, age: Int, salary: Int) : PropetyChangeAware() {
    val _age = ObservableProperty("age", age, changeSupport)
    var age: Int
        get() = _age.getValue()
        set(value) { _age.setValue(value) }

    val _salary = ObservableProperty("salary", salary, changeSupport)
    var salary: Int
        get() = _salary.getValue()
        set(value) { _salary.setValue(value) }
}

