fun main() {
    var name: String? = null
    //name="vineet"
    //println(name.uppercase())
    //println("$name".uppercase())

    println(name?.uppercase()) //null safe operator
    //println(name!!.uppercase()) //not null assertion operator => sure way to get npe

    var address = null
    // address = "St" //error as now address is of type nothing

//    var x: Int? = 7
//    x=null
}