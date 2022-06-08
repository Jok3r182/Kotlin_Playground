package com.example.kotlin_playground.basics

fun main(){
    label()
    println()
    for (i in 1..5){
        println(i)
        if (i == 2) break
    }

}

fun label(){
    loop@for (i in 1..5){
        println("i:$i")
        //if (i == 2) break@loop
        innerloop@for (j in 1..5){
            //if(j==2) break@innerloop
            println("j:$j")
            if(j==2) continue@loop //tsg sustosime ir tesime i
        }

        }
    }
