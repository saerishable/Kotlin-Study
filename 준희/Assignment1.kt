package 준희

//import Exception.number
import kotlin.random.Random


fun calc(){
    val expression: String? = readLine()

    var num1: Int = 0
    var oper: String = ""
    var num2: Int = 0

    var result: Any = 0

    if(expression!=null){
        num1 = expression.split(" ")[0].toInt()
        oper = expression.split(" ")[1]
        num2 = expression.split(" ")[2].toInt()
    }
    when(oper){
        "+" -> result = num1 + num2
        "-" -> result = num1 - num2
        "*" -> result = num1 * num2
        "/" -> try{
            result = num1.toFloat() / num2.toFloat()
        } catch (e: ArithmeticException){
            result = "cannot divide by zero"
        }
    }
    println(("\"HW01\" result: $result, (expression: $expression)"))
//    Log.d("HW01", "result: $result, (expression: $expression)")
}
fun array(){
    while (true) {
        val capacity = readLine()!!.toInt()
        if (capacity in 1 .. 100) {
            val array = IntArray(capacity) { Random.nextInt(0, 101) }
            val myUniqueArray = array.joinToString (", ")
            println("\"HW01\" result: $myUniqueArray")
            break
        }
//    Log.d("HW01", "result: $myUniqueArray, capacity: $capacity")
    }
}
fun word(){
    val strLine = arrayOf(
        "Seoul National University of Science and Technology",

        "Seoul Station",

        "IT Management",

        "Android and Kotlin is not that difficult",

        "Exit"
    )
    for (i in strLine){
        val result = i.split(" ").size
        //Log.d("HW01", result: $result")
        println("\"HW01\", The number of the word is $result")
    }
}
fun rotate(){
    var str = "I Love Kotlin"
    for(i in 0 .. str.length){
        println("\"HW01\": ${str.substring(i, str.length)}${str.substring(0, i)}")
    }
//    Log.d("HW01",str)
}
fun palindrome(){
    val str = readLine()
    if (str == str!!.reversed()) {
        println("\"HW01\": $str is palindrome")
        //Log.d("HW01", $str is palindrome)
    } else {
        println("\"HW01\": $str is Not palindrome")
        //Log.d("HW01", $str Not is palindrome)
    }
}
fun check(){
    val testNum = 99
    val input: Int = readLine()!!.toInt()
    if (testNum == input) {
        println("\"HW01\" Yes! two numbers are same! (Number: $input)")
//        Log.d("HW01", Yes! two numbers are same! (Number: $input))
    } else {
        println("\"HW01\" No! two numbers NOT are same! (Number: $input)")
//        Log.d("HW01", No! two numbers NOT are same! (Number: $input))
    }
}

fun sequence(){
    val sequence = "abcabcdefabc"
    var temp = ""
    for (i in sequence) {
        if (i in temp) continue
        else {
            temp += i
            println("\"HW01\" $i: ${sequence.count{it == i}}")
        }
    }
}
fun main() {
    calc()
    array()
    word()
    rotate()
    palindrome()
    check()
    sequence()
}