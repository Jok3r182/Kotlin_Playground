package com.example.kotlin_playground.interfaces

import com.example.kotlin_playground.classes.Course

interface CourseRepository { //when you need to have same functionality and use it among classes, multiple interfaces possible
    val isCoursePersisted: Boolean
    fun getById(id:Int): Course //you have to create separate package for interfaces
    fun save(course: Course): Int{
        println(course)
        return course.id
    }
}

class SqlCourseRepository : CourseRepository{
    override var isCoursePersisted: Boolean = false
    override fun getById(id: Int): Course {
        return Course(id, "Reactive programming!", "Matt")
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true
        return course.id
    }
}

class NoSqlCourseRepository : CourseRepository{
    override var isCoursePersisted: Boolean = false
    override fun save(course: Course): Int {
        return course.id
    }

    override fun getById(id: Int): Course {
        TODO("Not yet implemented")
    }
}

interface A{

    fun doSomething(){
        println("do something in A")
    }

}

interface B{

    fun doSomething(){
        println("do something in B")
    }

}


class AB: A, B{
    override fun doSomething() {
        super<A>.doSomething() //by choosing a type you invoke A or B by putting a type in the brackets
        super<B>.doSomething()
        println("do something AB")
    }
}

fun main(){
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(1)
    println(sqlCourseRepository.save(course))
    val ab = AB()
    ab.doSomething()
    println(sqlCourseRepository.isCoursePersisted)
}