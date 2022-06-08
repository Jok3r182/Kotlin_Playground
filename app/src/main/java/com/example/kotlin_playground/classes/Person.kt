package com.example.kotlin_playground.classes

class Person(val name: String = "John", val age: Int = 0) { //constructor, mandatory fields

    var email: String = ""
    var nameSize: Int = 0
    init {
        println("Person created!") // what to do when obj is created
        nameSize = name.length
    }

    constructor(_email:String, _name: String, _age: Int): this(_name, _age){ //different ways to init class
        email = _email
    }

    constructor(_email:String): this(){ //different ways to init class
        email = _email
    }

    fun action(){
        println("Person $name walks")
    }

}

fun main(){
    val person = Person(age = 22)
    val personOther = Person(_email = "@gmail.com", _name = "Matas", 25)
    val email = Person(_email = "@gmail.com")
    println(personOther.email)
    person.action()

}