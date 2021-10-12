
fun main(args:Array<String>){

    // val for constant values
    val name = "kareem"
    println(name)       // Kareem
    // name = "Mohamed" -> this is InValid


    // var for variable values
    var age= 15
    println(age) // 15
    age= 30
    print("$age\n")     // 30
    print("${age+5}\n") // 35
    print("$age+5\n")   //30+5


    // variables with Specific DataTypes
    var department:String = "Software Engineering"
    //department = "Testing"            -> this is Valid
    //department = 15                   -> this is InValid
    println("Department: "+ department) //Department: Software Engineering

    var num:Float = 3f
    println(num) //3.0

    var isOk:Boolean = true
    println(isOk) //true

    //If I want to make a variable without initialization, you should specify the data type of this variable
    //var tmp       -> this is InValid
    //var tmp:Int   -> this is Valid
    var tmp:Int
    tmp = 15
    println(tmp) //15

    //If I don't initialize the variable with a value, you should at least make it null
    //Kotlin has a feature called **null safety**
    //var variable:DataType?  -> that means that this variable can meat null
    var title:String? = null
    println(title)      //null
    title = "Kareem"
    println(title)      //Kareem


}