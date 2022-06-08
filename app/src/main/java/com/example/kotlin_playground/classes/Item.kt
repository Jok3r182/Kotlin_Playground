package com.example.kotlin_playground.classes

class Item() {
    var name: String = ""
    constructor(_name: String): this() {
         name = _name
    }



}

fun main(){
    val item = Item("Iphone")
}