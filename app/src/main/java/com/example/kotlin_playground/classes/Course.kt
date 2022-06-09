package com.example.kotlin_playground.classes

data class Course(val id: Int, val name: String, val author: String, var courseCategory: CourseCategory = CourseCategory.DEVELOPMENT) { //complete idea how object looks, equality doesnt work without data class, copy operation data

}//data container

enum class CourseCategory{
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

fun main(){
    val course = Course(1, "Reactive programming!", "Matthew")
    val courseCopy = course.copy(name = "Matt")
    val marketingCourse = Course(1, "Reactive programming!", "Matthew", CourseCategory.MARKETING)
    println(marketingCourse)
}

