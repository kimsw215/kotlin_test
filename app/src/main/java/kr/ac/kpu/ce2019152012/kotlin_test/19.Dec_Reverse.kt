package kr.ac.kpu.ce2019152012.kotlin_test

fun main(args:Array<String>) {
    val n10 = 45 // 10진법
    var n3 = n10.toString(3)

    println(n10.toString(3))
    println(n3.reversed().toInt(3))
    val asw = n3.reversed().toInt(3)

    println(asw)

    // n.toString(k) 로 변환 할 수 있음
    // n이 변환하려는 수, k는 진법의 수
}