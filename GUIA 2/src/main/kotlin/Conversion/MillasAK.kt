package Conversion

import kotlin.system.exitProcess

class MillasAK {


    fun millas(){
        println("ingrese el valor de las millas a convertir")
        val millas = readln().toInt()
        val kilometros = 1.60

        println("El resultado de la conversion da :"+millas*kilometros+" Kilometros")


    }
}