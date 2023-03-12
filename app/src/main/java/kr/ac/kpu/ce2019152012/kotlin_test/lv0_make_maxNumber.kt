package kr.ac.kpu.ce2019152012.kotlin_test

fun main(args:Array<String>){
    val num = intArrayOf(1,2,3,6,4,5)

    // 첫 번째 풀이
    println(num.sorted().last())
    val num2 = num.sorted().slice(0..num.size-2).last()
    println(num2)

    // 두 번째 풀이
    val num3 = num.sorted().last()
    val num4 = num.sorted().slice(0 until num.size-1).last()
    println(num3 * num4)


    // 다른 사람 풀이
    println(num.sorted().takeLast(2).fold(1){it, acc -> it * acc})

}