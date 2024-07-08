package Exception

var number: Int = 200

val percentage =
    if (number in 0..100)
        number
    else throw IllegalArgumentException("Percentage value must be between 0 and 100: $number")
