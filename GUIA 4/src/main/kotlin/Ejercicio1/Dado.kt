package Ejercicio1

import kotlin.random.Random

class Dado {

    var x = Random.nextInt(1, 6)

    fun imprimir(){
       println("El Numero aleatorio es: $x")
    }
}