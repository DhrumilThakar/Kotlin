// 🔹 Polymorphism = "many forms"
// Same function behaves differently depending on object

// 🔹 Method Overriding = child class changes behavior of parent function

// Parent class (Base class)
open class Animal {

    // 'open' → allows this function to be overridden in child classes
    open fun makeSound() {
        println("Animal is making a sound")
    }
}


// Child class Dog
class Dog : Animal() {

    // 'override' → changing behavior of parent function
    override fun makeSound() {
        println("The dog is barking")
    }
}


// Child class Cat
class Cat : Animal() {

    override fun makeSound() {
        println("The cat is meowing")
    }
}

open class Calculator {

    // Function 1 → takes 2 Int values
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    // Function 2 → takes 3 Int values
    fun add(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }

    // Function 3 → takes Double values
    fun add(a: Double, b: Double): Double {
        return a + b
    }
}
// Main function
fun main() {

    // Creating objects
    val myDog = Dog()
    val myCat = Cat()

    // Calling same function → different outputs
    myDog.makeSound()   // Dog behavior
    myCat.makeSound()   // Cat behavior

    val calc = Calculator()

    // Calling different versions of same function
    println(calc.add(2, 3))          // calls first function
    println(calc.add(2, 3, 4))       // calls second function
    println(calc.add(2.5, 3.5))      // calls third function
}