//version 1
data class Customer(
    val name: String,
    var address: String,
    val age: Int
) {
    constructor(name: String, age: Int) : this(name, "", age) { //sec constructor
        println("secondary constructor")
    }

    init {
        println("Init block")
    }
}

//version 2
class AltCustomer(val name: String, var age: Int) {
    var address: String = ""

    init {
        address = "Larua"
    }

    constructor(name: String, address: String, age: Int) : this(name, age) {
        this.address = address
    }

    //everything inside this block will be static
    companion object{
        fun getInstance() = AltCustomer("Vikash",29)
    }
    override fun toString() = "$name $address $age" //override the default toString() method
}

//version 3
class AnotherAltCustomer(val name: String, var age: Int, val address: String = "Gomoh") {
    //overriding get & set methods
    var approved: Boolean = false
        //we refer to the field we're setting or getting with the keyword 'field'
        set(value) {
            if (age < 30) {
                field = value //here field refers to approved
            } else
                println("Sorry can't fill form")
        }
    val nextAge
        get() = age + 1

    fun upperCaseName() = name.uppercase()

    override fun toString() = "$name $address $age" //override the default toString() method
}

fun main() {
    //val customer = Customer("Vineet", "Patna", 28)
    //val customer1 = Customer("Raj", 27)
//    customer.address = "Pune"
//    println(customer.address)
//    println("${customer.name} lives in ${customer.address}")
    //println("${customer1.name} age is ${customer1.age}")

    val customer1 = AnotherAltCustomer("Vineet", 28)
    customer1.approved = true

    println("${customer1.name} age is ${customer1.age} can fill form ? ${customer1.approved}")
    val customer2 = AnotherAltCustomer("Waris", 30)
    customer2.approved = true

    println("${customer2} age has ${customer2.age} can fill form ? ${customer2.approved}")
    println("Next year ${customer2.upperCaseName()} will be ${customer2.nextAge} ")

    val customer3 = AltCustomer.getInstance()
    println(customer3)

    val customer4 = Customer("Raju","Jandhaha",27,)
    println(customer4)

    val customer5 = customer4.copy(name = "Asni") //using copy method of data class to change just the name
    println(customer5)

    //destructuring -> gets allocated a/c to order not the name of variables
    val(name, age, add) = customer5 //address is 2nd one so got allocated to age variable here
    println(age)
}
