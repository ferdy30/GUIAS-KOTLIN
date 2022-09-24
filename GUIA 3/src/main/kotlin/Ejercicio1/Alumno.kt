package Ejercicio1

class Alumno (var nombre: String = "") {
    fun nombre(){

        println("Ingrese su nombre: ")
       var nombre = readln()

        println("Estimado $nombre")

    }


    fun nota(){
       println("Ingrese su nota")
       val nota = readln().toInt()
       this.nombre()
       if(nota >= 4){

           println("Su nota es regular")
       }else{
           println("Su nota no es regular")
       }

    }
}