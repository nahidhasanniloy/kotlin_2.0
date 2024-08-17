package Kotlin_programing.class_8.inner

fun main (){
val inner= innnerClass().getData()
    inner.view()

    val innner =innermain().getdaata()
    innner.vieew()

    val adnnna = adnan().getboss()
    adnnna.vieeew()

    val zinna = zinan().getinfo()
    zinna.getdataall()

}

class innnerClass{
    val name:String = " adnan "
   inner class getData{
       fun view(){
           println("Hey adnan , how are you ")

       }
   }


}
/// inner class practice 2
class innermain{

    val age:Int
        get() = 33
    inner class getdaata{
        fun vieew(){
            println(" hello world ")

        }
    }
}

// practice 3
// how can i declare inner class

class adnan {

    val text: String = " hey adnan "
    inner class getboss(){
        fun  vieeew(){
            println(" adnan nahid hasan niloy ")
        }

    }


}


class zinan {

    val age : Int = 33
    inner class getinfo{
        fun getdataall(){

            println( " hey world ")
        }
    }
}






