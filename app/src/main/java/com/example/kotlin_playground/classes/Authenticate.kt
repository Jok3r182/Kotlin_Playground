package com.example.kotlin_playground.classes

object Authenticate { //object singleton, called once, 1 instance

    fun authenticate(username:String, password: String)
    {
        println("User $username authenticated!")
    }

}

fun main(){
    Authenticate.authenticate("Matas", "123")
}