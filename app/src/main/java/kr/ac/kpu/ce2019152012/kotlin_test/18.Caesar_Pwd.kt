package kr.ac.kpu.ce2019152012.kotlin_test

fun main(args:Array<String>) {
    val s = "ab cz" // 25개
    val ss = "x" // x = 120 // 120 + 4 = 124  -> 98로 가야됨
    // 124(ss[0]+n) - 122 -1 + 97
    var n = 4
    var sar = ""
    println(ss[0]+n-123+97)
    if(ss[0]+n >'z') println(ss[0]+n-123+97)

    for(i in 0 until s.length) println(i)

    /*for(i in 0 until s.length) {
        if(s[i] == ' ') sar += ' '
        else if((s[i]+n).toInt() > 90 ) sar += (65 + (s[i]+n).toInt() - 90).toString()
        else sar += (s[i]+4)
    }*/
    println(sar)

}