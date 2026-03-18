fun eggCount(number: Int): Int{
    var n =number
    val binary = StringBuilder()
    while(n>0){
        binary.append(n%2)
        n/=2
    }
    var s1=binary.reverse().toString()
    var count=0
    for(i in 0 until s1.length){
        if(s1[i]=='1'){
            count++
        }
    }
    return count
}

fun main(){
    print(eggCount(89))
}