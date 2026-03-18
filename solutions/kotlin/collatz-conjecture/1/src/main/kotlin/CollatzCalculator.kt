object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        require(start > 0) { "Only positive numbers allowed" }
        var n = start
        var count =0
        while(n!=1){
            n=if(n%2==0){
                count++
                 n/2
            }
            else{
                count++;
                (n*3)+1
            }
        }
        return count;
    }
}
