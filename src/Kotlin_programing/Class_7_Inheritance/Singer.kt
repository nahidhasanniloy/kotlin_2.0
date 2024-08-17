package Class_7_Inheritance

import Kotlin_programing.Class_7_Inheritance.HumanImpl

class Singer (name:String,age:Int, val Brandname:String): HumanImpl(name,age) {

    fun infoB() {
        println( "The brand name is : $Brandname")

    }
}

//val namelc = name
//val agelc = age
//val brandlc= Brandname
//
//fun info(){
//
//    println( " Name is : $namelc, Age is :$agelc, brandname is :$brandlc")
//}
