import kotlin.math.sqrt
import java.util.*

fun main() {
    //Ex1
    val myAge:Int=18
    val isTeenager:Boolean = myAge >= 13 && myAge <= 19
    println(isTeenager)

    //Ex2
    val theirAge:Int=30
    val bothTeenagers:Boolean = theirAge >= 13 && theirAge <= 19 && isTeenager
    println(bothTeenagers)

    //Ex3
    val reader:String="Daniil"
    val author:String="Richard Lucas"
    val authorIsReader:Boolean=reader==author
    println(authorIsReader)

    //Ex4
    val readerBeforeAuthor = reader<author
    println(readerBeforeAuthor)
    //Ex5
    val myAge2:Int=18
    if (myAge2>=13&&myAge2<=19)
        println("teen")
    else println("not a teen")

    //Ex6
    val answer = if (myAge2>=13&&myAge2<=19) "teen" else "not a teen"
    println(answer)

    //Ex7
    var counter:Int=0
    while (counter<10)
    {
        println(counter)
        counter+=1
    }
    //Ex8
    counter=0
    var roll:Int=0
    do
    {
        roll= Random().nextInt(6)
        counter+=1
        println ("After $counter strikes, roll is $roll")

    } while (roll!=0)

    //Ex9
    val range = 1..10
    for (i in range)
        println (i*i)

    //Ex10
    for (i in range)
        println(sqrt(i.toDouble()))
    //Ex11
    var sum:Int = 0
    for (row in 1 until 8 step 2)
    {
        for (column in 0 until 8)
        {
            sum += row * column
        }
    }
    println("Result: $sum")
}