package com.erickcode.androidfirst

fun main(){
    var name:String? = "Erick"


//    println(name!![3])
    println(name?.get(3) ?: "Es null" )

}
