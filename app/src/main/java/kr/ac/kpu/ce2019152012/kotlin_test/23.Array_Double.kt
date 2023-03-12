package kr.ac.kpu.ce2019152012.kotlin_test.`21`

fun main(args: Array<String>){
    val answer: IntArray = intArrayOf(1,2,3,4,5)
    answer.map { it*2 }
    println(answer.toList())
    val mut = mutableListOf<Int>()
    answer.forEach {
//        mut.add(it*2)
    }
    println(mut.toIntArray())

}