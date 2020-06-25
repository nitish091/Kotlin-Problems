import java.util.Scanner

fun main( args: Array< String > ){
    val reader = Scanner( System.`in` )
    var N: Int = reader.nextInt()
    if( N % 4 == 0 ) N++
    else N--
    println( N )
}