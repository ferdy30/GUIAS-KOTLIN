package Conversion

import kotlin.system.exitProcess

class CelsiusAF {


    fun celsius(){
        println("Ingrese los grados celsius a convertir")
        val celsius = readln().toFloat()
        val fahren = (celsius*1.8000)+32
        println("El resultado de la conversion da : $fahren grados fahrenheit")


    }
}