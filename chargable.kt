// 🔹 Interface = blueprint of behavior (NOT full class)
// It tells WHAT a class should do, not HOW it stores data (mostly)

interface Chargeable {

    // Property inside interface (must be implemented by class)
    var chargeLevel: Int

    // Default function → already has implementation
    // Classes can use it directly OR override it
    fun charging() {
        println("Battery charged to 100%")

        // Updating property
        chargeLevel = 100
    }

    // Another default function
    fun checkBatteryStatus() {
        println("Battery is $chargeLevel% charged")
    }
}


// Class implementing interface
// ':' is used to implement interface
class Mobile(val brand: String) : Chargeable {

    // Must override interface property
    override var chargeLevel = 50

    // Custom function specific to Mobile
    fun makeCall() {

        // Checking battery before performing action
        if (chargeLevel > 40) {
            println("$brand is making call...")

            // Reduce battery after call
            chargeLevel -= 10
        } else {
            println("Battery too low! Cannot make a call")
        }
    }
}


// Entry point of program
fun main() {

    // Creating object of Mobile class
    val myMobile = Mobile("Samsung")

    // Calling custom function
    myMobile.makeCall()

    // Accessing property
    println("Current Battery: ${myMobile.chargeLevel}%")

    // Calling interface default function
    myMobile.charging()

    // Checking updated battery
    myMobile.checkBatteryStatus()
}