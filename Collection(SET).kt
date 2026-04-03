fun main()
{
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    println(readOnlyFruit)
    println("banana" in readOnlyFruit)
    println("This set has ${readOnlyFruit.count()} items")

    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    val fruitLocked: Set<String> = fruit
    println(fruit)
    fruit.add("Dragon Fruit")
    println(fruit)
    fruit.remove("Dragon Fruit")
    println(fruit)
}