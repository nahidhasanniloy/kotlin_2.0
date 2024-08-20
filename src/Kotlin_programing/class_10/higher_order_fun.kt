package Kotlin_programing.class_10

import javax.swing.text.View

fun main (){
   hello({heyfun(" Asif",22)},{ hellobangladesh(2.0,"Zero") },5.5," AB+")

}
fun heyfun ( name: String, AGE :Int){
    println( "your name  is :$name , Your age is :$AGE")

}
fun  hellobangladesh (version:Double,point:String){
    println(" Welcome tO Bangladesh $version")

}

fun hello( view:()-> Unit,view2: () -> Unit, height :Double, grop :String){
    view()
    view2()
    println("Your height : $height, Your group :$grop")

}



//fun main(){
//
//    show ({ hey("adnan",22)},2.3,"A+",)
//
//}
// fun hey(name :String,age:Int){
//                println( " Your Name : $name , Your age : $age")
//            }
//
//        fun show(view:() -> Unit,height:Double,blooodGroup :String){
//            view()
//            println( "Your Height :$height, Your blood Group : $blooodGroup")
//        }
//
//


















//
//fun main (){
//    val no = 33
//    val result = operateOnNumber(no, ::String)
//    println( " Your result is : $result")
//
//
//}
//
//fun String(x: Int): Int{
//    return x * 4
//
//}
//fun operateOnNumber(x: Int, operation: (Int) -> Int): Int{
//    return operation(x)
//
//}
//

