package kr.ac.kpu.ce2019152012.kotlin_test
fun main(args:Array<String>) {

    var str = "aAb1B2cC34oOp"
    var str2 = "0123456789"
    var sum:Int = 0
    for(i in str2) println(str.length) // 0~9 : 48~57
    for (i in str) { // 49~57
        if(49 <= i.toInt() && i.toInt() <= 57) sum += i.toString().toInt()
    }
    println(sum)

}

