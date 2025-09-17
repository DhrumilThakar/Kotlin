package main.kotlin

fun main(){
    //This is normal if-else case
    val weekday = "Friday"
    println("On $weekday, the opening hours are:")
    if (weekday == "Monday") {
        println("8 AM to 12 PM")
    } else if (weekday == "Tuesday") {
        println("8 AM to 6 PM")
    } else if (weekday == "Wednesday") {
        println("8 AM to 6 PM")
    } else if (weekday == "Thursday") {
        println("8 AM to 6 PM")
    } else if (weekday == "Friday") {
        println("8 AM to 9 PM")
    } else if (weekday == "Saturday") {
        println("9 AM to 4 PM")
    } else if (weekday == "Sunday") {
        println("8 AM to 4 PM")
    }

    //This is use of when
    val weekdays = "Friday"
    val hour = 20

    val isOpen = when (weekdays) {
        "Monday" -> hour >= 8 && hour <= 12
        "Tuesday", "Wednesday", "Thursday" -> hour >= 8 && hour <= 18
        "Friday" -> hour >= 8 && hour <= 21
        "Saturday" -> hour >= 9 && hour <= 16
        "Sunday" -> hour >= 8 && hour <= 16
        else -> false
    }
    if (isOpen) {
        println("Little Lemon is open now")
    } else {
        println("Little Lemon is closed now")
    }

}