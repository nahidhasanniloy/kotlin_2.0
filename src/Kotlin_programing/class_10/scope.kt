package Kotlin_programing.class_10

class  id(name: String,Age : Int){
    val namelcl = name
    val agelcl =Age

}
fun main (){
    id(" jakir",55).let{
        println(it.namelcl)
    }
    id(" jakir",55).also{
        println(it.namelcl)
    }
    id(" jakir",55).run{
        println(this.namelcl)
    }
    id(" jakir",55).apply{
        println(this.namelcl)
    }

    with(id("sumaiya  ",22)){
        println( " Your name is : $namelcl")
    }
}


