package com.example.kotlin_playground.classes

data class Course(val id: Int, val name: String, val author: String) { //complete idea how object looks, equality doesnt work without data class, copy operation data

}//data container

fun main(){
    val course = Course(1, "Reactive programming!", "Matthew")
    val courseCopy = course.copy(name = "Matt")
    println(courseCopy)
}