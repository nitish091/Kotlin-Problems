//import java.util.Scanner

fun main(){
    //val reader = Scanner( System.`in` )
    val( N1, N2 ) = readInts()
    //N1 = read Ints
    //N2 = reader.nextInt()
    println( solve( N1, N2 ) )
}

fun readInts() = readLine()!!.split(' ').map{ it.toInt() }
fun solve( N1: Int, N2: Int ): Int{
    return  if( N1 > N2 )   ( N1 - N2 )
            else ( N1 + N2 )
}