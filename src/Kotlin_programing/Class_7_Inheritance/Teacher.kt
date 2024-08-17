package Class_7_Inheritance

import Kotlin_programing.Class_7_Inheritance.HumanImpl

class Teacher( name: String,age:Int,Email:String,occupation: String):HumanImpl(name,age,Email,occupation){

  fun getallinfo(){
      getInfo(namelcl,agelcl)
      getBloodGroup("A+")
      getoccupation(occupationlcl!!)
  }

    override fun getInfo(name: String, age: Int) {
        super.getInfo(name, age)
    }

    override fun getBloodGroup(BloodGroup: String) {
        super.getBloodGroup(BloodGroup)
    }

    override fun getoccupation(occupation: String) {
        super.getoccupation(occupation)
    }




//   public override fun information() {
//        super.information()
//    }

}