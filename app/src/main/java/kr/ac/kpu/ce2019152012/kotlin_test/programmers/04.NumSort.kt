package kr.ac.kpu.ce2019152012.kotlin_test

fun main(args:Array<String>) {

    /*
    함수 solution은 정수 n을 매개변수로 입력받습니다.
    n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
    예를들어 n이 118372면 873211을 리턴하면 됩니다.*/

    val num:Long = 118327
    var st = ""
    var ar1 = num.toString().map { it.toString().toInt() }
    println(ar1.sorted())
//    for(i in ar1.sorted().reversed()) st += i
    for(i in ar1.sortedDescending()) st += i
    println(st)





}

