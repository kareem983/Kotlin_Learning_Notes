
fun main(args:Array<String>) {

    //readLine Function For Read Input from The User (Console)
    //readLine Read a String value

    print("Enter the text: ")
    var txt = readLine() // Read a String value
    println(txt)

    // !! (Null Safety) means the input must not null
    print("Enter the name: ")
    var name:String = readLine()!!
    println(name)

    // this is valid without making Null Safety (!!), because applied ? that means can meat null
    print("Enter the title: ")
    var title:String?= readLine()
    println(title)

    // !!.toInt() this is means that make an exception when the input is not int
    print("Enter the age: ")
    var age:Int = readLine()!!.toInt()
    println(age)

    print("Enter the weight: ")
    var weight: Float = readLine()!!.toFloat()
    println(weight)

    // !!.toDouble() this is means that make an exception when the input is not Double
    print("Enter the height: ")
    var height:Double = readLine()!!.toDouble()
    println(height)


}