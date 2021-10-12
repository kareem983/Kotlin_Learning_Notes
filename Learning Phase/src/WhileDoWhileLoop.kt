
fun main(args:Array<String>){

    //for loop and while loop and do..while loop are equals each others that display numbers from 1 to 5
    for(cnt in 1..5){
        println("cnt number $cnt")
    }


    var count = 1
    while( count < 6){
        println("count number $count")
        count++
    }


    var counter = 1
    do{
        println("counter number $counter")
        counter++
    }while(counter<6)

}