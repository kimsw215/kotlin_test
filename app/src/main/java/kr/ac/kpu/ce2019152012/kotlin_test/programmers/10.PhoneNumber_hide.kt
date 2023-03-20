package kr.ac.kpu.ce2019152012.kotlin_test
fun main(args:Array<String>) {
    /*
프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때
고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때,
전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
    */
  /* 1번 폰 번호의 길이를 받아와서 끝 네자리를 제외한 나머지 자리를 for문 반복해서 * 붙이고
   뒤에 폰 번호 뒷 자리 붙이기
   */
    /*2번 리스트로 변환 후 인덱스로 값 바꿔주고 스트링으로 출력
    */
    val phone = "01011112222"
    var char = ""
    for(i in 0 until phone.length-4){
        char += "*"
    }
    println(char.padStart(phone.length-4,'*'))
    println(phone.takeLast(4))

    println(phone.substring(phone.length-4,phone.length))
    println(char + phone.takeLast(4))
    println(char + phone.substring(phone.length-4,phone.length)) // 이놈이 속도 더 빠름


}

