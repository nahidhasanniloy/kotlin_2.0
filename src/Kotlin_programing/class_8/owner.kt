package Kotlin_programing.class_8
fun main (){

    val student = Student("Jibon",33,5.5,"dadekvai08@gmail.com")
    student.getallInfo()

    val info  =class_use_perameter()
    println(info)





}

abstract class human (){

    abstract fun Getname(name: String)
    abstract fun getage(age: Int)
    abstract fun getheight(height: Double)
    abstract fun getemail(email: String?)

}


open class worker(name:String, age:Int, height:Double, email:String?=null):human(){
    val namelcl:String = name
    val agelcl:Int = age
    val heightlcl:Double=height
    val emailcl :String? = email

    override fun Getname(name: String) {
        println(" Name :$namelcl")
    }

    override fun getage(age: Int) {
        println(" age :$agelcl")
    }

    override fun getheight(height: Double) {
        println("height:$heightlcl")
    }

    override fun getemail(email: String?) {
        println("Email:$emailcl")
    }

    interface getsalary{
            val salary:Int
                get() = 33
        fun infsalary(){

            println(" Your salary is :$salary")
        }

    }


}
class Student(name:String,age: Int,height: Double,email: String?=null):worker(name,age,height,email),worker.getsalary{
   fun getallInfo(){
       println("Your Name :  $namelcl, Your age : $agelcl")
       println(heightlcl)
       println(emailcl)
       infsalary()

   }



    override fun getemail(email: String?) {
        super.getemail(email)
    }

    override fun getheight(height: Double) {
        super.getheight(height)
    }

    override fun getage(age: Int) {
        super.getage(age)
    }

    override fun Getname(name: String) {
        super.Getname(name)
    }

}





