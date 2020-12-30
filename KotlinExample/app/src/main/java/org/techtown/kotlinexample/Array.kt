package org.techtown.kotlinexample

fun main(){
    // 1. 배열
    // 2. 반복
    // 3. 캐스팅

    // 1. 배열
    var arr1 = listOf("1","2","3")      // 넣고 빼기의 수정 "불가능"
    var arr2 = mutableListOf("1","2")   // 넣고 빼기의 수정 "가능"

    // 2. 반복문 (= 향상된 for문)
    for (item in arr1){
        println(item)
    }

    //2-1. 인덱스 번호도 같이 출력 반복문
    for ((index, item) in arr1.withIndex()){
        println("$index $item")

    }

    //3.casting
    var hello: Any = "hello"
    if(hello is String){
        var str: String =hello
    }





}
