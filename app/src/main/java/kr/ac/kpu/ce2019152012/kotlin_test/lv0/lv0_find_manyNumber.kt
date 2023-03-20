package kr.ac.kpu.ce2019152012.kotlin_test

fun main() {
    val num = intArrayOf(2,2,1,2,3,3,3,4)
    val mut = mutableListOf<Int>()
    var cnt = 0 // 중복 처리

    for(i in num.iterator()) mut.add(i)

    val keyOfmax = mut.groupingBy { it }.eachCount().maxByOrNull { it.value }!!.key // 최빈값의 키: 3
    val ValueOfmax = mut.groupingBy { it }.eachCount().maxByOrNull { it.value }!!.value // 최빈값의밸류: 3

    var arr = mut.groupingBy { it }.eachCount().toList()
    println("arr: ${arr.javaClass} , max를 가지는 key 값: $keyOfmax, value: ${ValueOfmax}")

    for( (k,v) in arr) if(ValueOfmax == v) cnt++

    println("cnt: $cnt")

    val b = if(arr.size >= 1 && cnt != 1) -1  else keyOfmax
//arr[0].second == arr[1].second
    println(b)

}