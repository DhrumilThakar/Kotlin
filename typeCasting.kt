//Type conversion (also called as Type casting) refers to changing the entity of one data type variable into another data type.

//An integer value can be assigned to the long data type.

//But, Kotlin does not support implicit type conversion. An integer value can not be assigned to the long data type.


//In Kotlin, the helper function can be used to explicitly convert one data type to another data type.

fun main(){
    var myNumber = 100
    var myLongNumber: Long = myNumber.toLong()
    println(myLongNumber)

    //Converting Larger Number To Smaller
    println("259 to byte: " + (259.toByte()))
    println("50000 to short: " + (50000.toShort()))
    println("21474847499 to Int: " + (21474847499.toInt()))
    println("10L to Int: " + (10L.toInt()))
    println("22.54 to Int: " + (22.54.toInt()))
    println("22 to float: " + (22.toFloat()))
    println("65 to char: " + (65.toChar()))
    // Char to Number is deprecated in kotlin
    println("A to Int: " + ('A'.toInt()))
}

//Note: There is No helper function available to convert into boolean type.