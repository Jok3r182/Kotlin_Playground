package com.example.kotlin_playground.classes

data class Employee(val id: Int, val name: String) {

}

fun main(){
    val emp1 = Employee(1, "Matas")
    println(emp1)
    val emp2 = emp1.copy()
    println(emp1 == emp2)
    val emp3 = emp1.copy(id = 2)
    println(emp3)
}