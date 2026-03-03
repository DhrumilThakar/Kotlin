fun getGameChoice(optionsParam: Array<String>){
    optionsParam[(Math.random()*optionsParam.size).toInt()]
}

fun getUserChoice(otionsParam:Array<String>): String{
    println("Please Enter One of the Following : Rock, paper, Scissor :")
}

/*For Loop
For loop is a specail type of loop in which we specfi the range we want to run that loop syntax for(var_name in starting_point .. ending point) {//code}

->IF we don't want to include the ending point we can use until instead of ..
->If we want to increment the in any order we can use step like for(x in 1..100 step 2) {//code}
->If we want to travel in reverse order than we can use downto (i.e. for(x in 100 downto 1) {//code}
->IF we want to travel in an array we can write for(var_name in array_name){//code}
 */

fun main(){

    var choice = arrayOf("Rock", "Paper", "Scissor")
    var gameChoice = getGameChoice(choice)
}