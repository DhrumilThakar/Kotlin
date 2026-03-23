fun main() {

    // Asking user to enter their name
    println("Please Enter your Name")

    // readln() is used to take input from user (it returns a String)
    val name = readln()

    // Variable to store age (nullable because input might be invalid)
    var age: Int? = null

    // Loop will keep running until user enters a valid number
    while (age == null) {

        println("Enter your age")

        // readln() takes input as String
        // toIntOrNull() tries to convert String → Int
        // If conversion fails (like "abc" or empty), it returns null instead of crashing
        age = readln().toIntOrNull()

        // If input is invalid, age will be null
        if (age == null) {
            println("Invalid input! Please enter a valid number.")
        }
    }

    // Now age is guaranteed to be a valid Int (not null)

    // Check if age is greater than 18
    if (age > 18) {
        println("Hey $name you are now officially able to drive as your age is $age !!")
    }

    // Check if age is exactly 18
    else if (age == 18) {
        println("Hey $name you are now officially able to drive but carry helmet as your age is $age !!")
    }

    // If age is less than 18
    else {
        println("Hey $name you are not officially able to drive as your age is $age !!")
    }
}