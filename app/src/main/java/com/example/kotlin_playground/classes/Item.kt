package com.example.kotlin_playground.classes

class Item() {
    var name: String = ""
        get() {
            println("Name")
            return field
        }

    var price: Double = 0.0 //getter custom
        get() {
            println("Price")
            return field
        }
        set(value: Double){//setter
            if (value == 0.0){
            field = value}
        }

    constructor(_name: String): this() {
         name = _name
    }



}

fun main(){
    val item = Item("Iphone")
    item.price
}