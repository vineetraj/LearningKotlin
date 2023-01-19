fun printString(value: String): Unit {
    // value="hello" =>gives error as value is immutable
    // fun printString(var value: String): Unit { will also give same error
    println(value)
    fun funWithin() {
        println("I'm inside another fun")
    }
    funWithin()
}

fun addTwoNums(x: Int, y: Int): Int = x + y //single expn func

fun doSomeMaths(first: Int, second: Int): Int = first - second //named param func

fun addMyNums(x: Int, y: Int = 100): Int = x + y //default value func

fun myNums(x: Int = 200, y: Int = 100): Int = x + y //default+Named value func

//function to convert string to integer

/* Java's lambda
fun methodTakesLambdas(input:String, action:java.util.function.Function<String,Int>){
    println(action.apply(input))
}*/

/*Kotlin's Lambda
fun methodTakesLambdas(input:String, action:(String)->Int) {
    println(action(input))
}*/

fun main(args: Array<String>) {
    printString("Hello World")
    println(addTwoNums(2, 3))  //single expn func
    println(doSomeMaths(second = 56, first = 24))//named parameters
    println(addMyNums(5)) //default value func
    println(myNums(y = 50)) //default+Named value func
    //printString.funWithin() is wrong
}