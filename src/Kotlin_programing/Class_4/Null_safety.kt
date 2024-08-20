package Kotlin_programing.Class_4

fun  main(){

    val name : String = "Adnan nahid"
    println(name.length) // Out put - 11

    var sala : String = " shala "
    println( sala.length)

    // Nullable type
    var nullableString: String? = "Hello"
    nullableString = null
    println(nullableString?:"Invalid This")


    var adnan :String? = " hey"
    adnan = null
    println( adnan?:" Invalid")

    // Safe call

    var age :Int? = null
    println( age?:"Invalid Age ")

    //another
    val length: Int? = nullableString?.length
    println("Length: $length")  // Prints null


    // Elvis operator
    val lengthOrZero: Int = nullableString?.length ?: 0
    println("Length or Zero: $lengthOrZero")  // Prints 0


}