package delegatedProperty

class PersonInfo {
    // 추가 정보
    private val _attributes  = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    // 필수 정보
//    val name: String
//        get() = _attributes["name"]!!
  val name: String by _attributes
}

fun main() {
    val personInfo = PersonInfo()
    val data = mapOf("name" to "saeyeon", "company" to "JetBrains")

    for ((attrName, value) in data) {
        personInfo.setAttribute(attrName, value)
    }
    println(personInfo.name)
}
