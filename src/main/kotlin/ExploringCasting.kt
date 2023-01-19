import java.math.BigDecimal
import java.util.Random

fun main(args: Array<String>) {
    var result: Any
    val randomNo = Random().nextInt(3)

    if (randomNo == 1)
        result = BigDecimal(37)
    else
        result = "Hello"

    println("Result is currently $result")

    if (result is BigDecimal) //explicit type check like instanceOf in Java
        result = result.add(BigDecimal(40))
    else {
        val tempRes = result as String //cast result to String type from Any type
        result = tempRes.uppercase()
    }
    println("Now the result is $result")
}
