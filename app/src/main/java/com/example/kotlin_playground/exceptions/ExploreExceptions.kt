package com.example.kotlin_playground.exceptions

import java.lang.Exception
import java.lang.RuntimeException


fun main(){

    println(nameLength("Matt"))
    nameLength(null)
    returnNothing()
}

fun nameLength(name:String?): Int? {
    return try {
        name!!.length
    }catch (e: Exception){
        println("Exception $e")
        null
    }
}

fun returnNothing(){ //throw exception

    throw RuntimeException("Exception")

}