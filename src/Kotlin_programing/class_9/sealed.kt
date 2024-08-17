package Kotlin_programing.class_8

fun main (){
    LoaDing(DataLoad.SuccessFully())
    LoaDing(DataLoad.Error())

}
fun LoaDing (a:DataLoad){

     when (a){

        is DataLoad.Error -> {
                println(" You have some error")
          }

        is DataLoad.Load -> {
            println(" Is LOADING ")
        }

        is DataLoad.SuccessFully -> {

            println(" Successfully Loading complete")
        }

         else -> { println( " Null ") }
        }



}

sealed class DataLoad{
    class Load:DataLoad()
    class Error :DataLoad()
    class SuccessFully :DataLoad()

}