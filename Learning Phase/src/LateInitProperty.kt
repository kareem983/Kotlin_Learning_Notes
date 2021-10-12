
fun main(args:Array<String>){

    /*lateinit property:
      1- doesn't need initial value, lateinit means that will initialize the variable later
      2- initialized automatically by null
      3- lateinit var tmp:String  (it Equals)  var tmp:String?=null
      4- you must assign value to the lateinit variable before using it
      5- it deal as !!(Null safety) that mean will make an exception and stop execution
     */

    lateinit var tmp:String
    //println(tmp)       -> make an exception, because deal as !!
    //println(tmp!!)     -> make an exception and stop execution

    tmp = "Kareem"
    println(tmp)         //Kareem

}
