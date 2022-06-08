package com.example.kotlin_playground.functions

//across the project
const val courseName = "Kotlin programming"

fun topLevel() : Int{
    return (0..100).random()
}

fun main(){
    val num = topLevel()
    println(num)
}

