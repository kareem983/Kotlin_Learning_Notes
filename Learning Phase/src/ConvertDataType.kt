
fun main(args:Array<String>) {

    //toInt() function convert dataType to int
    var strInt:String = "123"
    var numInt:Int = strInt.toInt()
    println(numInt+2) // 125
    
    //toDouble() function convert dataType to Double
    var strDouble:String = "12.5"
    var numDouble:Double = strDouble.toDouble()
    println(numDouble+2) // 14.5

    //toFloat() function convert dataType to Float
    var strFloat:String = "12"
    var numFloat:Float = strFloat.toFloat()
    println(numFloat+2) // 14.0

    //toString() function convert dataType to String
    var number:Int = 12
    var str:String = number.toString()
    println(str+1) // 121  applied concatenation


}