//Why do we need Function ?
/*For 	better	organization and easier	to maintain  also to reuse the code */

//Sometimes,	a	function	needs	extra	information	in	order	for	it	to	perform	a	task.
/*You	tell	the	compiler	what	values	a	function	can	accept	by	specifying	one	or
more	parameters.	Each	parameter	must	have	a	name	and	type.*/

fun foo(param: Int){// We declare parameters inside the function's parentheses
    println("Parameter is $param")
}

//A	function	uses	parameters.	A	caller	passes	it	arguments.

/*If	you	want	your	function	to	have	multiple	parameters,	you	separate	them	with
commas	when	you	declare	them,	and	separate	the	arguments	with	commas	when
you	pass	them	to	the	function.*/

//If we want something back from function we need to declare it like following

fun max(a:Int,b: Int,c:Int):Int{
    val maxvalue = if(a>b) a else b
    return maxvalue
}

/*If	you	declare	that	a	function	returns	a	value,	then	you	must	return	a	value	of	the
declared	type*/

//IF you want not to return a value simply omit the return part or set return type to unit

//fun max(a:Int,b:Int):Int = if(a>b) a else b //This is same as function max written above here we use = to sya what the function returns, and remove the {}
//fun max(a:Int,b:Int) = if(a>b) a else b // This is also the same here the compiler knows that a and b are Ints, so it can work out the function's return type from the expression


fun main(){
    foo(6) //Note that 	if	a	function	has	a	parameter,	you	must	pass	it	something.

}