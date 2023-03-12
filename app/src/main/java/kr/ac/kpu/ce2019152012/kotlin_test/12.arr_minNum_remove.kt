package kr.ac.kpu.ce2019152012.kotlin_test
fun main(args:Array<String>) {

    var arr = ArrayList<Int>()
    for(i in 0..4) arr.add(i)

    println("arr 원형: " + arr)
    println("arr 내림차순: " + arr.reversed())
    println(arr.min())


}

