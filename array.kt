// Array = collection of similar data types stored in fixed size
// List = collection of elements (can be fixed or dynamic depending on type)

// 🔥 Key Difference:
// Array → fixed size (cannot grow/shrink)
// List → can be immutable (fixed) OR mutable (resizable)

// ⚡ Performance:
// Array → faster for direct access (less overhead)
// List → slightly slower but more flexible


fun main() {

    // ---------------- ARRAY ----------------

    // arrayOf() creates an array
    // Size is fixed → cannot add/remove elements
    val arr = arrayOf(1, 2, 3, 4, 5, 6)

    // Loop through array using for-each loop
    for (i in arr) {
        print(" $i")
    }

    println()

    // Accessing elements
    // Index starts from 0
    println(arr[2])   // prints 3


    // ---------------- LIST (IMMUTABLE) ----------------

    // listOf() creates an immutable list
    // Cannot add/remove elements after creation
    val l1 = listOf(7, 8, 9, 10, 11)

    for (i in l1) {
        print(" $i")
    }

    println()

    // Common operations on list
    println(l1.size)     // number of elements
    println(l1.get(4))   // element at index 4 (same as l1[4])


    // ---------------- MUTABLE LIST ----------------

    // mutableListOf() → dynamic list (can grow/shrink)
    val l2 = mutableListOf(12, 13, 14, 15, 16)

    for (i in l2) {
        print(" $i")
    }

    println()

    // Add element at specific index
    l2.add(1, 7)

    // Updated list
    for (i in l2) {
        print(" $i")
    }

    println()

    // You can also remove elements
    l2.removeAt(2)   // removes element at index 2

    println(l2)
}