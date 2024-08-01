import java.io.BufferedReader
import java.io.StringReader

fun readNums(reader: BufferedReader): List<Int?> {
    val result = ArrayList<Int?>()
    for (line in reader.lineSequence()) {
        try {
            val num = line.toInt()
            result.add(num)
        } catch (e: NumberFormatException) {
            result.add(null)
        }
    }

    return result
}

fun addValidNums(numbers: List<Int?>) {
    var sumOfValidNums = 0
    var invalidNums = 0
    for (number in numbers) {
        if (number != null) {
            sumOfValidNums += number
        } else {
            invalidNums++
        }
    }
    println("Sum of valid numbers: $sumOfValidNums")
    println("Invalid numbers: $invalidNums")
}

fun addValidNumsFilter(numbers: List<Int?>) {
    val validNums = numbers.filterNotNull()
    println("Sum of valid numbers: $validNums")
    println("Invalid numbers: ${numbers.size - validNums.size}")
}

fun main() {
    val reader = BufferedReader(StringReader("1\nabc\n42"))
    val numbers = readNums(reader)
    addValidNums(numbers)
}