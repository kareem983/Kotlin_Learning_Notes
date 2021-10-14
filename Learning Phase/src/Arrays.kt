
fun main(args:Array<String>) {

    // Array with size 5 and initial value 0
    var arrInt = Array<Int>(5){0}

    // array with fixed size and initial data
    var strArr = arrayOf("Kareem", "Mohamed", "Amr", "Khaled")

    //this three types of iteration around array items

    //iterate around array items with fixed constrains
    for(index in 0..4){
        println("Loop1 "+arrInt[index])
    }

    //iterate around array items with fixed constrains
    for(index in 0..arrInt.size-1){
        println("Loop2 "+arrInt[index])
    }


    //iterate around array items
    for(index in strArr){
        println("Loop3 "+index)
    }


    //access elements
    var arr = arrayOf(1, 2, 3, 4, 5, 6)
    arr[2] = 9

    for(index in arr){
        println("Loop4 "+index)
    }


    //input array with loops
    println("Enter Names")
    var arr1 = Array<String>(5){""}
    for(index in 0.. arr1.size-1){
        arr1[index] = readLine()!!.toString()
    }

    println("Your Names")
    for(index in arr1){
        println("Name: "+index)
    }


}