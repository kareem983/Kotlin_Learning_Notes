
fun main(args:Array<String>){

    var num:Int? = null
    println(num)      //null
    num = 5
    println(num)      //5


    // !! (Null Safety) this is means that if the variable have null make an exception and stop execution
    var title:String? = null
    println(title!!)   // an exception occurred and execution has stopped

    var name:String? = "Kareem"
    println(name!!)    // Kareem   ->(this is valid because doesn't have null)


    // to handle this, you can use try .. catch
    try {
        var age:Int? = null
        println(age!!)
    }
    catch (x : Exception){
        println("Your age must have a value")
    }

}