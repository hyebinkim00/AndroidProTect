package org.techtown.kotlinexample

fun main(){

    var cls = HelloClass()
    var cls2 = HelloClass(1)
    println(cls2.age)
    var person = Person(1,"Senti")
    println(person.age)
}

class HelloClass{
    var age : Int =0
    init {

    }

    constructor() //기본 생성자 (값을 넘기지는 못 하 지만 초기화 가능)
    constructor(age: Int) {//보조 생성자 (값을 넘기면서 초기화 가능)
        this.age= age
    }
}

data class Person(var age: Int, val name : String )