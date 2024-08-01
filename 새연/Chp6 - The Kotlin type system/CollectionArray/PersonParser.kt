data class Person(val name: String)
class PersonParser : DataParser<Person> {
    override fun parseData(input: String?,
                           output: MutableList<Person>?,
                           errors: MutableList<String>?) {
        TODO("Not yet implemented")
    }
}