package com.example.kotlin_playground.functions

import java.time.LocalDate

fun main(){
    printName("Matas")
    val result = additionOtherVersion(1, 2, 3)
    println(result)
    printPersonDetails(email = "email") // name para
}

fun addition(a: Int, b: Int): Int {
    return a + b
}

fun additionOtherVersion(a: Int, b: Int): Int = a + b

fun additionOtherVersion(a: Int, b: Int, c:Int) = a + b + c

fun printName(n:String){
    println("Name is $n")
}

fun printPersonDetails(name: String = "John Doe", email:String="Nothing", dob: LocalDate = LocalDate.now()){
    println("Name is $name, Email is $email, Dob is $dob")
}