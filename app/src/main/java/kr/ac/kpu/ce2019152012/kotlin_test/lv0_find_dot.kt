package kr.ac.kpu.ce2019152012.kotlin_test

fun main() {
    val num = intArrayOf(2,-3)
    if(num[0] > 0 && num[1] > 0) println("1사분면")
    else if(num[0] < 0 && num[1] > 0) println("2사분면")
    else if(num[0] < 0 && num[1] < 0) println("3사분면")
    else println("4사분면")
}