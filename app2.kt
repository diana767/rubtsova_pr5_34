import kotlin.math.pow
fun main()
{
    println("введите x")
    var x= readLine()!!.toDouble()
    when
    {
        (x>3)-> println ((-3*x)+9)
        (x<=3)-> println ((x.pow(3))/ (x.pow(2)+8))

    }
}