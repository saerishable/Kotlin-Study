package flowControl

fun lookForSaeyeonAnonymous(people: List<Person>) {
    people.forEach (fun (person) {
        if (person.name == "saeyeon") {
            return
        }
        println("${person.name} is not saeyeon")
    })
}

fun main() {
    lookForSaeyeonAnonymous(people)

    people.filter (fun(person): Boolean {
        return person.age < 20
    })
}