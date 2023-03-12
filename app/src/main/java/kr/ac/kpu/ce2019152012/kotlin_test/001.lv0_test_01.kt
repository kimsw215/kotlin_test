package kr.ac.kpu.ce2019152012.kotlin_test
fun main(args:Array<String>) {
    val arr = intArrayOf(1,1,2,3)
    var cnt = 0
    var findnum = 1
    for(i in arr){
        if(i == findnum) cnt++
    }
    arr.forEach {
        if(it == findnum) cnt++
    }

    println("if 방법: "+cnt)
    println("foreach 방법: "+cnt)

}

