package kr.ac.kpu.ce2019152012.kotlin_test.`21`

fun main(args: Array<String>){
    val a = 1
    val b = 2
    val c = 3
    val d = 4

    val g = gcd(d,b)
    val m = d*b / g

    println("분자: ${m/b*a + m/d*c}")
    println("분모: ${m}")

    val answer: IntArray = intArrayOf()
    answer.plus(a)
    println(answer.toList().toIntArray())

}
// 최대 공약수
fun gcd(a: Int, b:Int): Int = if(b != 0) gcd(b, a % b) else a