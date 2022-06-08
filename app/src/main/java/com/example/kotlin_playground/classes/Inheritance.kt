package com.example.kotlin_playground.classes

open class User(val name: String){ //open gives inheritance only one class can be extended, != : user, student

    open fun login(){
        println("Inside user login!")
    }

    private fun secret(){ //can be only accessed within class range
        println("Inside user login!")
    }

    protected open fun logout(){ //can be only accessed within subclass and class
        println("Inside user logout!")
    }

}

class Student(name: String) : User(name) {
    override fun login() { //algo works with variables override
        println("Inside student login!")
        super.login() //super class login
    }

    public override fun logout(){ //public by default
        super.logout()
    }

    companion object{ //same as static in JAVA
        const val noCourses = 10
        fun coutry() = "Lithuania"
    }

}
class Instructor(name: String): User(name)

fun main()
{
    val student = Student("Alex")
    val instructor = Instructor("Matthew")
    student.login()
    instructor.login()
    Student.coutry()
    println(Student.noCourses)
    val user = User("Matt")
    student.logout()
}
