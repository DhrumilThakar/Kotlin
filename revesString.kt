/*Reversing strings (reading them from right to left, rather than from left to right) is a surprisingly common task in programming.

For example, in bioinformatics, reversing the sequence of DNA or RNA strings is often important for various analyses, such as finding complementary strands or identifying palindromic sequences that have biological significance.*/

fun revers(input:String):String{
    var s1 =""

    for(i in input.length-1 downTo 0){
        s1+=input[i]
    }
    return s1
}

fun main(){
    println(revers("Hello"))
}