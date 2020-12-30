package org.techtown.kotlinexample

fun main(){
    // <map> (key , value)
    var map1 = mapOf(Pair("name","senti")) //수정 불가능
    var map2 = mutableMapOf<String,String>() //수정 가능
        map2.put("name","msenti")
        map2.put("age","1")

    for(map in map1){
        println(map)}

    for(map in map2){
        println(map)
        println(map.key) //
    }


}