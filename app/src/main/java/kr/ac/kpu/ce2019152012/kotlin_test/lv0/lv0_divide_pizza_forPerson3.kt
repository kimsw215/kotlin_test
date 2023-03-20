package kr.ac.kpu.ce2019152012.kotlin_test

fun main(args:Array<String>){
    val slice = 7
    val n = 10
    var num = 1
    while((slice * num) / n != 1) num ++
    println("총 피자의 판수: $num")
}