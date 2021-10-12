
fun main(args:Array<String>) {

    //when Condition same as if elseif elseif else

    print("Enter the Number: ")
    var number:Int = readLine()!!.toInt()

    when(number){
        1->{ println("the number is 1") }
        2->{ println("the number is 2") }
        3->{ println("the number is 3") }
        4,5->{ println("the number is 4 or 5") }
        in 10..50->{ println("the number between 10 to 50") }
        !in 10..50->{ println("the number not between 10 to 50") }
        else ->{ println("the number out of range") }
    }


    var num:Int = when(number){
        1->{ number++ }
        2->{ number+2 }
        3->{  5}
        4,5->{ 100 }
        in 10..50->{ 200 }
        !in 10..50->{ 300 }
        else ->{ 10000 }
    }

    println("Your Return value is $num")

}