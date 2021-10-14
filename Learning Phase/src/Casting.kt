
//SuberClass
open class Opera{

    open fun sum(n1:Double, n2:Double):Double{
        return n1 + n2
    }

    open fun sub(n1:Double, n2:Double):Double{
        return n1 - n2
    }

    fun AddTWO(n1:Double, n2:Double):Double{
        return (n1 + n2) *2
    }

}


//inheritance (SubClass)
class MultiOpera () : Opera(){

    fun mul(n1:Double, n2:Double):Double{
        return n1 * n2
    }

    fun div(n1:Double, n2:Double):Double{
        return n1 / n2
    }

    override fun sum(n1:Double, n2:Double):Double{
        return (n1 + n2 ) *5
    }

    override fun sub(n1:Double, n2:Double):Double{
        return (n1 - n2 ) *5
    }
}


fun main(args:Array<String>){

    val Multask = Opera()
    println(Multask.sum(5.0, 2.0)) //7
    println(Multask.sub(5.0, 2.0)) //3
    println(Multask.AddTWO(5.0, 2.0)) //14

    //in uoCasting All methods that Elly et3mlohm override The override implementation will work
    val Mulllltask = MultiOpera() as Opera  //upCasting
    println(Mulllltask.sum(5.0, 2.0)) //35
    println(Mulllltask.sub(5.0, 2.0)) //15
    println(Mulllltask.AddTWO(5.0, 2.0)) //14   //the opera function worked because doesn't overrided

}