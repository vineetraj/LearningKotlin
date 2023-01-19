import java.math.BigDecimal
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    val name = "vineet"
    val name1 = "raj"
    println("Hello your \$name is $name $name1")

    val story = """hejijij
        |bnh tn
        |bh tnfb
        |fdbnhgtn
    """.trimMargin("|") //note a new string gets created here
    println(story)

    val newStory = story.replace("tn", "xxx")
    println(newStory)

    val myDouble = 21.45

    println("myDouble is Double ? ${myDouble is Double}") //to check an obj data type
    println("my double is of type ${myDouble::class.qualifiedName}") //to know the data type
    //kotlin doesn't have primitive type.. it has classes as obj wrapper for primitives
    println("myDouble's data type is ${myDouble.javaClass}") //kotlin double is compiled to java double


    val myInt = myDouble.roundToInt()
    println("myInteger is a ${myInt::class.qualifiedName}")
    // NOTE: val anotherInt :Integer = 17 //it won't work as 17 is of type kotlin.Int
    val nextInt: Int = 17

    val bd: BigDecimal = BigDecimal(56)

    val bd2: BigDecimal
    //println("absolute value of BD is ${bd2.abs()}")

    bd2 = bd.add(BigDecimal(30.5))
    println("$bd2")

}
