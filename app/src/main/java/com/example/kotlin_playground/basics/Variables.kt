import com.example.kotlin_playground.functions.courseName

fun main(){

    val name : String = "Matas"
    println(name)

    //type galime nurodyti gale
    val salary = 30000L
    println("String interpolation: $salary")

    val multiline = """
        ABC
        DEF
    """.trimIndent()
    println(multiline)
    println(courseName)
}