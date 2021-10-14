
fun main(args:Array<String>){
    //calling (Invoking)
    show(10)
    show(20)
    show(30)
    show(40)

    println("Sum is "+sum(+6.0,2.0))
    println("Sum is "+sum(+5.0,2.0))
    println("Sum is "+sum(+9.0,2.0))
    println("Sum is "+sum(+6.0,10.0))


}

//function with return value
fun sum(num1:Double, num2:Double):Double{

    return num1 + num2
}


//function without return value
fun show(number :Int){

    println("number is $number")
}

