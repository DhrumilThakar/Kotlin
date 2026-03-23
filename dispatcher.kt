// Import coroutine library (needed for launch, delay, Dispatchers, etc.)
import kotlinx.coroutines.*

// This function runs coroutine examples
fun mainDispatcher() = runBlocking {

    // Dispatcher = decides WHICH THREAD your coroutine will run on
    // Think: "Dispatcher = traffic controller for threads"

    println("Coroutines With Different Dispatcher")

    // ❌ Dispatchers.Main → NOT available in normal Kotlin (only Android/UI apps)
    // So we use Default instead for main-like behavior
    launch(Dispatchers.Default) {
        println("Running on Default (Main-like) Thread: ${Thread.currentThread().name}")
    }

    // Dispatchers.IO → used for I/O operations (network, file, database)
    // It uses a pool of threads optimized for blocking operations
    launch(Dispatchers.IO) {
        println("Running on IO Thread: ${Thread.currentThread().name}")

        // Simulating file/network delay
        delay(2000)

        println("File/Network Operation is completed")
    }

    // Dispatchers.Default → used for CPU-intensive work (calculations, sorting, etc.)
    // It uses limited threads based on CPU cores
    launch(Dispatchers.Default) {
        println("Running on Default Thread: ${Thread.currentThread().name}")

        delay(2000)

        println("Computation complete")
    }
}

// Main function (entry point of program)
fun main() {
    mainDispatcher()
}