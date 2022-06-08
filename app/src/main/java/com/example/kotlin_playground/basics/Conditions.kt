package com.example.kotlin_playground.basics

fun main() {

    val name = "Alex"
    val result = if (name.length == 4) {
        println("Name is 4 char")
        false //return
    } else {
        println("Name is not 4 char")
        true
    }

    val position = 1
    val medal = when (position) {
        1 -> "Gold"
        2 -> "Silver"
        3 -> "Bronze"
        else -> "No medal"
    }
    println(medal)
}