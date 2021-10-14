import java.lang.Exception

// Thread Class make MyThread Class work in parallel in the other Thread
class MyThread: Thread{
    var processName:String?= null
    constructor(processName:String?):super(){
        this.processName = processName
    }

    //run method work in parallel
    override fun run() {
        var count = 0
        while(count<10){
            println("${this.processName} Thread count $count")
            try {
                Thread.sleep(1000)
            }
            catch (ex:Exception){println(ex.message)}

            count++
        }
    }


}


fun main(args:Array<String>){

    //this three thread working parallel
    var th1 = MyThread("Thread1")
    th1.start()

    var th2 = MyThread("Thread2")
    th2.start()

    //th2.join()

    var th3 = MyThread("Thread3")
    th3.start()

    //th3.join() // join method stop continue the code till the thread number three finish

    println("Threads is running")

}
