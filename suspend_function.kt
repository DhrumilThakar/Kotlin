// Importing coroutine library
// This gives access to runBlocking, delay, launch, async, etc.
import kotlinx.coroutines.*

// Class name in Kotlin should start with Capital letter (PascalCase)
class SuspendFunction {

    // Normal function → executes immediately, no waiting/pause
    fun greet(name: String) {
        println("Good Morning, $name")
    }

    // 'suspend' keyword means:
    // This function can PAUSE and RESUME without blocking the thread
    // Used for long tasks like API calls, database, delay, etc.
    suspend fun breakfast(): String {

        println("I am making breakfast for you")

        // delay() is a coroutine function
        // It pauses the coroutine for 5 seconds WITHOUT blocking the thread
        // (Better than Thread.sleep which blocks entire thread)
        delay(5000)

        // Last line automatically becomes return value
        return "Breakfast is ready"
    }
}

// main function with coroutine scope
// runBlocking is used to start a coroutine in normal main()
// It BLOCKS the main thread until all work inside is done
fun main() = runBlocking {

    // Creating object of class
    val obj = SuspendFunction()

    // Calling normal function → runs instantly
    obj.greet("Dhrumil")

    // Calling suspend function → MUST be inside coroutine (runBlocking/launch/async)
    // Program will wait here until breakfast() finishes
    val result = obj.breakfast()

    // Printing result returned from suspend function
    println(result)
}