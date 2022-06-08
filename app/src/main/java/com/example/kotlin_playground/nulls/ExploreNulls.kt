package com.example.kotlin_playground.nulls

data class Movie(val id: Int?, val name:String)

fun main(){
    var nameNullabble:String? = null //? means can be null
    //nameNullabble = "Matthew"
    println(nameNullabble?.length) //save operator, not needed if value is not null

    val length = nameNullabble?.length?: 0 //default value ?:

    val movie = Movie(null, "Avengers")
    //var name: String = null //cannot be assigned
    val savedMovie = saveMovie(movie)
    savedMovie.id!! //never be null !!
    println(savedMovie)
    //printName(nameNullabble!!)
    nameNullabble?.run { printName(this) } // with run handle nullable
}

fun printName(name:String){
    println("Name is: $name")
}

fun printNameOther(name:String?){ //work with nullable and non nullable
    println("Name is: $name")
}

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id = 1)
    //return movie throw null pointer
}