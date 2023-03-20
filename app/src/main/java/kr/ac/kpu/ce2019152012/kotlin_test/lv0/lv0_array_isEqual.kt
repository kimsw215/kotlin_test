package kr.ac.kpu.ce2019152012.kotlin_test.lv0

fun main(args:Array<String>){
    // 두 배열이 얼마나 유사한지 확인해보려고 합니다.
    // 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
    val arr1 = arrayListOf<String>("a","b","c")
    val arr2 = arrayListOf<String>("com", "b", "d", "p", "c")

    var cnt1 = 0
    for(i in arr1){
        if(arr2.contains(i)) cnt1++
    }

    println("cnt1: $cnt1")



}