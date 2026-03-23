fun main() {

    // Ask user to enter a number
    println("Enter a number between 1 to 10")

    // Take input and convert to Int (⚠️ may crash if invalid)
    val num = readln().toInt()

    // Lambda function to print number
    // It takes an Int and prints message
    val printNumber = { n: Int ->
        println("$n is $n")
    }

    // Check if number is outside range
    if (num < 1 || num > 10) {
        println("Choose a number from 1 to 10")
        return
    }

    // Using 'when' with lambda
    when (num) {
        1 -> printNumber(num)
        2 -> printNumber(num)
        3 -> printNumber(num)
        4 -> printNumber(num)
        5 -> printNumber(num)
        6 -> printNumber(num)
        7 -> printNumber(num)
        8 -> printNumber(num)
        9 -> printNumber(num)
        10 -> printNumber(num)
    }
}