package kr.ac.kpu.ce2019152012.kotlin_test

import kotlin.reflect.typeOf

fun main(args:Array<String>) {

    /*
    array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을
    반환하는 함수, solution을 작성해주세요.
    divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
    */

    val div = 2 // 나눌 수
    val answer = mutableListOf<Int>()
    val arr = intArrayOf(5,9,7,10,2)
    for (i in arr) if(i % div == 0) answer.add(i)
    answer.sort()
    if(answer.isEmpty()) println("비어있음")

    println("결과는 "+ answer)
    println("결과는(정렬) "+ answer.toIntArray().sorted().toIntArray())

}

