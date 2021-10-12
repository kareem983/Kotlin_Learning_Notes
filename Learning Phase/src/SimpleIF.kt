
fun main(args:Array<String>){

    print("Enter Your ID: ")
    var ID:Int = readLine()!!.toInt()

    if(ID >=1 && ID <=100){
        println("ID is Ok")
    }
    else if(ID <1){
        println("Your ID less than 1")
    }
    else {
        println("your ID more than 100   ")
    }



    print("Enter Your Grade: ")
    var Grade:Int = readLine()!!.toInt()

    if(Grade >=50){
        Grade+=5
        println("Congrats, You passes and your new Grade after +5 is $Grade")
    }
    else println("Sorry, You Failed because your grade is $Grade")

}