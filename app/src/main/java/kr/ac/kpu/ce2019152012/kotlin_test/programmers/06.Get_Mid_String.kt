package kr.ac.kpu.ce2019152012.kotlin_test

fun main(args:Array<String>) {

    /*
    단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
    단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
    */
    val s1 = "abcde"
    val s2 = "qwer"
    var str = ""

    if(s1.length % 2 != 0) str = s1[s1.length/2].toString()
    else str = s2[s2.length/2 - 1].toString() + s2[s2.length/2].toString()

    println(str)


}

