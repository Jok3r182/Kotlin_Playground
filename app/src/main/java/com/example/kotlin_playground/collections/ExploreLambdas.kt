package com.example.kotlin_playground.collections

fun calculate(x:Int, y:Int, op: (x:Int, y:Int)->Int):Int{//high order function, function that accepts other function
    return op(x, y)
}


fun main(){

    val addLambda = {x:Int -> print(x+x)}
    addLambda(5)
    val multiplyLambda = { x:Int, y:Int ->
        println("\tx*y")
        x*y
    }
    multiplyLambda(5, 3)
    val result = calculate(2, 3) { a, b -> a * b } //you can pass a behaviour
    println(result)
}