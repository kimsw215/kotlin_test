package kr.ac.kpu.ce2019152012.kotlin_test

import kotlin.math.*

fun main(args:Array<String>) {
    /*
    임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
    n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고,
     n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
    */
    var answer: Long = 144
    var no: Int
    for (i in 1..answer) {
        if (i.toDouble().pow(2) == answer.toDouble()) println("정수")
        else no = -1
    }
}

