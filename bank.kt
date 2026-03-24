// Encapsulation = hiding internal data and allowing access through functions

class Bank {

    // 🔹 Private variables → cannot be accessed directly from outside
    // This protects data from wrong modification
    private var balance: Double = 0.0
    private var accountNo: String = "123456789"


    // 🔹 Public function to deposit money
    fun deposit(amount: Double) {

        // Validation: amount must be positive
        if (amount > 0) {
            balance += amount   // increase balance

            println("Deposited $amount")
            println("Balance is $balance")
        } else {
            println("Enter an amount greater than 0.")
        }
    }


    // 🔹 Public function to withdraw money
    fun withdraw(amount: Double) {

        // Check if amount is valid
        if (amount > 0) {

            // Check if enough balance is available
            if (amount <= balance) {

                balance -= amount   // reduce balance

                println("Withdraw $amount")
                println("Balance left $balance")
            } else {
                println("Insufficient balance")
            }

        } else {
            println("Enter valid amount")
        }
    }


    // 🔹 Getter function → used to safely access private data
    fun getBalance(): String {
        return "Balance is $balance for Account no.: $accountNo"
    }
}


// 🔹 Main function
fun main() {

    val BOI = Bank()

    // Initially checking balance
    println(BOI.getBalance())

    // Deposit money
    BOI.deposit(2000.0)

    // Check updated balance
    println(BOI.getBalance())

    // Withdraw money
    BOI.withdraw(500.0)

    // Final balance
    println(BOI.getBalance())
}