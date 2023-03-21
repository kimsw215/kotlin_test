package kr.ac.kpu.ce2019152012.kotlin_test.lv0

fun main(args:Array<String>){
    // 문자열 배열 strlist가 매개변수로 주어집니다.
    // strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
    val arr : Array<String> = arrayOf("We", "are", "the", "world!")
    println(arr.map { it.length }.toIntArray())

}