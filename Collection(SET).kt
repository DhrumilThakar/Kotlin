fun main() {

    // -------------------- READ-ONLY SET --------------------
    // setOf() creates a READ-ONLY set
    // Set does NOT allow duplicate elements (automatically removes them)
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")

    println("Read-only set: $readOnlyFruit")

    // Sets do NOT support indexing ❌
    // println(readOnlyFruit[0]) → ERROR

    // Access using functions
    println("First item using .first(): ${readOnlyFruit.first()}")
    println("Last item using .last(): ${readOnlyFruit.last()}")

    // Count number of elements (duplicates removed automatically)
    println("Total unique items: ${readOnlyFruit.count()}")

    // Check if element exists using 'in'
    println("Is 'banana' present? ${"banana" in readOnlyFruit}")



    // -------------------- MUTABLE SET --------------------
    // mutableSetOf() creates a MODIFIABLE set
    val fruit: MutableSet<String> =
        mutableSetOf("apple", "banana", "cherry", "cherry")

    println("\nMutable set: $fruit")

    // Add element
    fruit.add("Dragon Fruit")
    println("After adding Dragon Fruit: $fruit")

    // Duplicate add attempt (will NOT be added)
    fruit.add("apple")
    println("After adding duplicate 'apple': $fruit")

    // Remove element
    fruit.remove("Dragon Fruit")
    println("After removing Dragon Fruit: $fruit")



    // -------------------- READ-ONLY VIEW (IMPORTANT CONCEPT) --------------------
    // Upcasting MutableSet → Set (safe, automatic)
    // Creates a READ-ONLY VIEW of SAME data
    val fruitLocked: Set<String> = fruit

    println("\nRead-only view (fruitLocked): $fruitLocked")

    // fruitLocked.add("Mango") ❌ ERROR (not allowed)

    // Modify original set
    fruit.add("Mango")

    println("After modifying original set:")
    println("Mutable set: $fruit")
    println("Read-only view reflects change: $fruitLocked")

    // 🔥 KEY IDEA:
    // fruitLocked is NOT a separate set
    // It points to SAME data



    // -------------------- TRUE IMMUTABILITY --------------------
    // Create completely separate copy
    val trulyImmutable = fruit.toSet()

    println("\nTruly immutable copy: $trulyImmutable")

    // Modify original again
    fruit.add("Pineapple")

    println("After modifying original again:")
    println("Mutable set: $fruit")
    println("Immutable copy does NOT change: $trulyImmutable")



    // -------------------- SUMMARY (REMEMBER THIS) --------------------
    /*
    1. setOf() → Read-only set
    2. mutableSetOf() → Fully modifiable set

    3. val x: Set = mutableSet
       → READ-ONLY VIEW (same data)
       → NOT casting (UPCASTING)

    4. Changes in original WILL reflect in read-only view

    5. toSet() → creates NEW COPY (true immutability)

    6. Set properties:
       ✔ No duplicates allowed
       ✔ Unordered (no index)
       ✔ Fast lookup (better than list for searching)

    7. Common functions:
       - .first(), .last()
       - .count()
       - .add(), .remove() (only MutableSet)
       - "item" in set

    ⚠️ Interview Trap:
    "Set is ordered" → WRONG
    Default Set is unordered (HashSet)

    ⚠️ Another Trap:
    "Set allows duplicates" → WRONG
    It automatically removes duplicates
    */
}