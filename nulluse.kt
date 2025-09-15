package main.kotlin

//We can't assign null value directly in kotlin
fun main()
{
    var variable : String ?= null
    variable = "Some Text"
    print(variable?.length) //instead of ? we can use !! also
}