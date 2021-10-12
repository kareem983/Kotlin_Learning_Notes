
fun main(args:Array<String>){
    // for loop repeat the body number of times

    //this loop repeat the body 6 times with initial value 0 and final value 5
    for(cnt in 0..5){
        println("Hello $cnt")
    }

    //this loop break when the condition applied when the cnt equal 3
    for(cnt in 1..5){
        if(cnt == 3){
            break
        }
        println("$cnt without breaking")
    }


    //this loop will skip the body when the condition applied then continue their work
    for(count in 1..5){
        if(count == 2){
            continue
        }
        println("$count without continue")
    }


   //ExitLoop@ this is label that the break go to it
   ExitLoop@
   for(counter1 in 1..10) {
        println("OuterLoop $counter1")
        for (counter2 in 1..5) {
            println("InnerLoop $counter2")
            if (counter2 == 3) {
                break@ExitLoop
            }
        }
    }

}