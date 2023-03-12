package kr.ac.kpu.ce2019152012.kotlin_test

sealed class Cafe {
    class Americano(val name: String, val price: Int, val coffee: String): Cafe()
    class Latte(val name: String, val price: Int, val milk: String): Cafe()
    class GrainLatte(val name: String, val price: Int, val sugar: Int): Cafe()
}

fun order(e: Cafe) =
    when(e) {
        is Cafe.Americano -> "주문 하신 음료는${e.name}입니다. 가격은 ${e.price}이고, 원두는 ${e.coffee} 입니다."
        is Cafe.Latte -> "주문 하신 음료는${e.name}입니다. 가격은 ${e.price}이고, 우유는 ${e.milk} 입니다."
        is Cafe.GrainLatte -> "주문 하신 음료는${e.name}입니다. 가격은 ${e.price}이고, 당도는 ${e.sugar} 입니다."
    }

fun main(args:Array<String>) {
    val order = Cafe.Americano("아이스 아메리카노",4000,"스벅")
    println(order(order))
    val order1 = order(Cafe.Americano("아이스 아메리카노",4000,"스벅"))
    println(order1)
    val order2 = order(Cafe.Latte("아이스 바닐라 라떼",4500,"엔젤인어스"))
    println(order2)
    val order3 = order(Cafe.GrainLatte("오곡라떼",5000,5))
    println(order3)
}