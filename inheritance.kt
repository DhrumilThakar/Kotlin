// Import coroutine library
import kotlinx.coroutines.*


// 🔹 In Kotlin, classes are FINAL by default
// Final = cannot be inherited
// To allow inheritance → use 'open' keyword

open class SpecialCreature {

    // Properties (state of object)
    var name = ""
    var magicalPower = 20

    // 🔹 Suspend function → simulates using power (non-blocking delay)
    suspend fun usePowerAction(): String {
        delay(500)
        magicalPower -= 10   // reduce power after use
        return "$name has used 10 power"
    }

    // 🔹 Coroutine wrapper to call suspend function
    fun power() = runBlocking {

        val result = usePowerAction()   // calling suspend function
        println(result)

        // Remaining power after usage
        println("Special Power left: $magicalPower")
    }

    // 🔹 Function to check if power can be used
    fun usePower() {

        if (magicalPower > 0) {
            println("$name is using magical power")
            power()
        } else {
            println("$name is resting and hasn't used any power")
        }
    }

    // 🔹 Suspend function for resting (regaining power)
    suspend fun resting(): String {
        delay(1000)
        magicalPower += 20
        return "$name has rested and regained power"
    }

    // Coroutine wrapper
    fun rested() = runBlocking {
        val result = resting()
        println(result)

        println("Now power is: $magicalPower")
    }

    fun rest() {
        println("$name is resting to regain power")
        rested()
    }
}


// 🔹 INHERITANCE
// Child class inherits properties + functions of parent class

// Dragon is a child of SpecialCreature
class Dragon(dragonName: String) : SpecialCreature() {

    // init block runs when object is created
    init {
        name = dragonName
    }

    // Additional behavior specific to Dragon
    fun breathFire() {
        println("$name breathes fire!")
    }
}


// Another child class
class Unicorn(unicornName: String) : SpecialCreature() {

    init {
        name = unicornName
    }

    fun createRainbow() {
        println("$name creates a beautiful rainbow")
    }
}


// 🔹 Main function (entry point)
fun main() {

    val dragon1 = Dragon("Dhruv")
    val unicorn1 = Unicorn("Dhrumil")

    // Calling child-specific function
    dragon1.breathFire()

    // Calling inherited functions
    dragon1.usePower()
    dragon1.rest()
}