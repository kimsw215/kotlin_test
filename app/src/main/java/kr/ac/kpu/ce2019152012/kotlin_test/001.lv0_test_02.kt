package kr.ac.kpu.ce2019152012.kotlin_test
fun main(args:Array<String>) {
    val arr = intArrayOf(149,180,192,170)
    var num = 167
    var aw = 0
    arr.forEach {
        if(it>num) aw++
    }
    println(aw)

}

