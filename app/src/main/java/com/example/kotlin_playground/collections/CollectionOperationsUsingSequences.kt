package com.example.kotlin_playground.collections

import com.example.kotlin_playground.dataset.Course
import com.example.kotlin_playground.dataset.CourseCategory
import com.example.kotlin_playground.dataset.courseList

//as sequence one by one processing, when not sequence its is processed all instantly, sequence used
//for big collections

fun main(){

   val namesListUsingSequence = listOf("Alex", "Matt").asSequence().filter { it.length >=4 }.map { it.uppercase() }.toList() //toList is mandatory
    println(namesListUsingSequence)
    val devPredicate = { c:Course -> c.category == CourseCategory.DEVELOPEMENT}
    explore(courseList(), devPredicate)

    val range = 1..1000000000 //sequence faster
    range.asSequence().take(5).map { it.toDouble() }.forEach{ println(it) } //with for each you dont need toList
    //with take you set how many first occured elements to process
}

fun explore(courseList: MutableList<Course>, predicate:(Course)->Boolean){
    val filteredCourses = courseList.asSequence().filter { predicate.invoke(it)} //use predicate
        .forEach{ println("Courses $it" )}//usage with lambda
}