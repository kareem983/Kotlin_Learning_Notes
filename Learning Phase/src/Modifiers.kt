
class Client{
    //Access Modifier is public by default
    /*
    public (anyWhere, default)
    private (In Class Only)
    protected (in their own class and SupClasses)
    */
    
    var Name:String?=null
    var Age:Int?=null
    var CreditCardNo:String?=null

    constructor(Name:String, Age:Int, CreditCardNo:String){
        this.Name = Name
        this.Age = Age
        this.CreditCardNo = CreditCardNo
    }

    private fun GetAge():Int?{
        return this.Age
    }

    public fun GetCreditNo():String?{
        return this.CreditCardNo
    }

}

fun main(args:Array<String>){

    var cl1 = Client("Kareem", 15, "654654")
    //cl1.GetAge()   this is InValid, because this function is private
    println("Credit Card Number: "+cl1.GetCreditNo()) // this is valid

}