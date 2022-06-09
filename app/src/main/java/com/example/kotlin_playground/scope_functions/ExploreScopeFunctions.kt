package com.example.kotlin_playground.scope_functions

import com.example.kotlin_playground.classes.Course
import com.example.kotlin_playground.classes.CourseCategory

fun main() {
    exploreApply()
    exploreLet()
}

fun exploreApply() {
    val course = Course(1, "Reactive programming!", "Matthew") //apply for configuring the object change value ir pns
    course.apply { courseCategory = CourseCategory.DESIGN } //arba this.courseCategory, also side effect needs to be executed after the object is constructed, you can chain multiple scope functions
    println(course)
}

fun exploreLet(){
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    val result = numbers.map { it*2 }.filter { it>5 }
    println(result) //without scope function

    numbers.map { it*2 }.filter { it>5 }.let { println(it)
        it.sum()} //with scope function, final statement in your code
}

fun exploreWith(){ //with is non extension, functions on top of collection without extension
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    with(numbers){
        plus(6)
        sum()
    }
    println(numbers)

}

fun exploreRun(){
    var numbers:MutableList<Int>? = null
    numbers.run { //init and compute
        numbers = mutableListOf(1, 2, 3, 4, 5)
        numbers?.sum()
    }

    val length = run{
        val name = "Matt"
        println(name)
        name.length
    }
    println(length)
}