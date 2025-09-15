package main.kotlin

fun main()
{
    val alarm = 7

    when(alarm)
    {
        12 -> println("The Alarm time is: $alarm")
        7 -> println("The Alarm time is : $alarm")
        1 -> println("The Alarm time is : $alarm")
        in 20..30 ->println("The Alarm time is : $alarm")
        else -> println("The Alarm time is : $alarm")
    }
    //The right side of the operator -> is the condition it check and then execute the statement on left side
    //The in statement is used s rang to do that just write in .. and it convert it
}