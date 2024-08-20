package Kotlin_programing.class_10


fun main (){


    val name :String = " ADNAN NAHID "
    println(name.allcaps())
    println(name.allCaps())

    val adnan =Uppercase("Hey dear ")
    println( adnan.data())
    println(adnan.data2())


}
fun String.allcaps():String{
    return " UPPERCASE :  ${this.uppercase()},LOWERCASE  : ${this.lowercase()}"

}


fun String.allCaps():String{
    return "${this.uppercase()}"


}



class Uppercase( val str : String){

    fun data() : String{

        return "${str.uppercase()}"
    }
    fun data2():String{
        return " ${str.lowercase()}"
    }


}

















//PRACTICE


//
//    val Alphabet = alphabet(" hey adnan ")
//    println(Alphabet.bigdata())
//    println(Alphabet.smalldata())



//class alphabet( val str: String){
//
//
//    fun bigdata():String{
//         return  str.uppercase()
//
//    }
//    fun smalldata():String{
//        return  str.lowercase()
//
//    }
//
//
//
//}




// extended
//
//fun main (){
//
//val alphabet = Alphabet("welcome to bangladesh ...")
//    println( alphabet.Allcaps())
//    println( alphabet.alsmall())
//    val name:String = "My name is adnan"
//    println(name.Allcaps())
//
//
//}
//fun String.Allcaps():String{
//    return " This is Uppercase : ${this.uppercase()}, This is Lowercase :${this.lowercase()}"
//
//}
//
//class Alphabet( val str :String){
//    fun Allcaps():String{
//        return str.uppercase()
//
//    }
//    fun alsmall() :String{
//        return str.lowercase()
//
//    }
//
//
//
//}

