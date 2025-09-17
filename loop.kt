fun main() {
    //Pattern 1
//1
//    for (i in 1..5) {
////2
//        val numberOfSpaces = (i-1)
////3
//        for (j in 1..numberOfSpaces) {
////4
//            print(" ")
//        }
////5
//        val numberOfStars = 6 - i
//
////6
//        for (j in 1..numberOfStars) {
////7
//            print("*")
//        }
////8
//        println()
//    }

    //Pattern 2
//    for (i in 1..5) {
//        val numberOfSpaces = i - 1
//        for (j in 1..numberOfSpaces) {
//            print(" ")
//        }
//        val numberOfStars = 11 - i * 2
//        for (j in 1..numberOfStars) {
//            print("*")
//        }
//        println()
//    }

    //Pattern 3
    for (i in 1 until 5) {
        val numberOfSpaces = 5 - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = i
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
    for (i in 1..5) {
        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = 6 - i
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
}
