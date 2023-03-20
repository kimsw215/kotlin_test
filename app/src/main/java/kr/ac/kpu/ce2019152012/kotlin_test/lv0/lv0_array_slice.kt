package kr.ac.kpu.ce2019152012.kotlin_test.lv0

fun main(args:Array<String>){
    //정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
    // numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
    val arr = intArrayOf(1,2,3,4,5)


    // 밑에 2개는 같은 방식으로 추출
    println(arr.slice(2..3).toIntArray().toList())
    println(arr.sliceArray(2..3).toList())

    println(arr.copyOfRange(2,4).toList()) // 이건 until 처럼 사용됨

}