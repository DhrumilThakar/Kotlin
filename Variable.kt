// A variable is like a cup. It holds something.

/*
When you declare a variable using code like:
var x = 5
you’re telling the Kotlin compiler what value the variable should have,
what name to give it, and whether the variable can be reused for other values.
*/

/*
For this type-safety to work, the compiler needs to know the type of the variable.
The compiler can infer the variable’s type from the value that’s assigned to it.

In this example, you’re assigning the number 5 to a new variable named x.
The compiler knows that 5 is an integer, so it creates a new Int object with a value of 5.
The compiler then uses the type of the object for the type of the variable.
The variable stays this type forever.
*/

// The variable holds a reference to the object.
// When an object is assigned to a variable, a reference to the object goes into the variable instead.

/*
Val vs Var:
If you declare the variable using val, the reference to the object stays in the variable forever
and can’t be replaced. But if you use the var keyword instead, you can assign another value
to the variable.
*/


//Explicitly declare a variable's type:
/*there	are	times	when	you	need	to
explicitly	tell	the	compiler	what	type	of	variable	you	want	to	create*/

fun main() {
    var a = 1        // Int
    var b = 2L       // Long
    var c = 0b10     // Binary number
    var d = 0xAB     // Hexadecimal number
    var e = 123.5    // Double
    var f = 123.5F   // Float
    var isBarking = true   // Boolean
    var isTrained = false  // Boolean
    var letter = 'D'       // Char
    var name = "Dhrumil"   // String
    var z :Short =6   //Explicitly declare a variable z of typ short

    //Converting Different data type
    var g =4
    var h = g.toLong()

    //Converting Large Data type into small
    var x = 1234567890123
    var y: Int = x.toInt()

    //Array is collection of object of similar data type.  arrayOf(...) is to create an array

    var myArray = arrayOf(1,2,3)

    /*If	you	define	an	array	using	val,	you	can	still	update	the	items	in
the	array*/

    println("a = $a, type = ${a::class.simpleName}")
    println("b = $b, type = ${b::class.simpleName}")
    println("c = $c, type = ${c::class.simpleName}")
    println("d = $d, type = ${d::class.simpleName}")
    println("e = $e, type = ${e::class.simpleName}")
    println("f = $f, type = ${f::class.simpleName}")
    println("isBarking = $isBarking, type = ${isBarking::class.simpleName}")
    println("isTrained = $isTrained, type = ${isTrained::class.simpleName}")
    println("letter = $letter, type = ${letter::class.simpleName}")
    println("name = $name, type = ${name::class.simpleName}")
    println(h)
    println(y)
    println(myArray)
    println("Printing each index value")
    println(myArray[0])
    println(myArray[1])
    println(myArray[2])
    println("Size of Array : ${myArray.size}")
}