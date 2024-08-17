package Kotlin_programing.Class_7_Inheritance.class_8

class student (name:String,roll:Int,bloodGroup:String,email:String?=null):HumanImpl(name,roll,bloodGroup,email){


    fun getallinfo(){
        getinfo()
        getblood()
        getoccupation()
        getemail()




    }



    override fun getinfo() {
        super.getinfo()
    }

    override fun getblood() {
        super.getblood()
    }

    override fun getoccupation() {
        super.getoccupation()
    }

    override fun getemail() {
        super.getemail()
    }


}