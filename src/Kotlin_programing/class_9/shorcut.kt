package Kotlin_programing.class_9
fun main (){

    val InfoHere = object {

          fun info (){

              val height :Double = 5.6
              println( " Your height is : $height")
          }
      }
    println( InfoHere.info())

    val Into = object {

        fun information(){

            val age: Int= 77
            println(" Your age is : $age")
        }
    }
    println(Into.information())

}


