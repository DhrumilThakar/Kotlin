fun main() {

    // ============================================================
    // CONTROL FLOW IN KOTLIN
    // Control Flow decides how your program runs step by step
    // Like: if something happens → do this, otherwise do that
    // ============================================================



    // ============================================================
    // 1. IF STATEMENT
    // Used when you want to run code ONLY if condition is true
    //
    // Syntax:
    // if(condition) {
    //     // code runs if condition is true
    // }
    // ============================================================

    val age = 10

    if (age < 18) {
        println("You are a kid")
    }



    // ============================================================
    // 2. IF-ELSE STATEMENT
    // Used when you have 2 choices:
    // if condition is true → run this
    // else → run something else
    //
    // Syntax:
    // if(condition) {
    //     // true block
    // } else {
    //     // false block
    // }
    // ============================================================

    val number = 7

    if (number % 2 == 0) {
        println("Even number")
    } else {
        println("Odd number")
    }



    // ============================================================
    // 3. IF-ELSE IF LADDER
    // Used when you have multiple conditions
    //
    // Syntax:
    // if(condition1) {
    // }
    // else if(condition2) {
    // }
    // else {
    // }
    // ============================================================

    val marks = 85

    if (marks >= 90) {
        println("Grade A")
    } else if (marks >= 70) {
        println("Grade B")
    } else if (marks >= 50) {
        println("Grade C")
    } else {
        println("Fail")
    }



    // ============================================================
    // 4. NESTED IF
    // IF inside another IF
    // First outer condition is checked
    // Then inner condition is checked
    // ============================================================

    val isLoggedIn = true
    val isAdmin = false

    if (isLoggedIn) {

        if (isAdmin) {
            println("Welcome Admin")
        } else {
            println("Welcome User")
        }
    }



    // ============================================================
    // 5. WHILE LOOP
    // Runs code again and again UNTIL condition becomes false
    // Condition is checked BEFORE running the loop
    //
    // Syntax:
    // while(condition) {
    //     // code
    // }
    // ============================================================

    var i = 1

    while (i <= 5) {
        println("While Count: $i")
        i++   // important: increases value, otherwise infinite loop
    }



    // ============================================================
    // 6. DO-WHILE LOOP
    // Runs code at least ONCE, then checks condition
    // Condition is checked AFTER execution
    //
    // Syntax:
    // do {
    //     // code
    // } while(condition)
    // ============================================================

    var j = 1

    do {
        println("Do-While Count: $j")
        j++
    } while (j <= 5)



    // ============================================================
    // 7. FOR LOOP
    // Used when number of iterations is known
    //
    // Syntax:
    // for(variable in range) {
    //     // code
    // }
    // ============================================================

    for (k in 1..5) {
        println("For Count: $k")
    }



    // ============================================================
    // EXTRA: REVERSE LOOP
    // Counts backward
    // ============================================================

    for (x in 5 downTo 1) {
        println("Reverse Count: $x")
    }



    // ============================================================
    // EXTRA: STEP LOOP
    // Skips values (step size)
    // ============================================================

    for (y in 1..10 step 2) {
        println("Step Count: $y")
    }



    // ============================================================
    // SUMMARY
    // if → decision
    // if-else → two choices
    // if-else-if → multiple choices
    // nested if → condition inside condition
    // while → repeat until condition false
    // do-while → run once then repeat
    // for → fixed repetition
    // ============================================================

}