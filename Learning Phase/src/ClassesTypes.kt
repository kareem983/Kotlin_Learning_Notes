
//-----------------------Nested Class------------------------------------
//Nested Class is by default static
class OuterA{
    val OuterVar:String = "Outer var"

    class NestedA{
        val InnerVar:String = "Inner var"
        fun WelcomeInner(){
            println("Welcome Inner Method")
        }

    }

}
//-----------------------------------------------------------------------


//-----------------------Inner Class------------------------------------
class OuterB{
   val OuterVar:String = "Outer var"

   //inner means that the inner class can access the data of the outer class
   inner class InnerB{
       val InnerVar:String = "Inner var"
       fun WelcomeInner(){
           println("Welcome Inner Method")
       }

       fun WelcomeOuerFromInner(){
            println("Welcome to Outer Variable $OuterVar From Inner Method")
        }

    }

}
//-----------------------------------------------------------------------


//-----------------------Data Class------------------------------------
//data class must have primary constructor and the constructor must have one parameter at least
data class Person(var Name:String, var Age:Int){
    /*data class provide all implementation method that you need to use it such as:
        .copy()
        .equals()
        .hashCode()
        ,etc....
    */
}
//-----------------------------------------------------------------------


//-----------------------Enum Class------------------------------------
//enum class means, there are some options that select one of them
enum class StudentState{
    Excellence,
    VeryGood,
    Good,
    Fail
}
//-----------------------------------------------------------------------



fun main(args:Array<String>){
    //-------Nested Class--------------
    val outerA = OuterA()
    println(outerA.OuterVar)  //Outer var

    val innerA = OuterA.NestedA()
    println(innerA.InnerVar) //inner var
    innerA.WelcomeInner()    //Welcome Inner Method
    //---------------------------------



    //-------Inner Class--------------
    val outerB = OuterB()
    println(outerB.OuterVar)  //Outer var

    val innerB = OuterB().InnerB()
    innerB.WelcomeInner()  //Welcome Inner Method
    innerB.WelcomeOuerFromInner()  //Welcome to Outer Variable Outer var From Inner Method
    //---------------------------------



    //-------Data Class--------------
    val person1 = Person("Kareem", 21)
    val person2 = Person("Kareem", 21)
    if(person1.equals(person2)) println("Equals") //Equals
    //---------------------------------


    //-------Enum Class--------------
    val stdGrade1 = StudentState.Excellence
    val stdGrade2 = StudentState.Fail
    println(stdGrade1) //Excellence
    println(stdGrade2) //Fail
    //---------------------------------




}