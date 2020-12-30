package org.techtown.kotlinexample

fun main(){
    val hello1: String ="hello world" //fimal
    var hello2: String ="hello world" //int, String, float ,double
    var hello3: String?=null // ?은 null 허용

    println(hello1)
    println(hello2)
    println(hello3)

   println(hello())
}

fun hello(): String { //void 타입  //뒤에 자료형이 붙으면 return값 있음
    return "Hello func"

}
