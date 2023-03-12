package kr.ac.kpu.ce2019152012.kotlin_test
fun main(args:Array<String>) {

    var ar1 = intArrayOf(1,2,3,4)
    var ar2 = booleanArrayOf(true,false,true,false)
    println(ar1.toList())
    println(ar2.toList())

    var arr = ArrayList<Int>()
    for(i in 0 until ar2.size){
        if(ar2[i]){
            arr.add(ar1[i])
        } else arr.add(-ar1[i])
    }
    println(arr)
    println(arr.sum())
}

