/**
 * Infix functions
 * To make infix functions, we must do 3 requirements
 * 1. Function must be member of the some class or extension function
 * 2. Function must have only one parameter
 * 3. Function must be initialized with the prefix infix keyword
 */
fun main() {
var output : Int? = null
    when(readLine()?.toInt()){
    1-> output = 9 add 3        //Here, 9 is added to 3 and simply we call add function to add this
    2-> output = 9 subtract 3   // But we can use + - * / operations that is not our target
    3-> output = 9 multiply 3   // Our target is to learn what is infix functions
    4-> output = 9 divide 3
    else-> println("Invalid operation")
}
    println(output)
}

infix fun Int.add(number: Int): Int {
    return this + number
}

infix fun Int.subtract(number: Int): Int {
    return if (this > number) {
        this - number
    } else {
        number - this
    }
}

infix fun Int.multiply(number: Int): Int {
    return this * number
}

infix fun Int.divide(number: Int): Int {
    return this / number
}