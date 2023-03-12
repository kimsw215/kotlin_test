package kr.ac.kpu.ce2019152012.kotlin_test

import kotlin.math.*

fun main(args:Array<String>) {
    var n = 1234
    var size = n.toString().length
    println(n)

    for (i in size-1 downTo 0){
        println("${(n  / (10.0).pow(i)).toInt()}")
    }

}
