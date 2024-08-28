package annotation

data class Person(
    @JsonName("alias") val firstName: String,
    @JsonExclude val age: Int? = null
)

fun main() {
    val person = Person("saeyeon", 23)
    println(serialize(person))

    val json = """{"name": "saeyeon", "age": 23}"""
    println(deserialize<Person>(json))
}