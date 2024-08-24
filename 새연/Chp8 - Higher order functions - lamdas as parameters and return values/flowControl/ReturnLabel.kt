package flowControl

fun lookForSaeyeonLabel1(people: List<Person>) {
    people.forEach label@ {
        if (it.name == "saeyeon") {
            return@label
        }
    }
    println("somewhere")
}

fun lookForSaeyeonLabel2(people: List<Person>) {
    people.forEach {
        if (it.name == "saeyeon") {
            return@forEach
        }
    }
    println("somewhere")
}

fun main() {
    lookForSaeyeonLabel1(people)

    println(StringBuilder().apply sb@{
        listOf(1, 2, 3).apply {
            this@sb.append(this.toString())
        }
    })
}