package Ejercicio4

class Socio ( nombre: String , antiguedad: Int ){

    var nombre:String=""
    var antiguedad:Int =0

    constructor():this("",0){

    }

    fun socio(){
         println("Ingrese su nombre")
         nombre = readln()

         println("Ingrese la antiguedad")
         antiguedad = readln().toInt()
    }
    fun  respuesta(){
        println("Nombre : $nombre")
        println("Anitguedad : $antiguedad AC")
    }
}