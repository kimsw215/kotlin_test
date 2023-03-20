package kr.ac.kpu.ce2019152012.kotlin_test

fun main(args:Array<String>) {
    val s = "try hello world"
    val arrS = mutableListOf<String>()
    var chaneString = ""
    println(s.split(' '))
    /*for(i in 0 until s.length){
        if(i % 2 == 0) chaneString += s[i].toUpperCase() else chaneString += s[i].toLowerCase()
    }
    println(chaneString)*/
}