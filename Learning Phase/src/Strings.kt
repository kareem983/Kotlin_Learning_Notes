
fun main (args:Array<String>){

    //String Properties
    var str:String = "Kareem Saeed"
    println(str.length) //6
    println(str.get(1)) //a
    println(str[2]) //r
    println(str.toUpperCase()) //KAREEM
    println(str.toLowerCase()) //kareem

    // size-1 to get all characters in the string
    for(cnt in 0..str.length-1){
        println("char $cnt ${str[cnt]}")
    }

    //concatenation
    var str1:String = "Software "
    var str2:String = "Engineer"
    var concat = str1 + str2
    println(concat) //Software Engineer

    //trim that delete any empty before string
    var str3 = " Testing Team"
    println(str3.trim()) //Testing Team

    //split that divide string to elements according to param
    var arr = str3.split(" ")
    println(arr)//[, Testing, Team]


    // String with multiple line
    val multiple_Line = """I'm Kareem Saeed
        21 year
    """
    println(multiple_Line)

}