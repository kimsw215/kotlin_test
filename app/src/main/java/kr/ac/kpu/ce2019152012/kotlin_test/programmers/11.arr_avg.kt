package kr.ac.kpu.ce2019152012.kotlin_test
fun main(args:Array<String>) {
//    var arr = intArrayOf(1,2,3,4,5,6,7,8,9,10)
//    println(arr.sum()/arr.size.toDouble())
//    println(arr.indexOf(1))
    var answer: String = ""
    val food = intArrayOf(1, 3, 4, 6, 5, 3, 2, 1)
    val food2 = mutableListOf<Int>()
    val idx = mutableListOf<Int>()

    println("sort"+food.sort())
    println("sorted"+food.sorted())
    println(food.sorted()[2])
    for (i in food) food2.add(i / 2)
    food.filterIndexed { index, i ->
        idx.add(index)
    }
//    println("기본 음식 개수        food : ${food.toList()}")
    println("각자 먹을 음식의 개수  food2: $food2")
    println("먹을 음식 인덱스      index: $idx")

    for (i in idx)
        if (food2[i] != 0) {
            for (j in 0 until food2[i]) answer += idx[i]
        }

    println(answer)
}


