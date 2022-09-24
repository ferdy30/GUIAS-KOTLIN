package Ejercicio3
import kotlin.math.*
class Hijos {

    val edades = ArrayList<Int>()

    fun cargar() {

        for (i in 0 .. 4) {
            println("Ingrese la edad de la persona ${edades.size+1}")
            var edad =readln().toInt()
            edades.add(edad)
        }
        println(edades)
    }
    fun mayor(){

        var max = edades
        println("la mayor de edad tiene:"+ max.max())
    }
    fun promedio(){
        var promedio = (edades.sum())/5
        println("El promedio de edades es de $promedio")
    }
}