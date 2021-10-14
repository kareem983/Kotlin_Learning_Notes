
//SuberClass
abstract class Task{

    fun sum(n1:Double, n2:Double):Double{
        return n1 + n2
    }

    fun sub(n1:Double, n2:Double):Double{
        return n1 - n2
    }

    //open because we override it in the subclass
    open fun addThree(n1:Double, n2:Double, n3:Double):Double{
        return n1+n2+n3
    }

    //abstract method mustn't have implementation
    abstract fun addFour(n1:Double, n2:Double, n3:Double, n4:Double):Double

}


//inheritance (SubClass)
class MultiTasks () : Task(){

    fun mul(n1:Double, n2:Double):Double{
        return n1 * n2
    }

    fun div(n1:Double, n2:Double):Double{
        return n1 / n2
    }

    //this override method from the parent class
    override fun addThree(n1:Double, n2:Double, n3:Double):Double{
        // super.addThree(n1, n2, n3)    suber.FUNCTIONNAME call the parent
        return (n1+n2+n3) * 5
    }

    //this override method for abstract method from the parent
    override fun addFour(n1:Double, n2:Double, n3:Double, n4:Double):Double{
        return (n1+n2+n3+n4) *2
    }


}


fun main(args:Array<String>){

    val MulTask = MultiTasks()
    println(MulTask.sum(5.0, 2.0)) //7
    println(MulTask.sub(5.0, 2.0)) //3
    println(MulTask.mul(5.0, 2.0)) //10
    println(MulTask.addThree(5.0, 2.0, 1.0)) //40
    println(MulTask.addFour(5.0, 2.0, 1.0, 5.0)) //26

}