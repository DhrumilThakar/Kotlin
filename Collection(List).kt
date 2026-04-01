fun main() {

    // -------------------- READ-ONLY LIST --------------------
    // listOf() creates a READ-ONLY list (cannot modify directly)
    // Important: "Read-only" does NOT mean truly immutable.
    // It just means you cannot change it using this reference.
    val readOnlyShapes = listOf("triangle", "square", "circle")

    println("Read-only list: $readOnlyShapes")

    // Access elements using index (0-based indexing)
    println("First item using index: ${readOnlyShapes[0]}")

    // Extension functions (functions added to existing classes)
    println("First item using .first(): ${readOnlyShapes.first()}")
    println("Last item using .last(): ${readOnlyShapes.last()}")

    // Count number of elements
    println("Total items: ${readOnlyShapes.count()}")

    // Check if element exists using 'in'
    println("Is 'circle' present? ${"circle" in readOnlyShapes}")



    // -------------------- MUTABLE LIST --------------------
    // mutableListOf() creates a MODIFIABLE list
    // You can add, remove, update elements
    val shapes: MutableList<String> =
        mutableListOf("Triangle", "Square", "Rectangle", "Circle")

    println("\nMutable list: $shapes")

    // Add element
    shapes.add("Pentagon")
    println("After adding Pentagon: $shapes")

    // Remove element
    shapes.remove("Square")
    println("After removing Square: $shapes")



    // -------------------- READ-ONLY VIEW (IMPORTANT CONCEPT) --------------------
    // Here we assign MutableList to List
    // This is NOT casting, it is UPCASTING (safe, automatic)
    // We are just creating a READ-ONLY VIEW of the SAME list
    val shapeLock: List<String> = shapes

    println("\nRead-only view (shapeLock): $shapeLock")

    // shapeLock.add("Hexagon") ❌ ERROR (not allowed)
    // Because List interface does not allow modification

    // But modifying original list WILL affect shapeLock
    shapes.add("Hexagon")

    println("After modifying original list:")
    println("Mutable list: $shapes")
    println("Read-only view reflects change: $shapeLock")

    // 🔥 KEY IDEA:
    // shapeLock is NOT a separate list
    // It is just another reference pointing to SAME data



    // -------------------- TRUE IMMUTABILITY --------------------
    // If you want a completely separate list (no shared reference)
    val trulyImmutable = shapes.toList()

    println("\nTruly immutable copy: $trulyImmutable")

    // Modify original list again
    shapes.add("Octagon")

    println("After modifying original again:")
    println("Mutable list: $shapes")
    println("Immutable copy does NOT change: $trulyImmutable")



    // -------------------- SUMMARY (REMEMBER THIS) --------------------
    /*
    1. listOf() → Read-only list (cannot modify through reference)
    2. mutableListOf() → Fully modifiable list

    3. val x: List = mutableList
       → Creates READ-ONLY VIEW (same data, different reference)
       → NOT casting

    4. Changes in original mutable list WILL reflect in read-only view

    5. toList() → creates NEW COPY (true immutability)

    6. List stores:
       ✔ Ordered elements
       ✔ Allows duplicates

    7. Index starts from 0

    8. Common functions:
       - .first(), .last()
       - .count()
       - .add(), .remove() (only MutableList)
       - "item" in list

    ⚠️ Interview Trap:
    "List in Kotlin is immutable" → WRONG
    Correct: It is READ-ONLY, not strictly immutable
    */
}