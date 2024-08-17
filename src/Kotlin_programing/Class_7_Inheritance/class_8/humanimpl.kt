package Kotlin_programing.Class_7_Inheritance.class_8

open class HumanImpl(name:String, roll:Int, bloodGroup:String, email:String?=null):human() {
    val namelcl: String = name
    val rolllcl: Int = roll
    val bloodGrouplcl: String = bloodGroup
    val emailLcl: String? = email


    override fun getinfo() {

        println(" Your name is : $namelcl")

    }

    override fun getblood() {
        println(" Your Roll is : $rolllcl")
    }

    override fun getoccupation() {
        println(" Your blood Group bis : $bloodGrouplcl")
    }

    override fun getemail() {
        println(" Your email is : $emailLcl")

    }
}

