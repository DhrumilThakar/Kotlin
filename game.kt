fun getGameChoice(optionsParam: Array<String>):String{
    return optionsParam[(Math.random()*optionsParam.size).toInt()]
}

fun getUserChoice(optionsParam:Array<String>): String{

    var isValidChoice = false
    var userChoice=""

    while(!isValidChoice)
    {
        println("Please Enter One of the Following : Rock, paper, Scissor :")

        for(item in optionsParam) print("$item")
        println(".")

        val userInput = readLine()

        if(userInput !=null && userInput in optionsParam){
            isValidChoice = true
            userChoice = userInput
        }

        if(!isValidChoice) print("You must enter a valid choice.")
    }
    return userChoice

}

fun checkWinner(user: String, computer: String): String {

    if (user == computer) {
        return "Tie! Nobody wins."
    }

    return when (user) {
        "Rock" -> if (computer == "Scissor") "User wins!" else "Computer wins!"
        "Paper" -> if (computer == "Rock") "User wins!" else "Computer wins!"
        "Scissor" -> if (computer == "Paper") "User wins!" else "Computer wins!"
        else -> "Invalid input"
    }
}

/*For Loop
For loop is a specail type of loop in which we specfi the range we want to run that loop syntax for(var_name in starting_point .. ending point) {//code}

->IF we don't want to include the ending point we can use until instead of ..
->If we want to increment the in any order we can use step like for(x in 1..100 step 2) {//code}
->If we want to travel in reverse order than we can use downto (i.e. for(x in 100 downto 1) {//code}
->IF we want to travel in an array we can write for(var_name in array_name){//code}
->for((index,item) in optionsParam.withIndex()){//code} =>this will loops through each item in the array it assigns the item's index to the index variable and the item itself to the item variable
 */


/* Operator "And", "OR", "Not", "Not equal to"

&& means and operator It	evaluates	to	true	if	both	sides	of	the	&&	are	true.

|| means or operator This	expression	evaluates	to	true	if	either	side	of	the	||	is	true

!= means not equal to

! Not



*/

fun main(){

    var choice = arrayOf("Rock", "Paper", "Scissor")
    var gameChoice = getGameChoice(choice)
    var user = getUserChoice(choice)

    println("Game Choose :$gameChoice")
    println("You choose : $user")

   val result =  checkWinner(user,gameChoice)
 print(result)
}