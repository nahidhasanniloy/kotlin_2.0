package Class_5


fun main() {


    val age = 19
    // Listof
//    var ages : List<Int> = listOf(1,2,3,4,5,6,7,8)
//     ages.add is not working thas why we chose another way
//    var ages = mutableListOf(1,2,3,4,"Adnan","Nahid ")
//
//    ages.add(0,10)
//
//    println(ages)
//


               // Setof

//    var ages = setOf(1,3,4,5,5,6,7,8,8,8,9,0,0,0)
//    var ages = mutableSetOf(1,3,4,5,5,6,7,8,8,8,9,0,0,0)
//
//    println(ages)


                       //mapoff

    var ages = mapOf(1 to 10, 20 to 40, 70 to 90, "adnan" to "nahid")
//    println("${ages.get("adnan")}")
    println(ages["adnan"])

    var an = mutableMapOf(20 to 90 ,  "jibon" to "moron")
//    an["jibon"] = 4
    an.put("adnan" , 2)
    println(an)


                       //listof

    var hey = listOf(1,2,3,4,5,6,7,8,9,0,"10")
//    var hey : List<Int> = listOf(1,2,3,4,5,6,7,8,9,0,"10")

    println(hey)

//        var hlw = listOf(1,3,4,5,6,7,-2,-3,-22,-22,-33,-43)
//        val hellois =hlw.filter { Y ->  Y < 0 }
//        println(" The nagetive value is : $hellois" )


//var height = listOf(21,22,33,43,54,44)
//   val An = height.map { it ->
//        it*10
//
//    }
// println( "the value is : $An")
//


    var height = listOf(21,22,33,43,54,44)
        height.map { x ->

        println( "the value is : $x")

        }
  









}