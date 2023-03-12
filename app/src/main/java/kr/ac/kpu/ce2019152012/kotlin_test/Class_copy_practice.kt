package kr.ac.kpu.ce2019152012.kotlin_test

class Client(val name: String, val code: Int) {
    fun copy(name: String = this.name, code: Int = this.code ) = Client(name,code)
}

fun main(args: Array<String>){
    val kim = Client("승완",2505)
    println(kim)
    println(kim.copy("완승",3510))
}