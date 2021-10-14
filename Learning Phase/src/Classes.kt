
// class with type 1 of constructor (secondry constructor)
class Student{
    // if there are init and default constructor the init called first then the default constructor
    // if there are init and parametrised constructor the init called first then the parametrised constructor
    var Name:String?=null
    var Age:Int?=null
    var GPA:Double?=null
    var AcademicMail:String?=null

    //Default constructor
    constructor(){
        println("Default Constructor")
    }

    init {
        println("init")
    }

    //parameterised constructor
    constructor(Name:String, Age:Int, GPA:Double, AcademicMail:String){
        println("parameterised constructor")
        this.Name = Name
        this.Age = Age
        this.GPA = GPA
        this.AcademicMail = AcademicMail
    }


    fun GetAge():Int?{
        return this.Age!! //!! Null Safety That means if the age is null make an exception
    }

}




// class with type 2 of constructor (primary constructor)
// if we make a constructor in the class declaration, can't make any  constructor in the class (default or parametrised)
class Car(Type:String, Model:Int, Price:Double, Owner:String){ //Constructor
    var Type:String?= null
    var Model:Int?= null
    var Price:Double?= null
    var Owner:String?= null


    // init function is called automatically when make an instance from this class
    init {
        this.Type = Type
        this.Model = Model
        this.Price = Price
        this.Owner = Owner
        println("Car Model: "+this.Model)
    }

    fun GetPrice(): Double?{
       return this.Price
   }

   fun GetOwner():String?{
       return this.Owner
   }

}

fun main(args: Array<String>) {
    //make an instance from the class
    val car1 = Car("Volvo", 2005, 1500.5, "Kareem")
    val std1 = Student("Kareem", 21, 3.4, "karim@gmail.com")
    val std2 = Student()
}
