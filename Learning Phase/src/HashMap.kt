
fun main(args:Array<String>) {

    //HashMap is a data structures that use Key and Value

    var map = HashMap<Int, String>()
    map.put(1, "Kareem")
    map.put(2, "Mohamed")
    map.put(9, "aly")
    map.put(10, "Khaled")
    map.put(11, "Amr")

    println(map[9]) //aly     map.get(9) is the same as map[9]

    map[11]="Omar" // map.put(11, "Omar") is the same
    println(map[11]) //Omar

    //iterate
    for(keys in map.keys){
        println("Key $keys and it's value ${map[keys]}")
    }

    for(values in map.values){
        println(values)
    }

}
