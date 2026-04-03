fun main() {

    // -------------------- READ-ONLY MAP --------------------
    // mapOf() creates a READ-ONLY map (key-value pairs)
    val readOnlyJuiceMenu = mapOf(
        "apple" to 100,
        "kiwi" to 190,
        "orange" to 100
    )

    println("Read-only map: $readOnlyJuiceMenu")

    // Access value using key
    println("Price of apple: ${readOnlyJuiceMenu["apple"]}")

    // If key not found → returns null
    println("Price of mango: ${readOnlyJuiceMenu["mango"]}")

    // Count number of key-value pairs
    println("Total items: ${readOnlyJuiceMenu.count()}")

    // Check if key exists
    println("Does 'kiwi' exist? ${readOnlyJuiceMenu.containsKey("kiwi")}")

    // Check if value exists
    println("Is price 100 present? ${readOnlyJuiceMenu.containsValue(100)}")

    // Get all keys and values
    println("Keys: ${readOnlyJuiceMenu.keys}")
    println("Values: ${readOnlyJuiceMenu.values}")



    // -------------------- MUTABLE MAP --------------------
    // mutableMapOf() creates a MODIFIABLE map
    val juiceMenu: MutableMap<String, Int> = mutableMapOf(
        "apple" to 100,
        "kiwi" to 190,
        "orange" to 100
    )

    println("\nMutable map: $juiceMenu")

    // Add new key-value pair
    juiceMenu["coconut"] = 150
    println("After adding coconut: $juiceMenu")

    // Update existing key
    juiceMenu["apple"] = 120
    println("After updating apple price: $juiceMenu")

    // Remove key
    juiceMenu.remove("orange")
    println("After removing orange: $juiceMenu")



    // -------------------- READ-ONLY VIEW (IMPORTANT CONCEPT) --------------------
    // Upcasting MutableMap → Map
    // Creates READ-ONLY VIEW of SAME data
    val juiceMenuLocked: Map<String, Int> = juiceMenu

    println("\nRead-only view (juiceMenuLocked): $juiceMenuLocked")

    // juiceMenuLocked["mango"] = 200 ❌ ERROR (not allowed)

    // Modify original map
    juiceMenu["mango"] = 200

    println("After modifying original map:")
    println("Mutable map: $juiceMenu")
    println("Read-only view reflects change: $juiceMenuLocked")

    // 🔥 KEY IDEA:
    // juiceMenuLocked is NOT a separate map
    // It points to SAME data



    // -------------------- TRUE IMMUTABILITY --------------------
    // Create completely separate copy
    val trulyImmutable = juiceMenu.toMap()

    println("\nTruly immutable copy: $trulyImmutable")

    // Modify original again
    juiceMenu["pineapple"] = 250

    println("After modifying original again:")
    println("Mutable map: $juiceMenu")
    println("Immutable copy does NOT change: $trulyImmutable")



    // -------------------- ITERATING MAP --------------------
    println("\nIterating map:")

    for ((key, value) in juiceMenu) {
        println("$key -> ₹$value")
    }



    // -------------------- SUMMARY (REMEMBER THIS) --------------------
    /*
    1. mapOf() → Read-only map
    2. mutableMapOf() → Fully modifiable map

    3. val x: Map = mutableMap
       → READ-ONLY VIEW (same data)
       → NOT casting (UPCASTING)

    4. Changes in original WILL reflect in read-only view

    5. toMap() → creates NEW COPY (true immutability)

    6. Map properties:
       ✔ Stores key-value pairs
       ✔ Keys are UNIQUE
       ✔ Values can be duplicate

    7. Access:
       map[key]

    8. Common functions:
       - .count()
       - .containsKey(), .containsValue()
       - .keys, .values
       - .put()/[], .remove() (MutableMap)

    ⚠️ Interview Trap:
    "Map keys can be duplicate" → WRONG
    Keys are ALWAYS unique

    ⚠️ Another Trap:
    Accessing missing key → returns null (not error)
    */
}