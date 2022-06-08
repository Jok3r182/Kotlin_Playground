package com.example.kotlin_playground.basics

fun main(){
    val range = 1..10
    val reverseRange = 10 downTo 1

    for (i in reverseRange) {
        println(i)
    }
    println()
    for (i in reverseRange step 2) {
        println(i)
    }

    exploreWhile()
    exploreDoWhile()
}

fun exploreWhile(){
    println()
    var x = 1
    while(x < 5){
        println(x)
        x++
    }
}

fun exploreDoWhile(){

    var i = 0
    do {
        println("Hallo")
        i++
    }
    while (i < 5)

}