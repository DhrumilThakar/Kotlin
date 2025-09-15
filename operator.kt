package main.kotlin

fun main()
{
    var x =5
    var y =6
    var result = x+y //addition
    result = x-y //substraction
    result =x*y //multiplication
    result = x/y //division
    result =x%y  //Modulation

    result++ //Increment
    result-- //Decrement
    result+=2 //Addition of 2 in result (One type of increment but by 2)
    result -=2 //Substraction of 2 from result (one type of decrement but by 2)

    println("result $result")

    if(x==y) //This is only one case of assignment operator we can use !=,>,<,>=,<=,&&,||,! etc.
    //We can use in many way like see else if 2
    {
        print("This is True from if")
    }
    else if(x>0)
    {
        print("This is from else if")
    }
    else if(x>0 && y>0)
    {
        print("This is from mix of assignment operator and comparision operator")
    }
    else
    {
        print("This is flse from else")
    }
}