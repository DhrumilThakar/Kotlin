/*The	function	begins	with	the	word	fun,	which	is	used	to	tell	the	Kotlin	compiler
that	it’s	a	function.	You	use	the	fun	keyword	for	each	new	Kotlin	function	you
create.
The	fun	keyword	is	followed	by	the	name	of	the	function,	in	this	case	main.
Naming	the	function	main	means	that	it	will	be	automatically	executed	when
you	run	the	application.
The	code	in	the	braces	()	after	the	function	name	tells	the	compiler	what
arguments	(if	any)	the	function	takes
You	put	any	code	you	want	to	run	between	the	curly	braces	{}	of	the	main
function.
*/

fun main(){
    println("Hello") //println("Pow!")	prints	a	string	of	characters,	or	String,	to	the	standard output

    fun loop(){
        println()
        var x= 4
        while(x>3){
            print(x)
            x= x-1
        }
        var z = 27
        while(z==10){
            print(z)
            z= z+6
        }
        println()
        var d =1
        println("Before the loop d = $d")
        while(d<4){
            println("In the loop d= $d")
            d = d+1
        }
        print("After the loop d = $d")
    }

    fun condition(){
        println()
        val x = 3
        val y = 1

        if(x>y){
            println("X is greater than Y")
        }
        else{
            println("X is not greater than Y")
        }
        println("This line runs no matter what")
    }
    var x1 = 3
    val name = "Dhrumil Thakar"
    x1= x1*10

    print("X is $x1")
    println()

    //This is a comment

    loop()
    condition()
}

/*Q:	Do	I	have	to	add	a	main	function	to	every	Kotlin	file	I	create?
A:	No.	A	Kotlin	application	might	use	dozens	(or	even	hundreds)	of	files,
but	you	may	only	have	one	with	a	main	function—the	one	that	starts	the
application	running*/

//When the run command is clicked The IDE compiles the kotline source code inot JVM bytecode then IDE starts the JVM and runs the file

//println	inserts	a	new	line	(think	of	println	as	print	new	line)	while	print keeps	printing	to	the	same	line.

//REPL	stands	for	Read-Eval-Print	Loop,	but	nobody	ever	calls	it	that