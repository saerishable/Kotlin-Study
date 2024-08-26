package delegatedProperty

import kotlin.reflect.KProperty

object Members : IdTable() {
    val name = varchar("name", length = 50).index()
    val age = integer("age")
}

class Member(id: EntityID) : Entity(id) {
    var name: String by Members.name
    var age: Int by Members.age
}

operator fun <T> Column<T>.getValue(o: Entity, desc: KProperty<*>): T {
    TODO()
}

operator fun <T> Column<T>.setValue(o: Entity, desc: KProperty<*>): T {
    TODO()
}

