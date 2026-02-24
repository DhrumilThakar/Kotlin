fun getGameChoice(optionsParam: Array<String>):Int{
    optionsParam[(Math.random()*optionsParam.size).toInt()]

}

fun main(){

    var choice = arrayOf("Rock", "Paper", "Scissor")
    var gameChoice = getGameChoice(choice)
}