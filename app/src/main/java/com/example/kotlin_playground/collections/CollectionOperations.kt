package com.example.kotlin_playground.collections

import com.example.kotlin_playground.dataset.Course
import com.example.kotlin_playground.dataset.CourseCategory
import com.example.kotlin_playground.dataset.KAFKA
import com.example.kotlin_playground.dataset.courseList
import com.example.kotlin_playground.functions.courseName

fun main(){ //filter works like in JS

    val courseList = courseList()
    val devPredicate = { c:Course -> c.category == CourseCategory.DEVELOPEMENT} //create predicate

    //exploreFilter(courseList, devPredicate)
    //exploreMap(courseList, devPredicate)

    val list = listOf(listOf(1, 2, 3), listOf(4, 5, 6))
    val map = list.map{outerList -> outerList.map {
        it.toDouble()
    }}

    val flatList = list.flatMap{outerList -> outerList.map { //concates 2 lists
        it.toDouble()
    }}
    //println(flatList)
    //println(exploreFlatMap(courseList, KAFKA))
    exploreHashMap()
}

fun exploreHashMap(){

    val nameAgeMap = mutableMapOf("Mattas" to 22, "Alex" to 19)
    nameAgeMap.forEach{
        (k,v) -> println("Key $k Value: $v")
    }

    val value = nameAgeMap["Matt"]
    println(value)

    val result = nameAgeMap.getOrElse("Matt5"){"abs"}
    println(result)

    val filter = nameAgeMap.filterKeys { it.length > 5 }
        .map { it.key.uppercase() }

    println(filter)

}

fun exploreFlatMap(courseList: MutableList<Course>, type:String): List<String> {
    return courseList.flatMap {course ->
        val courseName = course.name
        course.topicsCovered.filter {
        it == type}.map {
            courseName
        }
    }

}

fun exploreFilter(courseList: MutableList<Course>, predicate:(Course)->Boolean){
    val filteredCourses = courseList.filter { predicate.invoke(it)} //use predicate
        .forEach{ println("Courses $it" )}//usage with lambda
}

fun exploreMap(courseList: MutableList<Course>, predicate:(Course)->Boolean){
    val courses = courseList //pipeline called
        .filter(predicate) //usage without lambda
        .map{"${it.name} - ${it.category}"} //all courses with name

    println(courses)
}

//map transformer every element and filter removes elements that dont belong
