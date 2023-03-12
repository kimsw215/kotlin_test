package kr.ac.kpu.ce2019152012.kotlin_test

fun main(args:Array<String>) {

    /*
    함수 solution은 정수 x와 자연수 n을 입력 받아,
    x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
    다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
    */

    val firstNum = 2 // 초기 값
    val range: Int = 5 // n개를 나열

    val answer = mutableListOf<Long>()
    for(i in 1..range) answer.add(firstNum.toLong() * i)
    println("mutableListof: "+answer)
    println("JoinToString: "+answer.joinToString(""))
    println("toLongArray:  "+answer.toLongArray().toList())

}

