package com.example.kotlin_playground.collections

fun main(){
    val names = listOf("Alex", "Ben", "Chloe") // immutable collection we cant add elements to it
    println(names)
    val namesMutable = mutableListOf("Matt")
    namesMutable.add("Adam")
    println(namesMutable)
    val set = setOf("Alex", "Ben", "Chloe") //immutable
    val mutableSet = mutableSetOf("Adam", "James", "Ben")
    println(mutableSet)
    val map = mapOf("Matt" to 22)
    val mutableMap = mutableMapOf("Matt" to 22, "Alex" to 19)
    mutableMap["James"] = 55
    println(mutableMap)
}