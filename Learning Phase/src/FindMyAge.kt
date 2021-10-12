import java.util.*

fun main(args:Array<String>){

    print("Enter your year of birth: ")
    var year:Int = readLine()!!.toInt()
    var age = Calendar.getInstance().get(Calendar.YEAR) - year
    println("Your age is $age")

}