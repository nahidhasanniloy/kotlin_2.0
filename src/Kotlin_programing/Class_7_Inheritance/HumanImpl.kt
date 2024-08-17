package Kotlin_programing.Class_7_Inheritance

import Class_7_Inheritance.Human

open class HumanImpl ( name: String,age:Int,email:String?=null,occupation: String?=null):Human(){


        val namelcl: String = name
        val agelcl: Int = age
        val emaillcl:String? = email
        val occupationlcl :String? = occupation

    override fun getInfo(name: String, age: Int) {
        println(" Name  is : $namelcl,Age is : $agelcl ")
    }

    override fun getBloodGroup(BloodGroup: String) {
        println(" Your Blood group is : $BloodGroup")
    }

    override fun getoccupation(occupation: String) {
        println(" Your occupation is : $occupationlcl")
    }

}