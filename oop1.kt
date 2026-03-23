// Import coroutine functions
// delay → used to pause coroutine without blocking thread
// runBlocking → creates a coroutine scope to run suspend functions
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


// Class name should follow PascalCase (standard naming convention)
class Oop1 {

    // Properties (variables) of the object (Pet)
    // These define the state of the object
    var name = ""
    var type = ""
    var isHungry = true
    var isMood = true


    // 🔹 Suspend Function
    // 'suspend' means this function can PAUSE and RESUME later
    // Used for long operations like delay, API calls, file handling
    suspend fun complete(): String {

        // delay() → pauses coroutine for 2 seconds (non-blocking)
        // Thread is free to do other work during this time
        delay(2000)

        // Last line is returned automatically
        return "Has Completed Eating"
    }


    // 🔹 Coroutine Builder Function
    // runBlocking → starts a coroutine and blocks main thread until finished
    // Used only in main() or simple programs (not recommended in real apps repeatedly)
    fun dispatcher() = runBlocking {

        println("Now has started eating !!")

        // Calling suspend function (only possible inside coroutine)
        val result = complete()

        // Printing result returned from suspend function
        println(result)
    }


    // Another suspend function for playing activity
    suspend fun playComplete(): String {

        delay(2000) // simulate time taken for playing

        return "Has Completed Playing"
    }


    // Coroutine wrapper for playComplete()
    fun play() = runBlocking {

        println("Now he is playing")

        val result = playComplete()

        println(result)
    }


    // Function to check hunger condition
    // Calls eating coroutine if pet is hungry
    fun eating() {

        if (isHungry) {
            println("$name is hungry")

            // Calling function that internally runs coroutine
            dispatcher()
        } else {
            println("$name is not hungry")
        }
    }


    // Function to check mood for playing
    fun playing() {

        if (isMood) {
            println("$name is in mood to play")

            play()
        } else {
            println("$name is not in mood to play")
        }
    }
}


// 🔹 Main function → entry point of program
fun main() {

    // Creating object (instance) of class
    val myCat = Oop1()

    // Assigning values to object properties
    myCat.name = "Rocky"
    myCat.type = "Cat"
    myCat.isHungry = true
    myCat.isMood = false

    // Calling functions (behavior of object)
    myCat.eating()
    myCat.playing()
}