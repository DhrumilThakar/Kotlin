fun reverse(input: String): String {
    var s1=""
    for(i in input.length-1 downTo 0){
        s1+=input[i]
    }
    return s1
}
