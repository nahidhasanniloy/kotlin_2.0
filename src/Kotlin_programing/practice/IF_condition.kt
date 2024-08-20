package Kotlin_programing.practice



//  create result sheet using kotlin
fun main (){

    val result:Int = 33
    if ( result<33){

        println( " You are fail..")
    }
    else if (result>=33 && result<=50){
        println( " You are passed..!")

    }
    else if (result>50 && result<=70){
        println(" You got : B+")
    }
    else if (result<70 && result>=80){
        println(" you got : Gpa 5 ")
    }
    else {
        println(" Invalid Number ..!")
    }

}