
fun main(args:Array<String>) {

    //ArrayList is implemented with linked list data structures
    //this is without determine the size
    var arr = ArrayList<String>()
    arr.add("Kareem")
    arr.add("Mohamed")
    arr.add("Khaled")
    arr.add("aly")

    for(item in arr){
        println(item)
    }

    //set function when need to update the value in specific index
    arr.set(1, "Saeed")  //arr[1] = "Saeed" this is equal to set function
    println(arr[1]) //Saeed


    //search (Two types of search are available)
    if("Saeed" in arr){
        println("Saeed is Available")
    }
    if(arr.contains("Saeed")){
        println("Saeed is Available")
    }

}