package kr.ac.kpu.ce2019152012.kotlin_test

fun main(args:Array<String>) {
    /*val (a, b) = readLine()!!.split(' ').map(String::toInt)
    for(i in 1..b) {
        for(i in 1..a)print("*")
    }*/
    val a = 12
    val b = 3
    if( a >= b) for(i in b downTo 1) {
        println(i)
        if(i == 2) {
            print("멈출게요")
            break}
    }
}