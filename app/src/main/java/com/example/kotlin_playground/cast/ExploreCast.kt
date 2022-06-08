package com.example.kotlin_playground.cast

import com.example.kotlin_playground.classes.Course

fun main(){
    val course = Course(1, "Reactive programming!", "Matthew")
    checkType(course)
    castNumber(1.0)

}

private fun castNumber(any: Any){ //casting
    when(any){
        any as Double -> println("Value is double!")
    }
}

private fun checkType(type: Any){ //check type
    when(type){
        is Course -> println("a course!")
        else -> println("Not a course!")
    }
}