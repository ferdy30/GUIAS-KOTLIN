package Conversion

import kotlin.system.exitProcess

class ColonesAD {



    fun conversionColones(){

         println("Ingrese la cantidad de colones a ser convertidos")
         val colones = readln().toFloat()

         val dolares = 0.16*colones

         println("la conversion es de: $$dolares dolares")

     }
}
