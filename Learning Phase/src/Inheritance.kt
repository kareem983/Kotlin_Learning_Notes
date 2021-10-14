
//SuberClass
//open means that this class available for extension (inheritance)
//why we make open class, because by default the class is final
open class Operations{

    fun sum(n1:Double, n2:Double):Double{
        return n1 + n2
    }

    fun sub(n1:Double, n2:Double):Double{
        return n1 - n2
    }

}


//inheritance (SubClass)
class MultiOperations () : Operations(){

    fun mul(n1:Double, n2:Double):Double{
        return n1 * n2
    }

    fun div(n1:Double, n2:Double):Double{
        return n1 / n2
    }

}


fun main(args:Array<String>){

    val task = MultiOperations()
    println(task.sum(5.0, 2.0))
    println(task.mul(5.0, 2.0))


}